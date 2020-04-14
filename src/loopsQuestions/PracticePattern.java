package loopsQuestions;
import java.util.Scanner;

public class PracticePattern {
	public static void main (String []args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		
//   Practice pattern 1
		
		
//		for(int i=1; i<=n; i++) {
//			
//			for(int j=1; j<=i-1; j++) {
//				System.out.print("  ");
//			}
//			for(int k=1; k<=n-i+1; k++) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//			
//		}
		
		
//		Practice Pattern 2
// 		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i-1; j+=1) {
//				System.out.print("    ");
//			}
//			for(int k=1; k<=n-i+1; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//	   Practice Pattern 3	
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print("  ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print("*   ");
//			}
//			System.out.println();
//		}
		
		
//		Practice Pattern 4
//		int row= 2*n-1;
//		for(int i=1; i<=row; i++) {
//			
//			if(i<=n) {
//			for(int j=1; j<n-i+1; j++) {
//				System.out.print("   ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print("*  ");
//			}
//			}
//			else { 
//				for(int j=1; j<i-n+1; j++) {
//					System.out.print("   ");
//				}
//				for(int k=1; k<=row-i+1; k++) {
//					System.out.print("*  ");
//				}
//			}
//			System.out.println();
//		}
		
//		Practice Pattern 5
//		
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i+1; j++) {
//				System.out.print("* ");
//			}
//			for(int k=1; k<=i*2; k++) {
//				System.out.print("  ");
//			}
//			for(int l=1; l<=n-i+1; l++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}	
//		
//		for(int J=1; J<=n-2; J++) {
//			for(int m=1; m<=2*n+2; m++) {
//				System.out.print("  ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			
//			for(int l=1; l<=n-i+1; l++) {
//				System.out.print("    ");
//			}
//			
//			
//			
//			for(int k=1; k<=i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
//		int num = 1;
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print("   ");
//			}
//			for(int k=1; k<=2*i-1; k++) {
//				num= k;
//				System.out.print(num +"  ");
//			}
//			System.out.println();
//		}

		
//		Practice Pattern 7
		
		int number=1;
		for(int i=1; i<=n; i++) {
			for(int spaces=1; spaces<=n-i; spaces++) {
				System.out.print("  ");
			}
			for(int num=1; num<=1; num++) {
				System.out.print(number++ +" ");
			}
			System.out.println();
		}
			
		
		
		
		
		
		
		
		
		
		
	}

}
