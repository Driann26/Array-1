import java.util.Scanner;

public class cafeOrders {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many orders? ");
        int n = input.nextInt();
        input.nextLine(); // clear buffer

        String[] items = new String[n];
        int[] prices = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Item name: ");
            items[i] = input.nextLine();
            System.out.print("Price: ");
            prices[i] = input.nextInt();
            input.nextLine(); // clear buffer
            total += prices[i];
        }

        System.out.println("\nOrders:");
        for (int i = 0; i < n; i++) {
            System.out.println(items[i] + " - " + prices[i]);
        }

        System.out.println("Total: " + total);

        input.close();
    }
}
