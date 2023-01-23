import java.util.Scanner;

class SquareCalculatorExtension{
    public static void main(String[] args) {
        //this program will calculate perimeter and area of square

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter width and height to calculate perimeter and area of a rectangle!");
        System.out.println("Width = ");
        double width = reader.nextDouble();

        System.out.println("Height = ");
        double height =reader.nextDouble();


        //calculate perimeter
        double perimeter = (width + height) * 2;
        //calculate area
        double area = (width * height);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}
