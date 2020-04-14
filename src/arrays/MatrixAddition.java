package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		
//		System.out.println("Factorial of : ");
		Scanner sc= new Scanner(System.in);
		
//		System.out.println("Enter number of rows : ");
//		int rows = sc.nextInt();
//		System.out.println("Enter number of cols : ");
//		int cols = sc.nextInt();
//		
//		int a[][]= new int [rows][cols];
//		int b[][]= new int [rows][cols];
//		
//		System.out.println("Enter array A: ");
//		for(int i=0; i<rows; i++) {
//			for(int j=0; j<cols; j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//		
//		System.out.println("Enter array B: ");
//		for(int i=0; i<rows; i++) {
//			for(int j=0; j<cols; j++) {
//				b[i][j]= sc.nextInt();
//			}
//		}
//		
//		int c[][]= new int[rows][cols];
//		for(int i=0; i<rows; i++) {
//			for(int j=0; j<cols; j++) {
//				c[i][j]= a[i][j] + b[i][j];
//			}
//		}
//
//		System.out.println("Result array c: ");
//		for(int i=0; i<rows; i++) {
//			for(int j=0; j<cols; j++) {
//				System.out.print(c[i][j]+ " ");
//			}
//
//			System.out.println();
//		}
		
		/* factirial
		
		int n= sc.nextInt();
		int fact=1;
      for(int i=1; i<=n; i++) {
    	  fact*=i;
      }

	  System.out.println("The Factorial of "+n +" is : "+fact);
		
	*/
		
//		Fibinacci series
		
//		
//		int n= sc.nextInt();
//		 int a=0;
//		 System.out.print(a+" ");
//		 int b=1;
//		 System.out.print(b+" ");
//		 for(int i=2; i<=n; i++) {
//			 int c = a+b;
//			 System.out.print(c+ " ");
//			 a=b;
//			 b=c;
//		 }
//		 System.out.println();
//		
		
		
//		X^y numbers
		
//		int x= sc.nextInt();
//		int y= sc.nextInt();
//		
//		int result=1;
//		
//		for(int i=1; i<=y; i++) {
//			result *=x;
//			System.out.print(result+" ");
//		}
//		
		
//		Prime Numbers
		
//		int input= sc.nextInt();
//		boolean prime= true;
//		if(input <2) {
//			prime =false;
//		}
//		for (int i=2; i<input; i++) {
//			if(input % i == 0) {
//				prime = false;
//			}
//		}
//		
//		System.out.println(input + ": is prime "+ prime);
//		
		
		
//		 Sum of the series
		
		
//		double n = sc.nextDouble();
//		
//		double series=0;
//		for(float i =1; i<=n; i++) {
//			
//			series += 1/i; 
//		}
//		 
		
		
//		for(float i =1; i<=n; i++) {
//			 
//			if(i % 2 ==0) {
//				series -= 1/i;
//			}else {
//				series += 1/i;
//			}
//			    
//		}
//		
//		
//		
//		System.out.println("Sum of the given series is : " + series);
		
//	
//		for(int i=1; i<=100; i++) {
//			for(int j=1; j<=10; j++) {
//				System.out.print("   "+j);
//			}
//		}
//		System.out.println();
//		
	
		
//		printing table from 1-20
//		
//		int table =0;
//		for(int i=1; i<=10; i++) {
//			for(int j=1; j<=20; j++) {
//				table = i*j;
//				System.out.print(table+"     ");
//			}System.out.println();
//		}
//		
		
		
// Pattern( type 1- n*n)
		
		
		int n= sc.nextInt();
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n; j++) {
//				System.out.print("*"+ "   ");
//			}
//			System.out.println();
//		}
//	
		
//		Pattern type-2
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*"+ " ");
//			}
//			System.out.println();
//		}
		
//		Pattern 3
//		
//			for(int i=1; i<=n; i++) {
//				for(int j=1; j<=i-1; j++) {
//					System.out.print("  ");
//				}
//				for(int k=1; k<=n-i+1; k++) {
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
			
//             Pattern 4
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i+1; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

		
		
//		Pattern 5
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print("  ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//	   Pattern 6
		
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print("  ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print("*   ");
//			}
//			System.out.println();
//		}
		
		
//		Pattern 7
//		int number=1;
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print("   ");
//			}
//			
//			for(int k=1; k<=i; k++) {
//				System.out.print(number++ +"    ");
//			}
//			System.out.println();
//		}
//		
//		
		
//		Pattern 8
		
//		int rows= 2*n-1;
//		for(int i=1; i<=rows; i++) {
//			if(i<n) {
//				for(int j=1; j<=i; j++) {
//					System.out.print("*  ");
//				}
//			}
//			else{
//				for(int k=1; k<=rows-i+1; k++)
//				{
//					System.out.print("*  ");
//				}
//			}
//			System.out.println();
//		}
//		if(n>0) {
//		System.out.println("* ");
//		for(int j=2; j<=n-1; j++) {
//			
//			System.out.print("* ");
//			
//			for(int k=1; k<=j-2; k++) {
//				System.out.print("  ");
//			}
//			System.out.println("* ");	
//		}
//		if(n>1) {
//		for(int i=1; i<=n; i++) {
//			System.out.print("* ");
//		
//		
//		}
//		
//		}
//	
//		}
		
		
		
		
	
	}	}
		
		
		
		
