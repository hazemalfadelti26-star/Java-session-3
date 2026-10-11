import java.util.Scanner;

public class GradeCategoryL3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter grade (0-100): ");
        double grade = scanner.nextDouble();

        if (grade >= 80 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 70) {
            System.out.println("B");
        } else if (grade >= 60) {
            System.out.println("C");
        } else if (grade >= 50) {
            System.out.println("D");
        } else if (grade >= 0) {
            System.out.println("E");
        } else {
            System.out.println("Invalid Grade");
        }
    }
}