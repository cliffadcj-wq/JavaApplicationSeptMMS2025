import java.util.Scanner;

public class DaysOfTheWeek{
	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
		
        int Day;

		System.out.print("What is Today: ");
		Day = input.nextInt();
		
		if(Day == 7){
		    System.out.println("Today is Saturday!");	
		}
		else if(Day == 6){
			System.out.println("Today is Friday!");	
		}
		else if(Day == 5){
			System.out.println("Today is Thursday!");	
		}
		else if(Day == 4){
			System.out.println("Today is Wednesday!");	
		}
		else if(Day == 3){
			System.out.println("Today is Tuesday!");	
		}
		else if(Day == 2){
			System.out.println("Today is Monday!");	
		}
        else if(Day == 1){
			System.out.println("Today is Sunday!");	
		} 
		else{
			System.out.println("That is not a day");	
		}
	}
}