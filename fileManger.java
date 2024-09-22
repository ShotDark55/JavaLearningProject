package javaLearn;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileManger {
	
		static final String path = 
				"C:/Users/Oussama/Desktop/";
		static Scanner scanner =new Scanner(System.in);
		
	public static void main(String[] args) {
		
		boolean isRun = true;
		String ask;
		
		while (isRun) {
			System.out.println("\nread or write or exit: "); 
			ask = scanner.nextLine();
			if (ask.equals("read")) {
				try {
					
					int c ;
					String filename;
					char alpha;
					System.out.println("enter your filename : ");
					filename = scanner.nextLine();
					
					FileReader reader = new FileReader(path+filename);
					
					while ( (c=reader.read()) != -1 ) {
						alpha = (char) c;
						System.out.print(alpha);
					}
					
					reader.close();
					System.out.println();
					
				}catch(IOException io) {
					
					System.out.println(io.toString());
				}
			}else if(ask.equals("write")) {
				
				System.out.println("enter filename : ");
				
				try {
					String filename = scanner.nextLine();
					String data;
					FileWriter writer = new FileWriter(path + filename);
					
					System.out.println("enter your data : ");
					data = scanner.nextLine();
					
					writer.write(data);
					writer.close();
					
				}catch(IOException io) {
					System.out.println(io.toString());
				}
				
			}else if(ask.equals("exit") || ask.equals("quit")) {
				System.out.println("file manger shtudown!");
				isRun = false;
			}
		}
		
		
		
	}


	
	
	
}

	
	
	
