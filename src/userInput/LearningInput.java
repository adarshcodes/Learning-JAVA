package userInput;
import java.util.Scanner;
public class LearningInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  int a= sc.nextInt();
  float f= sc.nextFloat();
  String st= sc.nextLine();
  String all= a+ f+ st;
  System.out.println(all);
	}

}
