// This is a square calculator program
// Wb 1 question 2a and 2b
public class SquareCalculator { //class
    public static void main(String[] args) { //main method
    // declare variables width and length
        // assign value width: 13.5 and height: 25.3
        double width = 13.5; // data type is double to accept decimal number
        double length = 25.3;

        System.out.println("The width of the rectangle is " + width);
        // short cut sout to print
        System.out.println("The length of the rectangle is " + length);

        // create variable perimeter
        double perimeter = 2 * (width + length) ; // 2L + 2W
        System.out.println("The perimeter of the rectangle is " + perimeter);

        double area = width * length;
        System.out.println("The area of the rectangle is" + area);
    }
}
