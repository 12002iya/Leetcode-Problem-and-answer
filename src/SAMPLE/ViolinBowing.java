package SAMPLE;

import java.util.Scanner;

public class ViolinBowing {

    public static Pair<Boolean, String> balanceBowingPattern(String bowingPattern) {
        int downCount = 0;
        int upCount = 0;

        for (char c : bowingPattern.toCharArray()) {
            if (c == 'D') downCount++;
            else if (c == 'U') upCount++;
        }
        int difference = Math.abs(downCount - upCount);
        if (difference > 1) {
            return new Pair<>(false, bowingPattern);
        }
        StringBuilder modifiedPattern = new StringBuilder(bowingPattern);

        if (downCount > upCount) {
            int excess = (downCount - upCount) / 2;
            for (int i = 0; i < modifiedPattern.length() && excess > 0; i += 2) {
                if (modifiedPattern.charAt(i) == 'D') {
                    modifiedPattern.setCharAt(i, 'U');
                    excess--;
                }
            }
        } else if (upCount > downCount) {
            int excess = (upCount - downCount) / 2;
            for (int i = 1; i < modifiedPattern.length() && excess > 0; i += 2) {
                if (modifiedPattern.charAt(i) == 'U') {
                    modifiedPattern.setCharAt(i, 'D');
                    excess--;
                }
            }
        }

        return new Pair<>(true, modifiedPattern.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the bowing pattern: ");
        String bowingPattern = scanner.nextLine();

        Pair<Boolean, String> result = balanceBowingPattern(bowingPattern);

        if (result.first) {
            System.out.println("Balanced pattern achieved: " + result.second);
        } else {
            System.out.println("Cannot balance the pattern. Original pattern: " + result.second);
        }

        scanner.close();
    }
}
class Pair<T, U> {
    public final T first;
    public final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
