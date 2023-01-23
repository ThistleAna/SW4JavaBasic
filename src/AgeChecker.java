import java.util.Scanner; // import scanner function

public class AgeChecker {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = reader.nextInt();

        System.out.println("Your age is " + age);

        // if, else statement
        // negative number-> enter positive number, 0-16 -> denied, >17 -> granted
        if (age >= 17) {
            System.out.println("Access granted!");
        }else if (age < 0 ) {
            System.out.println("Enter positive number only!");
        }else {
            System.out.println("Access denied :(");
        }


    }
}


