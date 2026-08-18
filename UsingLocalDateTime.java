import java.time.LocalDateTime;

public class UsingLocalDateTime{
	public static void main(String[] args){
		
		LocalDateTime todaysDateTime = LocalDateTime.now();
		LocalDateTime meetingDateTime = LocalDateTime.of(2021,05,15,06,30,45);
		LocalDateTime myBirthDateTime = LocalDateTime(2010-10-11T11:00:00);
		
		boolean isBefore = myBirthDateTime.isBefore(meetingDateTime);
		boolean isAfter = myBirthDateTime.isAfter(meetingDateTime);
		
		
		System.out.printf("The current date and time is %s%n",todaysDateTime);
		System.out.printf("The current date and time is %s%n",meetingDateTime);
		System.out.printf("The current date and time is %s%n",myBirthDateTime);
		System.out.printf("The current date and time is %s%n",myBirthDateTime.getyear());
		System.out.printf("The current date and time is %s%n",myBirthDateTime.getMonth());
		System.out.printf("The current date and time is %s%n",myBirthDateTime.getDayOfMonth());
		System.out.printf("The current date and time is %s%n",myBirthDateTime.getHour());
		System.out.printf("The current date and time is %s%n",myBirthDateTime.plusDays(10));
		System.out.printf("The current date and time is %s%n",myBirthDateTime.plusHours(15));
		System.out.printf("The current date and time is %s%n",myBirthDateTime.minusMinutes(25));
		System.out.printf("The current date and time is %s%n",myBirthDateTime)
	}
}