package inputScan;

import java.util.Scanner;

public class InputScan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        System.out.println("Enter a name: ");
        scan.close();
        String name = scan.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Hello " + name + "!");
        }
    }

}
