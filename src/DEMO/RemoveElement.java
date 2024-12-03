package DEMO;

public class RemoveElement {


    public static void main(String[] args) {


        int[] num = {3, 3, 3, 3, 2, 2};
        int val = 3;
        int[] ans = new int[num.length];
        int count = 0;
        for (int i = 0; i < num.length; i++) {

            if (num[i] == 3) {
                ans[i] = '-';

            }
            count++;
        }
        for (int an : ans) {
            System.out.println("number is "+an);
        }


    }
}
