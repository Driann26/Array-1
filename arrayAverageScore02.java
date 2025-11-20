import java.util.Scanner;

public class arrayAverageScore02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] score = new int[n];

        int passCount = 0;
        int failCount = 0;

        double passTotal = 0;
        double failTotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i] = sc.nextInt();

            if (score[i] > 70) {
                passCount++;
                passTotal += score[i];
            } else {
                failCount++;
                failTotal += score[i];
            }
        }

        double passAverage = passTotal / passCount;
        double failAverage = failTotal / failCount;

        System.out.println("The average score of students who passed is " + passAverage);
        System.out.println("The average score of students who failed is " + failAverage);

        sc.close();
    }
}
