public class IfElse {
    public static void main(String[] args) {
        // if statement = performs a block of code if the condition to be true
        // logical operator = used to connect two or more expression
        //      && (double ampersand) = (AND) both conditions must be true

        int bedroomNum = 2;
        // if the bedroom number between 2 to 5, the house is suitable for family
        if (bedroomNum >= 2 && bedroomNum < 6) { // AND, both statements must T
            System.out.println("The house is suitable for the family");
        }else {
            System.out.println("More bedroom needed.");
        }

    }
}
