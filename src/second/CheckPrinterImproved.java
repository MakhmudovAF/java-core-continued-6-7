package second;

import java.util.Scanner;

public class CheckPrinterImproved {

    private static int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void printCheck(String[] items) {
        String[] names = new String[items.length];
        String[] quantities = new String[items.length];
        String[] prices = new String[items.length];

        for (int i = 0; i < items.length; i++) {
            String[] parts = items[i].split(",\\s*");
            names[i] = parts[0];
            quantities[i] = parts[1];
            prices[i] = parts[2];
        }

        int maxNameLength = findMaxLength(names);
        int maxQuantityLength = findMaxLength(quantities);

        String format = "%-" + (maxNameLength + 2) + "s%-" + (maxQuantityLength + 2) + "s%s%n";

        for (int i = 0; i < items.length; i++) {
            System.out.printf(format, names[i], quantities[i], prices[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextLine();
        }
        printCheck(values);
    }
}