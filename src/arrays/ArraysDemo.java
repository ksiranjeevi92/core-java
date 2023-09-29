package arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //int arr[] = {10,20,30,40,50};

        int arr[] = new int[5];

        arr[0] = 10;
        //arr[1] = new Integer(20);
        /* arr[2] = 33.54; */

        arr[2] = 20;

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int element:arr){
            System.out.println(element);
        }

        long[] arr1 = new long[3];

        for(long element:arr1){
            System.out.println("\n"+element);
        }
    }
}
