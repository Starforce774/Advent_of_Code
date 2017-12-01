package AOC_2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day_1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("AOC_2017_Input/Day1.txt"));
		String input = file.nextLine();
		System.out.println(input);
	}

}
