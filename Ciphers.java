
//Cristian Benitez// Program assignment 1//SP CPSC 21000 program fundamentals //Spring Semester 
import java.util.Random;import java.util.Scanner;
public class Ciphers {
	public static void main(String[] args) {		// TODO Auto-generated method stub
		
		int[] number = new int[5]; // giving a variable int = 5
		int plainText = 0, key = 0, digit, encode = 0, multiply = 0; // this java notation is to make the method accept	a variable amount which is 0
		
		Random rand = new Random(); // This creates a rand object of class Random.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers between 0-19, with spaces: ");
		
		for (int i = 0; i < 5; i++) { // this is a loop that states if "i" is smaller than 5 then it will keep going until it has been reached which is the "5" numbers
			number[i] = input.nextInt(); // the five numbers will be input in the next several lines and returns the rest of the current line, excluding any line separator at the end.
			if (number[i] < 0 || number[i] > 19) { // this is a loop that states the number range 0-19, and if a number greater that 19 is input then it is false
				System.out.println("Please read directions and try again! "); // prints if a number greater than 19 is	entered
				System.exit(0);
			}
			plainText = plainText + number[i]; // this will hold the sum value of the number given add all together to be my plain text
		}
		
		key = 0 + rand.nextInt((9 - 0) + 1); // this will generate a random numbers for computation
		System.out.println("Plain Text is: " + plainText); // computational number of the value of plain text plus number
		System.out.println("Key is: " + key); // the rand import will be used which will be my key value
		
		if (plainText != 0) { // this will test as false as a conditional
			digit = (plainText % 10); // the digit will hold the new value
			multiply = 10 * multiply + (digit + key); // multiple will hold a new value
			plainText = plainText / 10; // plain text has a new value
		}
		if (multiply != 0) { // this will be false conditional
			digit = (multiply % 10); // this will hold a new value
			encode = 10 * encode + (digit); // encode will hold a new value based on computation and values given
			multiply = multiply / 10; // the last updated value for multiply
		}
		System.out.println("Encoded Message: : " + encode); // this will give my final encode message and will be printed out
		System.out.println("This was intense!"); // This was tough project but I did it! took me about 2 days to complete this assignmentand some additional supplementary videos on caesar													// cipher
	}
}

