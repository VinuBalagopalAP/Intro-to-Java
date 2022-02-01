package conditionalStatements;

public class CS {
    public static void main(String[] args) {

        // if else statement
        int x = 30;
        int y = 20;

        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is less than y");
        }

        // if else if else statement
        if (x < y) {
            System.out.println("x is less than y");
        } else if (x == y) {
            System.out.println("x is equal to y");
        } else {
            System.out.println("statement & condition goes worng!");
        }
    }
}
