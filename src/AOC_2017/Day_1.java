package AOC_2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day_1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("AOC_2017_Input/Day1.txt"));
		String input = file.nextLine();
		int total = 0;
		System.out.println(input);
		/**
		 * Part One
		 * for(int i = 0; i< input.length(); i++){
			if (input.charAt(i) == input.charAt(((i+1)%input.length()))){
				total += Character.getNumericValue(input.charAt(i));
			}
		System.out.println(total);
				
		}**/
		// Part Two
		for(int i = 0; i< input.length(); i++){
			if (input.charAt(i) == input.charAt(((i+(input.length()/2))%input.length()))){
				total += Character.getNumericValue(input.charAt(i));
			}
		System.out.println(total);
				
		}
		
		
	}

}
