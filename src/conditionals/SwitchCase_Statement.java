package conditionals;
import java.util.*;
public class SwitchCase_Statement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Week Number:");
		int DOW= sc.nextInt();
		
		switch(DOW) {
		case 1: System.out.println("This is Monday Dude!"); 
		break;
		case 2: System.out.println("This is Tuesday Dude!");
		break;
		case 3: System.out.println("This is Wednesday Dude!");
		break;
		case 4: System.out.println("This is Thursday Dude!");
		break;
		case 5: System.out.println("This is Friday Dude!");
		break;
		case 6: System.out.println("This is Saturday Dude!");
		break;
		case 7: System.out.println("Chill Dude its Sunday!");
		break;
		default: System.out.println("You Need some Sleep Dude!");
		}
	}

}
