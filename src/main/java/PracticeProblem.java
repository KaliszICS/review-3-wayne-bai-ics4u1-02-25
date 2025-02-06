import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner receiver = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(receiver.nextLine().charAt(0));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner receiver = new Scanner(System.in);
		System.out.print("In: ");
		boolean input = receiver.nextBoolean();
		receiver.nextLine();
		System.out.println(!input);

	}

	public static void q3() {
		//Write question 3 code here
		Scanner receiver = new Scanner(System.in);
		System.out.print("In: ");
		int input = receiver.nextInt();
		receiver.nextLine();
		System.out.println(input > 5);

	}

	public static void q4() {
		//Write question 4 code here
		Scanner receiver = new Scanner(System.in);
		System.out.print("In: ");
		double input = receiver.nextDouble();
		receiver.nextLine();
		System.out.println(input <= 2.0 && input >= -2.0);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner receiver = new Scanner(System.in);
		System.out.print("In: ");
		String input = receiver.nextLine();
		System.out.println(input.equals("Hello World"));
	}

	public static void q6() {
		//Write question 6 code here
		Scanner receiver = new Scanner(System.in);
		System.out.print("In: In: ");
		int input1 = receiver.nextInt();
		receiver.nextLine();
		int input2 = receiver.nextInt();
		receiver.nextLine();
		System.out.println(input1 <= input2);

	}

	public static void q7() {
		//Write question 7 code here
		Scanner receiver = new Scanner(System.in);
		System.out.print("In: In: ");
		double input1 = receiver.nextDouble();
		receiver.nextLine();
		double input2 = receiver.nextDouble();
		receiver.nextLine();
		System.out.println(input1 > input2);
	}

}
/*
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18066599)
# Instructions  

  ## Questions
  1. Get a string using "In: " as the prompt.  Output the first character of the string.
  2. Get a boolean using "In: " as the prompt.  Output the opposite boolean.
  3. Get an integer using "In: " as the prompt.  Output true if the number is greater than 5.  False otherwise.
  4. Get a double using "In: " as the prompt. Output true if the number is between -2 and 2 (inclusive).  False otherwise.
  5. Get a String using "In: " as the prompt.  Output true if the string is "Hello World".  False otherwise
  6. Get 2 integers using "In: " as the prompt.  Output true if the first integer is less than or equal to the second.  False otherwise.
  7. Get 2 doubles using "In: " as the prompt.  Output true if the first integer is greater than the second.  False otherwise.
*/