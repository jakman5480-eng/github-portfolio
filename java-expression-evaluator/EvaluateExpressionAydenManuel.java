package EvaluateExpressionAydenManuel;
/*
 * Ayden Manuel
 * COSC 2336-01
 * Due 2/25/2026
 * Calculating a math expression as a string and evaluating 
 */
import java.util.Stack;
public class EvaluateExpressionAydenManuel {
public static void main(String[] args) {
java.util.Scanner input = new java.util.Scanner(System.in);
System.out.print("enter the expresion to be evaluated  ");
String expression = input.nextLine();
try {
	 System.out.println(expression + " = " + evaluateExpression(expression));
}
catch (Exception ex) {
System.out.println("wrong expression: " + expression);
}
}
public static int evaluateExpression(String expression) {
Stack<Integer> operandStack = new Stack<>();
Stack<Character> operatorStack = new Stack<>();
expression = insertBlanks(expression);
String[] tokens = expression.split(" ");
for (String token: tokens) {
if (token.length() == 0)
continue; 
else if (token.charAt(0) == '+' || token.charAt(0) == '-') {     
while (!operatorStack.isEmpty() &&
	 (operatorStack.peek() == '+' ||
	  operatorStack.peek() == '-' ||
	  operatorStack.peek() == '*' ||
	  operatorStack.peek() == '/' ||
	  operatorStack.peek() == '%')) {
processAnOperator(operandStack, operatorStack);
}
operatorStack.push(token.charAt(0));
}
else if (token.charAt(0) == '*' || token.charAt(0) == '/' || token.charAt(0) == '%') {	 
while (!operatorStack.isEmpty() &&
	  (operatorStack.peek() == '*' ||
	   operatorStack.peek() == '/' ||
	   operatorStack.peek() == '%')) {
processAnOperator(operandStack, operatorStack);
}
	operatorStack.push(token.charAt(0));
}
else if (token.charAt(0) == '^') {
	operatorStack.push('^');
}
else if (token.trim().charAt(0) == '(') {
	operatorStack.push('('); 
}
else if (token.trim().charAt(0) == ')') {
while (operatorStack.peek() != '(') {
processAnOperator(operandStack, operatorStack);
}
	operatorStack.pop();
}
else {
	operandStack.push(Integer.valueOf(token));
}
}
while (!operatorStack.isEmpty()) {
processAnOperator(operandStack, operatorStack);
}
return operandStack.pop();
}
public static void processAnOperator(
Stack<Integer> operandStack, Stack<Character> operatorStack) {
char op = operatorStack.pop();
int op1 = operandStack.pop();
int op2 = operandStack.pop();
if (op == '+')
	operandStack.push(op2 + op1);
else if (op == '-')
	operandStack.push(op2 - op1);
else if (op == '*')
	operandStack.push(op2 * op1);
else if (op == '/')
	operandStack.push(op2 / op1);
else if (op == '%')
	operandStack.push(op2 % op1);
else if (op == '^')
	operandStack.push((int)Math.pow(op2, op1));
}
public static String insertBlanks(String s) {
String result = "";
for (int i = 0; i < s.length(); i++) {
if (s.charAt(i) == '(' || s.charAt(i) == ')' ||
	s.charAt(i) == '+' || s.charAt(i) == '-' ||
	s.charAt(i) == '*' || s.charAt(i) == '/' ||
 	s.charAt(i) == '%' || s.charAt(i) == '^') {
result += " " + s.charAt(i) + " ";
}
else
result += s.charAt(i);
}
return result;
}
}
