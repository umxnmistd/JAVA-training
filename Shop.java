import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner cart = new Scanner(System.in);
        System.out.print("What item would you like to buy?: ");
        String buy = cart.nextLine();

        System.out.print("What is the price for each?: ");
        double price = cart.nextDouble();

        System.out.print("How many would you like?: ");
        int amount = cart.nextInt();

        System.out.println("");

        double finalAmount = (price * amount);
        System.out.println("You have bought " + amount + " " + buy + "/s");
        System.out.println("Your total is $" + finalAmount);
    }
}
