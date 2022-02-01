package gradingSystem;

public class GradingSystem {
    public static void main(String[] args) {
        // if else grade
        int grade = 80;
        if (grade >= 90) {

            System.out.println("O");
        } else if (grade >= 80) {

            System.out.println("A");
        } else if (grade >= 70) {

            System.out.println("B");
        } else if (grade >= 60) {

            System.out.println("C");
        } else if (grade >= 50) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}