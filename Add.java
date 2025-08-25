import java.util.Scanner;

public class Add {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int finalAnswer = 0;

        for (int number : numbers){
            finalAnswer = finalAnswer + number;
        }
        System.out.print("Final Answer is: " + finalAnswer );
    }
}
