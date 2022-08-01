/**

How do you identify a great engineer ??  => I think a person who is eager to learn new things,can coordinate well with 
											team and has good logical and analytical skills with creative thinking would 
											be identified as a great engineer.
                                             

*/


/**

INSTRUCTION TO RUN THE PROGRAM : javac SearchEngine.java
                                 java SearchEngine
								 Enter the file path
								 Enter the keyword to be searched

*/
package Assignment;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class SearchEngine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter file path: ");
		String path = input.nextLine();	
		System.out.print("Enter keyword to be searched: ");
		String keyword = input.nextLine();
		File f1 = new File(path);
		String str = "";
		try {
			FileReader fr = new FileReader(f1);	
			int i = 0;
			while ((i = fr.read()) != -1) {
				
				str = str + (char)i;
         
            }
			String[] lines = str.split("\\. ") ;
			System.out.println("Search results: ");
			int count = 0;
			for(int j = 0 ; j < lines.length ; j++) {
				if(lines[j].toLowerCase().indexOf(keyword.toLowerCase()) != -1) {
					System.out.print("  => ");
					System.out.println(lines[j]);
					count++;
				}
			}
			if(count == 0) {
				System.out.print("No results found for the given keyword");
			}
		}		
		catch(IOException e1) {
			
		}
		
	}

}
