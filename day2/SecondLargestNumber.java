package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {


int[] numbers = {10,20,50,40,5,55,22,35,100,75,46,95,98,85};
		
		Arrays.sort(numbers);

		int length = numbers.length;
		
		System.out.print("The Second Largest Number in the Array is "+numbers[length-2]);
	}

}
