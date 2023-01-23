public class logicalOperator {
    public static void main(String[] args) {
        // logical operator = used to connect two or more expression
        //      && (double ampersand) = (AND) both conditions must be true
        //      || (double pipe)     = (OR) either condition must be true
        //       !  (exclamation mark) = (NOT) reverses boolean value of condition

        int number = 234; // check if this number is less than 0 OR greater than 100

        if (number<0 || number>100) {
            System.out.println("The number " + number + " is less than 0 OR greater than 100.");
        } else {
            System.out.println("Your number is not less than 0 OR grater than 100.");
        }

    }
}
