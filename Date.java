import java.util.Scanner;

public class Date {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Use Integers to Input Answer");

        System.out.print("Enter the Month : ");
        int monthNum = scan.nextInt();

        System.out.print("Enter the Date : ");
        int date = scan.nextInt();

        System.out.print("Enter the Year : ");
        int year = scan.nextInt();

        String month = "";

        switch (monthNum) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                System.out.print("Invalid Input");
        }

        if (date >= 31) {
            System.out.print("Invalid Input");
        }

        System.out.print(month + " " + date + ", " + year);
    }
}

