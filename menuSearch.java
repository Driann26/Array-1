import java.util.Scanner;

public class menuSearch {
    public static void main(String[] args) {
        String[] menu = {"Fried Rice", "Fried Noodles", "Toasted Bread", "Fried Potatoes", "Teh Tarik", "Cappuccino", "Chocolate Ice"};
        Scanner input = new Scanner(System.in);

        System.out.print("Search menu item: ");
        String search = input.nextLine();

        boolean found = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " is available.");
        } else {
            System.out.println(search + " is not on the menu.");
        }

        input.close();

    }
}
