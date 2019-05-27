package MinMax;

import java.util.Scanner;

//This program reads 5 numbers from the keyboard and afterwards it displays the lowest and highest number of the entered numbers.

class FindMinMaxInList{
	public static void main(String[] args) {
		System.out.println("Please enter 5 numbers: ");
		
		Scanner scan = new Scanner(System.in); 
		
		int minimum;
		int maximum;
		
		int[]list = new int[5]; //List with 5 elements
		
		for (int i=0; i<5; i++) { //Fill the list with elements
			list[i] = scan.nextInt(); //Reads numbers from the keyboard
		}
		
		maximum = list[0]; //start searching for max/min at index 0
		minimum = list[0];
		
		for(int i=0; i<list.length; i++) {//searches the list
			if(list[i] < minimum) {//searches for lowest number in the list
				minimum = list[i];
			}
			if(list[i] > maximum) {//searches for the highest number in the list
				maximum = list[i];
			}
	}
	System.out.println("Smallest number: "+minimum+" and highest number: "+maximum);//displays minimum and maximum number
	}
}
