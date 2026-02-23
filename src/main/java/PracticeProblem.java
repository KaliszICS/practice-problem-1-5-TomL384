import java.util.Scanner;

/**
	* File: Lesson 1.5: Characters
	* Author: Tom Leung
	* Date Created: February 22, 2026
	* Date Last Modified: February 22, 2026
	*/

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		char a;
		a = 'a';
		System.out.println(a);
	}

	public static void q2() {
		//Write question 2 code here
		String a;
		char b;
		Scanner ip = new Scanner ( System.in);
		System.out.print("Input a word: ");
		a = ip.nextLine();
		b = a.charAt(2);
		System.out.println(b);
		
	}

	public static void q3() {
		//Write question 3 code here
		String a;
		char b;
		Scanner ip = new Scanner ( System.in);
		System.out.print("Input a word: ");
		a = ip.nextLine();
		b = a.charAt(1);
		System.out.println("The second character user entered was: " + b);
	}

	public static void q4() {
		//Write question 4 code here
	    int a;
		int b;
		Scanner ip = new Scanner ( System.in);
		System.out.print("Input a number: ");
		a = ip.nextInt();
		ip.nextLine();
		b = a + 1;
		System.out.println("Your number plus 1 is: " + b);
	}

	public static void q5() {
		//Write question 5 code here
		String a;
		char b;
		String c;
		char d;
		Scanner ip = new Scanner ( System.in);
		System.out.print("Input a letter: ");
		a = ip.nextLine();
		b = a.charAt(0) ;
		System.out.print("Input another letter: ");
		c = ip.nextLine();
		d = c.charAt(0) ;
		System.out.println(d + b);
	}

}
