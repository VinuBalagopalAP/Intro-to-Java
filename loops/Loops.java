package loops;

public class Loops {
    public static void main(String[] args) {
        // while loop
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // for loop
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // do while loop
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
