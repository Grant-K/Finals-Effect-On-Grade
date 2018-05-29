import java.util.Scanner;

/**
 * Write a description of class Final here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Final
{
    double curGrade = 0;
    double finalWorth = 0;
    Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        Final curFinal = new Final();
        curFinal.getInfo();
    }
    
    public void getInfo()
    {
        System.out.println("Enter you Current Grade. (80% = 80, 81.5% = 81.5)");
        curGrade = reader.nextDouble();
        System.out.println("How much is your final worth? (80% = 80, 81.5% = 81.5)");
        finalWorth = reader.nextDouble();
        double currentGradeEffect = (100 - finalWorth)/100;
        double newCurGrade = curGrade * currentGradeEffect;
        for(double i = 0.0; i <=1 ; i += 0.1)
        {
            System.out.printf("Grade at a %.2f%% on the final: %.2f%%\n", i * 100.0, (newCurGrade + finalWorth*i));
        }
        boolean precisePercent = true;
        double checkPercentage = 0;
        System.out.println("Would you like to check for a precise percentage? (Y/N)");
        System.gc();
        String preciseCheckAnswer = reader.next();
        preciseCheckAnswer = preciseCheckAnswer.toLowerCase();
        System.out.println(preciseCheckAnswer);
        if(preciseCheckAnswer.equals("n"))
            precisePercent = false;
        while (precisePercent)
        {
            System.out.println("Please Enter The Perecent On the Final\nYou Would Like to Check Your Ending Grade For: \n(As whole number 80% = 80)");
            checkPercentage = reader.nextDouble();
            System.out.printf("Grade at a %.1f%% on the final: %.2f%%\n", checkPercentage, (newCurGrade + finalWorth*(checkPercentage/100)));
            System.out.println("Would You Like to Check Another Percentage (Y/N)");
            String againAnswer = reader.next();
            againAnswer = againAnswer.toLowerCase();
            if(againAnswer.equals("n"))
                precisePercent = false;
        }
    }
}
