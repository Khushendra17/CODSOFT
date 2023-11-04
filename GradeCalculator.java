import java.util.Scanner;
class GradeCalculator
{
public static void main(String[] args) {
   char grade;
    int highScore=600;

    Scanner obj=new Scanner(System.in);
System.out.println("Enter maths Marks");
    int maths =obj.nextInt();
System.out.println("Enter CECD Marks");
    int cECD = obj.nextInt();
System.out.println("Enter Signals and System Marks");
    int signalsAndSystem =obj.nextInt();
System.out.println("enter Network theory Marks");
    int networkTheory = obj.nextInt();
System.out.println("enter M&I Marks");
    int MandI = obj.nextInt();
System.out.println("enter Digital System Design Marks");
    int DigitalSystemDesign = obj.nextInt();

double TotalMarks = maths+cECD+signalsAndSystem+networkTheory+MandI+DigitalSystemDesign;

    double Percentage = ( TotalMarks/highScore)*100;
     if (Percentage >= 90) {
            grade = 'A';
        } 
        else if (Percentage >= 80) {
            grade = 'B';
        }
         else if (Percentage >= 70) {
            grade = 'C';
        } 
        else if (Percentage >= 60) {
            grade = 'D';
        }
         else {
            grade = 'F';
        }
System.out.println(" your Percentage is " + Percentage);
System.out.println(" your total marks is "+TotalMarks);
System.out.println("Your Grade is " + grade);
    }
 
}