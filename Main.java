import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //replace this comment with your solution
        Scanner scnr = new Scanner(System.in);
        String Muniline;
        int days;
        int countriders;
        double average;

        //System.out.println("Welcome to the Muni Ridership Calculator");
        System.out.println("Which Muni line did you survey?");
        Muniline = scnr.nextLine();
        
        System.out.println("How many days did you survey ridership?");
        days = scnr.nextInt();
        
        System.out.println("How many riders did you count?");
        countriders = scnr.nextInt();
        

        average = (float)countriders/days;
      


   // System.out.printf("According to your survey, an average of %.3f", average);
   // System.out.print(" people rode the " +Muniline+ " per day.");

   System.out.printf("According to your survey, an average of %.3f people rode the %s per day.%n", average, Muniline);


    }
}
