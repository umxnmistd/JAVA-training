import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Grade in Math :");
        double mathGrade = scan.nextDouble();

        System.out.print("Enter your Grade in English :");
        double englishGrade = scan.nextDouble();

        System.out.print("Enter your Grade in Science :");
        double scienceGrade = scan.nextDouble();

        System.out.print("Enter your Grade in Filipino :");
        double filipinoGrade = scan.nextDouble();

        double finalGrade = ((mathGrade + englishGrade + scienceGrade + filipinoGrade)/4);

        if (finalGrade >= 100){
            System.out.print(finalGrade + " Invalid Grade");
        }
        else if (finalGrade >= 98){
            System.out.print(finalGrade + " With Highest Honors");
        }
        else if (finalGrade >= 95){
            System.out.print(finalGrade + " With High Honors");
        }
        else if (finalGrade >= 90){
            System.out.print(finalGrade + " With Honors");
        }
        else if (finalGrade >= 75){
            System.out.print(finalGrade + " Passed");
        }
        else {
            System.out.print(finalGrade + " Failed");
        }
    }
}
