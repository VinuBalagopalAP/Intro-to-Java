package lowHighPN;

import java.util.Scanner;

public class LowHighPN {
    public static void main(String[] args) {
        // prime numbers count
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int low = scan.nextInt();
        int high = scan.nextInt();
        scan.close();
        int count = 0;

        for (int n = low; n <= high; low++) {

            for (int i = 2; i <= low / 2; i++) {
                if (low % i == 0) {
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {
            System.out.println(count);
        }
    }
}
