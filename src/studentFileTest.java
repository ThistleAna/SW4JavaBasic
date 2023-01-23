import java.util.Scanner;
public class studentFileTest {
    public static void main(String[] args) { //main method
        // declare variables width and length
        // assign value width: 13.5 and length:25.3
        // create scanner object
        Scanner reader = new Scanner(System.in);

        // ask user to enter the width
        System.out.println("Enter the width : ");
        double width = reader.nextDouble();
        System.out.println("The width is: ");

        // ask user to enter the length
        System.out.println("Enter the length : ");
        double length = reader.nextDouble();
        System.out.println("The length is: ");

        System.out.println("The width of the rectangle is " + width);
        // short cut sout to print
        System.out.println("The length of the rectangle is " + length);
        // create variable perimeter
        double perimeter = 2 * (width + length); // 2l +2W
        System.out.println("The perimeter of the rectangle is " + perimeter);
        double area = length * width;
        System.out.println("The area of the rectangle is " + area);
        // calculate the area = width * length
        // Print the area
    }

}
