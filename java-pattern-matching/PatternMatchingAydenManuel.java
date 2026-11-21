/*
 * Ayden Manuel
 * Cosc 2336
 * 3/6/2026
 * prompt user to enter two strings and test whether the second string is substring
 */
package PatternMatchingAydenManuel;
import java.util.Scanner;
public class PatternMatchingAydenManuel {
private static int[] buildLPS(String pattern) {
int m = pattern.length();
int[] lps = new int[m];
int len = 0; 
int i = 1;
while (i < m) {
if (pattern.charAt(i) == pattern.charAt(len)) {
len++;
lps[i] = len;
i++;
    } else {
if (len != 0) {
len = lps[len - 1];
    } else {
lps[i] = 0;
i++;
    }
    }
    }
return lps;
    }
private static int kmpSearch(String text, String pattern) {
int n = text.length();
int m = pattern.length();
if (m == 0) return 0;
if (m > n) return -1;
int[] lps = buildLPS(pattern);
int i = 0; 
int j = 0; 
while (i < n) {
if (text.charAt(i) == pattern.charAt(j)) {
i++;
j++;
if (j == m) {
return i - j; 
	}
    } else {
if (j != 0) {
j = lps[j - 1];
    } else {
i++;
    }
    }
    }
return -1; 
    }
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string s1: ");
String s1 = sc.nextLine();
System.out.print("Enter a string s2: ");
String s2 = sc.nextLine();
int idx = kmpSearch(s1, s2);
if (idx >= 0) {
System.out.println("matched at index " + idx);
    } else {
System.out.println("unmatched");
    }
sc.close();
    }
}
