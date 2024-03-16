import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.print("\nEnter number: (enter 'ok' to finish)");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("ok")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                arrayList.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. enter valid number or 'ok' to finish.");
            }
        }

        System.out.print("Entered Numbers: ");
        for (int number : arrayList) {
            System.out.print(number + ", ");
        }

        // Remove odd numbers
        arrayList.removeIf(n -> n % 2 != 0);
        System.out.print("\nNumbers after removing odd numbers: ");
        for (int number : arrayList) {
            System.out.print(number + ", ");
        }

        // Remove a specific number
        System.out.print("\nEnter a number to remove: ");
        int removeNumber = scanner.nextInt();
        if (arrayList.remove(Integer.valueOf(removeNumber))) {
            System.out.println(removeNumber + " has been removed from the array.");
        } else {
            System.out.println(removeNumber + " is not in the array.");
        }

        // Search for a number
        scanner.nextLine(); // Consume newline character left after nextInt()
        System.out.print("\nEnter a number to search: ");
        int searchNumber = scanner.nextInt();
        if (arrayList.contains(searchNumber)) {
            System.out.println(searchNumber + " is in the array.");
        } else {
            System.out.println(searchNumber + " is not in the array.");
        }

        // Calculate total and average
        int total = 0;
        for (int number : arrayList) {
            total += number;
        }
        double average = arrayList.size() > 0 ? (double) total / arrayList.size() : 0;
        System.out.println("Total of the numbers: " + total);
        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}