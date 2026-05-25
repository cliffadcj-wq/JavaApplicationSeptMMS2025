import java.util.Scanner;

public class IfElseIfStatement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int score;
		String name;
		String subject;
		
		System.out.printf("Enter your name: ");
		name = input.nextLine ();
		
		System.out.printf("Enter your student: ");
		subject = input.nextLine ();
		
		System.out.printf("Enter your score: ");
		score = input.nextInt ();
		
		System.out.println("");
		System.out.println("==================================================")
		
		if(score >= 70) {
			System.out.printf("Full Name: %s%n", name);
			System.out.printf("Subject: %s%n", subject);
			Subject.out.printf("Score: %s%n", score);
			Subject.out.printf("Grade: A");
		
		}
		else if(score >= 60) {
			System.out.printf("Full Name: %s%n", name);
			System.out.printf("Subject: %s%n", subject);
			Subject.out.printf("Score: %s%n", score);
			Subject.out.printf("Grade: B");
		
		}
		else if(score >= 50) {
			System.out.printf("Full Name: %s%n", name);
			System.out.printf("Subject: %s%n", subject);
			Subject.out.printf("Score: %s%n", score);
			Subject.out.printf("Grade: C");
		
		}
		else if(score >=40) {
			System.out.printf("Full Name: %s%n", name);
			System.out.printf("Subject: %s%n", subject);
			Subject.out.printf("Score: %s%n", score);
			Subject.out.printf("Grade: D");
		
		}
		else if(score >=30) {
			System.out.printf("Full Name: %s%n", name);
			System.out.printf("Subject: %s%n", subject);
			Subject.out.printf("Score: %s%n", score);
			Subject.out.printf("Grade: E");
			
		}
	}
}