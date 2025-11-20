import java.util.Scanner;

public class studentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students? ");
        int n = input.nextInt();

        int[] grades = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = input.nextInt();
            total += grades[i];
        }

        int max = grades[0];
        int min = grades[0];

        for (int i = 1; i < n; i++) {
            if (grades[i] > max) max = grades[i];
            if (grades[i] < min) min = grades[i];
        }

        System.out.println("\nGrades:");
        for (int i = 0; i < n; i++) {
            System.out.println(grades[i]);
        }

        System.out.println("Average: " + (total / n));
        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);

        input.close();

    }
}
