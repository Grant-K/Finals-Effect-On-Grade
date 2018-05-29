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
        double Grade00 = curGrade;
        double Grade10 = curGrade + finalWorth*.1;
        double Grade20 = curGrade + finalWorth*.2;
        double Grade30 = curGrade + finalWorth*.3;
        double Grade40 = curGrade + finalWorth*.4;
        double Grade50 = curGrade + finalWorth*.5;
        double Grade60 = curGrade + finalWorth*.6;
        double Grade70 = curGrade + finalWorth*.7;
        double Grade80 = curGrade + finalWorth*.8;
        double Grade90 = curGrade + finalWorth*.9;
        double Grade100 = curGrade + finalWorth*1;
        double newTotal = 100 + finalWorth;
        for(double i = 0.0; i <=1 ; i += 0.1)
        {
            System.out.printf("Grade at a %.2f%% on the final: %f\n", i * 100.0, (curGrade + finalWorth*i)/newTotal);
        }
    }
}
