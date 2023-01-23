import java.util.Scanner;
public class yesNo { // main class
    public static void main(String[] args) { // main method
        Scanner obj = new Scanner(System.in);
        System.out.println("Do you want to continue playing?");
        String answer = obj.nextLine();

        if (!(answer.equals("Yes") || answer.equals("YES") || answer.equals("yes"))) {
            System.out.println("The game will end here. See you next time.");
        } else {
            System.out.println("Go to the next level!");
        }

    }
}
