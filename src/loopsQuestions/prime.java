package loopsQuestions;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
        
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt(); 
		boolean prime= true;

		for(int i=2; i*i<=n; i++) {
			if(n % i == 0) {
				prime= false;
				break;
			}
		}
		
		if( n<2) {
			prime= true;
		}
		
		System.out.println("Number is Prime? :-" + prime);
		
		
		
		
		
		
		
		
		
		
	}

}
