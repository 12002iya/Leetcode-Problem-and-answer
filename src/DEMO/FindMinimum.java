package DEMO;

public class FindMinimum {


    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 1, 8, 34};

        int min = Integer.MIN_VALUE;


        for (int num:arr){

            if (num<min){
                min=num;
            }
            
        }

        System.out.println("minmum num is "+ min);


    }


}
