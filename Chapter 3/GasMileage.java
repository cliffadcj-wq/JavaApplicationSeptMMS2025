import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int miles;
        int gallons;

        int totalMiles = 0;
        int totalGallons = 0;

        while (true) {

            System.out.print("Enter miles driven (-1 to stop): ");
            miles = input.nextInt();

            if (miles == -1)
                break;

            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            double mpg = (double) miles / gallons;

            totalMiles += miles;
            totalGallons += gallons;

            double totalMPG = (double) totalMiles / totalGallons;

            System.out.println("Miles per gallon: " + mpg);
            System.out.println("Combined MPG: " + totalMPG);
        }
    }
}
