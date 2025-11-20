import java.util.Scanner;

public class arrayAverageScore02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[10];

        int passCount = 0;  

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = sc.nextInt();

            if (score[i] > 70) {
                passCount++;  
            }
        }

        System.out.println("Number of students who passed: " + passCount);

        sc.close();
    }
}
