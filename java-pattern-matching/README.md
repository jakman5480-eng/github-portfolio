Java KMP Pattern Matching

Project Overview

This project is a Java console application developed for COSC 2336 – Data Structures at Lamar University.

The application implements the Knuth–Morris–Pratt (KMP) string-matching algorithm to determine whether a smaller string appears within a larger string.

Features

Accepts two strings entered by the user.

Searches for the second string within the first.

Uses the KMP algorithm for efficient pattern matching.

Builds a Longest Prefix Suffix (LPS) array.

Displays the starting index when a match is found.

Displays "unmatched" when the pattern is not found.

Technologies Used

Java

Eclipse IDE

Java Arrays and String Processing

How to Run

Open the Java source file in Eclipse.

Place the file in the PatternMatchingAydenManuel package.

Run PatternMatchingAydenManuel.java.

Enter the first string.

Enter the substring to search for.

Example

Input:

Enter a string s1: computer science

Enter a string s2: science

Output:

matched at index 9

Algorithm

The program uses the KMP algorithm, which preprocesses the search pattern into an LPS array. This allows the program to avoid unnecessary character comparisons when searching for a substring.

The algorithm has a time complexity of O(n + m), where n is the length of the input text and m is the length of the search pattern.

Future Improvements

Add case-insensitive searching.

Support searching multiple patterns.

Create a graphical user interface.

Add additional test cases and automated testing.
