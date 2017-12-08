package AOC_2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day_4 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("AOC_2017_Input/Day4.txt"));
		int numPhrases = 0;
		/* Part One
		 * while(file.hasNextLine()){
			String input = file.nextLine();
			String[] info = input.split(" ");
			//System.out.println(info.length);
			//System.out.println(info);
			int wrong = 0;
			for(int i = 0; i<info.length; i++){
				for(int n = (i+1); n<((info.length)); n++){
					if(info[i].equals(info[n])){
						//System.out.println(info[i]);
						wrong += 1;
					}//else{System.out.println("You suck at this");}
				}
			}
			if(wrong==0){
				numPhrases += 1;
			}
		}System.out.println(numPhrases);*/
		
		while(file.hasNextLine()){
			String input = file.nextLine();
			String[] info = input.split(" ");
			int wrong = 0;
			for(int i = 0; i<info.length; i++){
				for(int n = (i+1); n<((info.length)); n++){
					if((info[i].length())==(info[n].length())){
						char sortArray1[] = info[i].toCharArray();
						char sortArray2[] = info[n].toCharArray();
						Arrays.sort(sortArray1);
						Arrays.sort(sortArray2);
						//String a = String(sortArray1);
						//System.out.println(sortArray1);
						//System.out.println(sortArray2);
						if(Arrays.equals(sortArray1, sortArray2)){
							wrong += 1;
							System.out.println(sortArray1);
							System.out.println(sortArray2);
						}
					}			
				}
			}
			if(wrong==0){
				numPhrases += 1;
			}
		}
		System.out.println(numPhrases);
	}

}
