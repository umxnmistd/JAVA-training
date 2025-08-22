import java.util.Scanner;

public class userAuthentication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] userName = {"Joel", "Maureen", "Vivo", "Sulit"};
        String[] password = {"Sulit", "Vivo", "Maureen", "Joel"};

        int chances = 5;

        for (int attempt = 0; attempt < chances; attempt++) {
            System.out.print("Enter your UserName : ");
            String name = scan.nextLine();

            int index = -1;
            for (int i = 0; i < userName.length; i++) {
                if (userName[i].equals(name)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.print("Enter your Password : ");
                String pass = scan.nextLine();

                if (password[index].equals(pass)) {
                    System.out.println("Login Successful! Welcome " + userName[index]);
                    return;
                } else {
                    System.out.println("Wrong Password!");
                }
            } else {
                System.out.println("Username not Found. You have " + (chances - attempt - 1) + " chances left.");
            }
        }

        System.out.println("No more chances left. Access Denied!");
    }
}
