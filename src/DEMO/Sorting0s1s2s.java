package DEMO;

public class Sorting0s1s2s {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 0, 1, 2};

        int zero = 0, one = 0, two = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            } else {
                two++;
            }
        }

        int k = 0;

        for (int i = 0; i < zero; i++) {
            arr[k] = 0;
            k++;
        }

        for (int i = 0; i < one; i++) {
            arr[k] = 1;
            k++;
        }

        for (int i = 0; i < two; i++) {
            arr[k] = 2;
            k++;
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
