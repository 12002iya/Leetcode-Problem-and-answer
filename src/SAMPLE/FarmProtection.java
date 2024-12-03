package SAMPLE;

import java.util.Scanner;

public class FarmProtection {
    public static int minimumScarecrows(String farm) {
        int scarecrowCount = 0;
        int i = 0;

        while (i < farm.length()) {
            char plot = farm.charAt(i);

            if (plot == 'C') {
                if (i + 1 < farm.length() && farm.charAt(i + 1) == '.') {
                    scarecrowCount++;
                    i += 3;
                } else if (i - 1 >= 0 && farm.charAt(i - 1) == '.') {
                    scarecrowCount++;
                    i += 2;
                } else {
                    return -1;
                }
            } else {
                i++;
            }
        }

        return scarecrowCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the farm layout (e.g., 'C.C.C.C.'): ");
        String farm = scanner.nextLine();

        int result = minimumScarecrows(farm);
        if (result == -1) {
            System.out.println("It is impossible to protect all crops.");
        } else {
            System.out.println("Minimum number of scarecrows needed: " + result);
        }
        scanner.close();
    }
}
