package variables;

public class Variables {

    public static void main(String[] args) {
        {
            int x = 30;
            int y = 20;
            int sum = x + y;

            // to calculate the sum of x and y
            System.out.println("Sum of " + x + " and " + y + " is " + sum);

            // to calculate the product of x and y
            System.out.println("Product of " + x + " and " + y + " is " + (x * y));

            // to calculate the difference of x and y
            System.out.println("Difference of " + x + " and " + y + " is " + (x - y));

            // to calculate the quotient of x and y
            System.out.println("Quotient of " + x + " and " + y + " is " + (x / y));

            // to calculate the remainder of x and y
            System.out.println("Remainder of " + x + " and " + y + " is " + (x % y));

        }
    }
}