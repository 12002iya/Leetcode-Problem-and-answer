package SAMPLE;

import java.util.Scanner;

public class RoadSafetyMarkers {

    public static int minimumMarkers(int[] road) {
        int markers = 0;
        int i = 0;

        while (i < road.length) {
            if (road[i] == 1) {
                markers++;
                i += 3;
            } else {
                i++;
            }
        }
        return markers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sections on the road: ");
        int n = scanner.nextInt();
        int[] road = new int[n];
        System.out.println("Enter the sections (0 for safe, 1 for hazardous): ");
        for (int i = 0; i < n; i++) {
            road[i] = scanner.nextInt();
        }
        int result = minimumMarkers(road);
        System.out.println("Minimum markers needed: " + result);
        scanner.close();
    }
}
