package first;

import java.util.Scanner;

public class CheckPrinter {
    public static void printCheck(String[] items) {
        for (String item: items) {
            String[] parts = item.split(", ");
            String name = parts[0];
            String quantity = parts[1];
            String price = parts[2];
            System.out.printf("%-10s  %-7s  %s%n", name, quantity, price);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i=0; i<n; ++i)
            values[i] = scanner.nextLine();
        printCheck(values);
    }
}