package DEMO;

public class FindMaxSubArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        int size = arr.length;
        findMaximumInSubArray(arr, k, size);
    }
    private static void findMaximumInSubArray(int[] arr, int k, int size) {

        for (int i = 0; i <= size-k; i++) {

            int max = arr[i];

            for (int j = 1; j < k; j++) {

                if (arr[i + j] > max) {

                    max = arr[i + j];
                }

            }
            System.out.println("Maximum Subarray in this Number" + max + " ");

        }

    }


}
