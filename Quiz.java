import java.util.Scanner;
	
public class Quiz {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("You have 3 Hearts, each wrong Answer will deduct to your Heart, Good luck!");

		System.out.print("Are you Ready? Please type YES if you are :");
		String ready = scan.nextLine();

		if (ready.equalsIgnoreCase("YES")) {
			System.out.println("Let's goo!");
		}
			else {
				System.out.print("See you next Time.");
				return;
			}

		System.out.println("What is the Capital of the Philippines?");

		int chances = 3;
		
		while (chances > 0) {
			String answer = scan.nextLine(); 
			
			if (answer.equalsIgnoreCase("Manila")) {
				System.out.print("You are CORRECT, congratulations");
				break;
			} 
			else { 
				chances--; 
				if (chances > 0) {
					System.out.println("You're Wrong, you have a " + chances + " left");
			}
				else {
					System.out.println("Game over! The correct answer is Manila");
				}			
			}
		}
	}	
}
