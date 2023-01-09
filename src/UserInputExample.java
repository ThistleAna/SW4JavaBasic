import java.util.Scanner; // import Scanner class

public class UserInputExample {
    public static void main(String[] args) {
        // this program can read pokemon name and health value
        // create object scanner
        Scanner myObj = new Scanner(System.in);

        // read pokemon name
        System.out.println("Enter the Pokemon name : "); // string name
        String name = myObj.nextLine(); // can read String value

        // read pokemon health value (integer)
        System.out.println("Enter pokemon health value : ");
        int health = myObj.nextInt();

        System.out.println("Your pokemon name is " +name);
        System.out.println("Your pokemon health is " + health);
    }
}
