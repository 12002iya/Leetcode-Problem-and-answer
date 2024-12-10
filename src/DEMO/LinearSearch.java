package DEMO;

public class LinearSearch {


    public static void main(String[] args) {

        int[] arr = {12, 7, 9, 100, 34, 67, 23, 1001};
        int target = 23;
        int N = arr.length;
        //find the target element using Linear Search
        int ans = findTheTarget(arr, target, N);

        if (ans != -1) {
            System.out.println("Element found the index is " + ans);
        } else {
            System.out.println("Element Not found ");
        }

    }

    private static int findTheTarget(int[] arr, int target, int N) {

        for (int i = 0; i < N; i++) {

            if (arr[i] == target) {

                return i;
            }
        }

        return -1;
    }
}
