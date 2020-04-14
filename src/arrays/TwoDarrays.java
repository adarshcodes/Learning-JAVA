package arrays;
import java.util.Scanner;
public class TwoDarrays {

	public static void main(String[] args) {
	
		
////		int a [][]= new int [5][6];
//		 
//		int b[][] = {
//				{2,3,4,5},
//				{4,6,5,3,2,1,4,5},
//				{4,3,3}
//		};
//		System.out.println(b[0][3]);
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows of matrix:");
		int rows = sc.nextInt();
		
		System.out.println("Enter number of columns:");
		int cols = sc.nextInt();
		
		
//		
//		System.out.println("Enter array A ");
//		for(int i=0; i<rows; i++) {
//			for(int j=0; j<cols; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println("Enter array B ");
//		for(int i=0; i<rows; i++) {
//			for(int j=0; j<cols; j++) {
//				b[i][j] = sc.nextInt();
//			}
//		}  
//		
//		System.out.println("the sum of the input matrix is: ");
//		for(int i=0; i<rows; i++) {
//			for(int j=0; j<cols; j++) {
//				c[i][j] = a[i][j] + b[i][j];
//				System.out.print(c[i][j] + "   ");
//			}			
//			System.out.println();
//		}
		
		
		
		
		
		
		if( rows == cols) {
			
			int sum = 0;
			int a[][] = new int [rows][cols];
			int b[][] = new int [rows][cols];
			int c[][] = new int [rows][cols];
			
			System.out.println("Enter array A ");
			for(int i=0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter array B ");
			for(int i=0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					b[i][j] = sc.nextInt();
				}
			}  
			
			System.out.println("the sum of the input matrix is: ");
			for(int i=0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					for(int k =0; k<cols; k++) {
					  sum+= a[i][k]*b[k][j];
					  c[i][j] =sum;
					}
				}				
			}
			
			for(int i=0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					System.out.println(c[i][j]);
				}
			}

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		else {
			System.out.println("Number of rows are not equals to number of columns⚠");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}