//importing utility classes
import java.util.*;

public class P2{
	public static void main(String args []){
		int numbersEntered, num, oddNumCounter, evenNumCounter;
		oddNumCounter = evenNumCounter = 0;
		int [] values; //Array

		//Creating a scanner object
		Scanner sc = new Scanner(System.in);
		//Asking user for input 
		System.out.println("How many numbers must be entered: ");
		//Captures user input
		numbersEntered = sc.nextInt();

		//List to store values given by user
		List <Integer> ValuesList = new ArrayList <Integer> (); 

		for (int i = 1; i <= numbersEntered; i++ ){
			System.out.println("Enter value " + i);
			//Captures user input 
			num = sc.nextInt();
			//Adds user value into <List>
			ValuesList.add(num);
		}
		
		//for loop goes through values in <List>
		for (int i: ValuesList){
			//if number has a remainder == 0 it is even,
			//if not then it is odd
			if (i % 2 == 0){
				evenNumCounter++;
			}
			else {
				oddNumCounter++;
			}
		}
		System.out.println("The number of odd numbers in the series: " + oddNumCounter);
        System.out.println("The number of even numbers in the series: " + evenNumCounter);
	}
}