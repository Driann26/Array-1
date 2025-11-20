import java.util.Scanner;

public class linearSearch02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int n = input.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the array element " + i + ": ");
            array[i] = input.nextInt();
        }

        System.out.print("Enter the key you want to search for: ");
        int key = input.nextInt();

        int result = -1;

        for (int i = 0; i < n; i++) {
            if (array[i] == key) {
                result = i;
                break;
            }
        }

        if (result != -1) {
            System.out.println("The key in the array is located at index position " + result);
        } else {
            System.out.println("Key not found");
        }
        
        input.close();
    }
}