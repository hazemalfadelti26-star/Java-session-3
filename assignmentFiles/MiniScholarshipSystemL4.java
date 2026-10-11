import java.util.Scanner;

public class MiniScholarshipSystemL4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score: ");
        double score = input.nextDouble();

        System.out.print("Enter attendance percentage: ");
        double attendance = input.nextDouble();

        System.out.print("Enter parent monthly income: Rp ");
        double income = input.nextDouble();

        System.out.print("Is the student active? (yes/no): ");
        String activeAnswer = input.next();

        boolean isActive = activeAnswer.equalsIgnoreCase("yes");

        if (score >= 85 ||
            attendance >= 90 ||
            income <= 5000000 ||
            isActive) {

            System.out.println("Full scholarship");

        } else if (score >= 70 &&
                   attendance >= 80 &&
                   income <= 8000000) {

            System.out.println("Partial scholarship");

        } else {
            System.out.println("No scholarship.");
        }

        input.close();
    }
}