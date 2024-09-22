package javaLearn;

public class Loop_daigram {
	
	public static void main(String[] args) {
		
	}
	
	
	public void loop_for_ever() {
		while(true) {
				
				for(int x = 0 ; x<10 ; x++ ) {
					for(int y = 10 ; y>x ; y--) {
						System.out.print(" ");
					}
					System.out.println("*");
				} 
				
				for(int x = 0 ; x<10 ; x++) {
					for(int y = 0 ; y<x ; y++) {
						System.out.print(" ");
					}
					System.out.println("*");
				
				}
				
				}
	}

	

	
	
}


	

