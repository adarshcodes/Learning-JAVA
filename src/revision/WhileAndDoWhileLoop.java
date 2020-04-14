package revision;

import java.util.Scanner;

public class WhileAndDoWhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		Sum of digit of a number
//		6
//		int n = sc.nextInt();
//		int temp = n;
//		int sum=0;
//
//		while(temp>0) {
//			int lastDigit = temp%10;
//			temp /= 10;
//			sum += lastDigit;
//		}
//		System.out.println("The sum of digit of "+n+" is "+sum);
		
		
		
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		
		while(temp>0) {
			int lastDigit = temp%10;
			temp /=10;
			rev = rev*10+lastDigit;
		}
		if(n==rev) {
		System.out.println("The given number "+n+" is a palindrome number "+rev);
		}
		else {
			System.out.println("The given number "+n+" is not a palindrome number "+rev);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
