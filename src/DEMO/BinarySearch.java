package DEMO;

public class BinarySearch {


    public static void main(String[] args) {
        int[] arr = {12,14,56,67,78,100};
        int target = 12;
        int N = arr.length;
        //find the target element using Binary  Search
        int ans = findTheTarget(arr, target, N);

        if (ans != -1) {
            System.out.println("Element found the index is " + ans);
        } else {
            System.out.println("Element Not found ");
        }
    }

    private static int findTheTarget(int[] arr, int target, int size) {
        int left=0;
        int right =arr.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;

            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                left=mid+1;

            }else {
                right=mid-1;
            }
        }
        return -1;
    }
}
