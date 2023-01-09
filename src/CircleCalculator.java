public class CircleCalculator {
    public static void main(String[] args) {
        double circleRadius = 12.0;

        System.out.println("Circle Radius is: ");
        System.out.println(circleRadius);

        double circleDiameter = 2*circleRadius;
        System.out.println("Circle Diameter is: " + circleDiameter);

        double circleCircumference = 2*3.14*circleRadius;
        System.out.println("Circle Circumference is: " + circleCircumference);

        double circleArea = 3.14 * circleRadius * circleRadius;
        System.out.println("Circle Area is: " + circleArea);
    }
}
