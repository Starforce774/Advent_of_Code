package AOC_2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day_2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("AOC_2017_Input/Day2.txt"));
		
		int total = 0;
		int checkSum = 0;
		/** Part One
		 * while(file.hasNextLine()){
			String input = file.nextLine();
			String[] info = input.split("\t");
			int max = Integer.parseInt(info[0]);
			int  min = Integer.parseInt(info[0]);
			for(int i=0;i< info.length;i++){
				if((Integer.parseInt(info[i])>max)){
					max = Integer.parseInt(info[i]);
				}
				if((Integer.parseInt(info[i])<min)){
					min = Integer.parseInt(info[i]);
				}
			}
			checkSum += (max - min);
		}
		System.out.println(checkSum);**/
		
		// Part Two
		while(file.hasNextLine()){
			String input = file.nextLine();
			String[] info = input.split("\t");
			for(int i = 0; i<info.length; i++){
				for(int n = 0; n<info.length; n++){
					if (Integer.parseInt(info[i])> (Integer.parseInt(info[(i+n)%info.length]))){
						if(((Integer.parseInt(info[i])%(Integer.parseInt(info[(i+n)%info.length]))==0))){
							checkSum += (Integer.parseInt(info[i])/Integer.parseInt(info[(i+n)%info.length]));
						}
					}
				}	
			}
		}
		System.out.println(checkSum);
	}

}
