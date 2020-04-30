package revision;
import java.util.Scanner;


public class ForLoops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter base number: ");
//		int n = sc.nextInt();
//		System.out.println("Enter power: ");
//		int y = sc.nextInt();

//Factorial of a inpur number		
//		int fact = 1;
//		
//		for(int i=1; i<=n; i++) {
//			fact = fact*i;
//		}
//		System.out.print(fact);
		
		
//		Fibonacci number
		
//		int a = 0;
//		int b = 1;
//		int c;
//		
//		System.out.print(a+" ");
//		System.out.print(b+" ");
//		
//		for(int i=0; i<n-2; i++) {
//			c = a+b;
//			System.out.print(c+" ");
//			a = b;
//			b = c;
//		}
		
//		Power to another number
		
//		int result = 1;
//		for(int i=1; i<=y; i++) {
//			result *= n; 
//		}
//		System.out.println(result);
		
		
//        Prime or not
//		
//		int n = sc.nextInt();
//		
//		boolean isPrime = true;
//		for(int i=2; i*i<=n; i++) {
//			
//			if(n%i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		if(n<2) {
//			isPrime = false;
//		}
//		System.out.println(n+" is Prime? "+ isPrime);
//
//		
		
//		Sum of series to n
		
//		int n = sc.nextInt();
//		
//		float series = 0;
//		
//		for(float i=1; i<=n; i++) {
//			series += 1/i;
//		}
//		System.out.println("The series is: "+ series);
//		
//		
//	    for(float i=1; i<=n; i++) {
//	    	if(i%2==0) {
//	    	series -= 1/i;	
//	    	}
//	    	else {
//	    		series += 1/i;
//	    	}
//	    }
//	    System.out.println("The series is: "+series);

	
	
//	Nested for loop
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=10; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//	
		
//		Printing tables
		
//		int table = 1;
//		
//		for(int i=1; i<=10; i++) {
//			for(int j=1; j<=20; j++) {
//				table = i*j;
//				System.out.print(table+"  ");
//			}
//			System.out.println();
//		}
//		
		
//		Pattern-1
		
//		int n = sc.nextInt();
//		
//		for(int i = 1; i <= n; i++) {
//			for(int j = 1; j<=n; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	
		
//		Pattern-2
		
//		int n = sc.nextInt();
//		
//		for(int i = 1; i<=n; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	
		
//		Pattern-3 
		
//		int n = sc.nextInt();
//		
//		for(int i = 1; i<=n; i++) {
//			for(int k = 1; k<=i-1; k++) {
//				System.out.print("  ");
//			}
//			for(int j = 1; j<=n-i+1; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		Pattern-4
//		
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i+1; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
	
// 		Pattern-5 {	
//		
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print("  ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	
	
//		Pattern-6
//		
//	
//	int n = sc.nextInt();
//	for(int i=1; i<=n; i++) {
//		for(int j=1; j<=n-i; j++) {
//			System.out.print("  ");
//		}
//		for(int j=1; j<=i; j++) {
//			System.out.print("*   ");
//		}
//		System.out.println();
//	}
//	
//	

		
//	  	Pattern-7
//		
//		int n = sc.nextInt();
//		int number = 1; 
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print("  ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print(number++ +"   ");
//			}
//			System.out.println();
//		}
		
//		Pattern-8
//		
//		
//		int n = sc.nextInt();
//		int rows = 2*n-1;
//		
//		for(int i=1; i<=rows; i++) {
//			
//			if(i<=n) {
//				for(int j=1; j<=i; j++) {
//					System.out.print("*  ");
//				} 
//			}
//			else {
//				for(int j=1; j<=rows-i+1; j++) {
//					System.out.print("*  ");
//				}
//				
//			}
//			System.out.println();
//			
//		}
		
//		Pattern-9
//		
//		int n = sc.nextInt();
//		
//		System.out.println("* ");
//		if(n>1) {
//	for(int i=2; i<=n-1; i++) {
//		System.out.print("* ");
//		
//			for(int j=1; j<=i-2; j++) {
//				System.out.print("  ");
//			}
//		
//		System.out.println("*");
//	}	
//	for(int i=1; i<=n; i++) {
//		System.out.print("* ");
//	}
//		}
		
//		Practice pattern 1
		
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i-1; j++) {
//				System.out.print("  ");
//			}
//			for(int j=1; j<=n-i+1; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		Practice pattern 2
//		
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=2*i-2; j++) {
//				System.out.print("  ");
//			}
//			for(int j=1; j<=n-i+1; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

		
//		Practice pattern 3
		
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print("  ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print("*   ");
//			}
//			System.out.println();
//		}
		
//		Practice pattern 4
//		
//		int n = sc.nextInt();
//		int rows = 2*n-1;
//		for(int i=1; i<=rows; i++) {
//			if(i<=n) {
//				for(int j=1; j<=n-i; j++) {
//					System.out.print("  ");
//				}
//				for(int j=1; j<=i; j++) {
//					System.out.print("* ");
//				}}
//				else {
//					
//					for(int k=1; k<=i-n; k++) {
//						System.out.print("  ");
//					}
//					for(int k=1; k<=rows-i+1; k++) {
//						System.out.print("* ");
//				}
//		}
//			System.out.println();
//	}
		
//		Practice pattern 5
//		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*  ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("   ");
			}
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		for(int i=1; i<=n-2; i++) {
			for(int j=1; j<=2*n+1; j++) {
				System.out.print("   ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*  ");
			}
			for(int j=1; j<=2*n-2*i+1; j++) {
				System.out.print("   ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
//		Practice-pattern 6
//		
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print("  ");
//			}
//			for(int j=1; j<=2*i-1; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
//		Practice pattern 7 --Failed
//		
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=1; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print("  ");
//			}
//			for(int j=1; j<=n; j++) {
//				System.out.println(j);
//			}
//		}
	
//		Practice pattern 9
//		
//		int n = sc.nextInt();
//		System.out.println("*");
//		
//		for(int i=1; i<=n-2; i++) {
//			for(int j=1; j<=n-2; j++) {
//				
//			}
//		}
//			
//		for(int i=1; i<=n; i++) {
//			System.out.print("* ");
//		}
//		
		
		
		
		
	
	
	}
}
