package loopsQuestions;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
		int a= sc.nextInt();
        int b= sc.nextInt();
        int res=1;
        for(int i=0; i<b; i++) {
        	res*=a;
        }
        System.out.println(res);
	}

}
