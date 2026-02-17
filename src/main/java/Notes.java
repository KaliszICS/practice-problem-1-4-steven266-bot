/**
	* Lesson: Input
	* Author: Mr. Kalisz
	* Date Created: February 9, 2023
	* Date Last Modified: February 9, 2023
	*/

import java.util.Scanner; //This allows to create a Scanner

class Notes {
	public static void main(String args[]) {

		//In Order to get input, we need to create a Scanner first
		//Scanner

		Scanner input = new Scanner(System.in);
		//input is just a variable name, you can name this whatever you want
		//The rest of the line must be written exactly as is in order to create a Scanner.

		//get input

		//These are the functions that allow us to get input
		// input.nextInt(); //Integers
		// input.nextDouble(); //Doubles
		// input.nextLine(); //Strings


		//In order to properly use input.  We need to save it

		int num;
		//Before very input line, you should have a prompt
		System.out.print("Input a number: ");
		num = input.nextInt();
		input.nextLine(); //clear the scanner of \n
		System.out.println(num);

		double num2;
		//Before very input line, you should have a prompt
		System.out.print("Input a fractional number: ");
		num2 = input.nextDouble();
		input.nextLine(); //clear the scanner
		num2 = num2 + 5;
		System.out.println(num2);

		//Strings


		//When using nextLine to get a string, IF we have used nextInt or nextDouble before nextLine again, we need to clear the scanner
		

		String word;
		System.out.print("Input a word: ");
		word = input.nextLine();
		System.out.println(word);

		//combining strings and ints and doubles
		//3, 5.5 -> 10.5, Hello
		System.out.println(word + num + num2);//Hello310.5
		System.out.println(num + num2 + word);//13.5Hello
		System.out.println(num + word + num2);//3Hello10.5
		System.out.println(num2 + word + num);//10.5Hello3
		System.out.println(num2 + num + word);//13.5Hello
		System.out.println(word + (num2 + num));//Hello13.5

		// System.out.println(word + num - num2); //breaks it cause we tried to subtract from a string
		System.out.println(word + num * num2); //This is fine becuase multiplication happens first due to Order of Operations.
		

  
	}
}
