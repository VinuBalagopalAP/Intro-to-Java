package primeNumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        // prime number
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = scan.nextInt();
        int i, flag = 0;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {

            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
