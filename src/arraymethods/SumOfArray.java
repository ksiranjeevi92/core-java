package arraymethods;

public class SumOfArray {

    public static void main(String[] args) {
        SumOfArray.sumOfArray();
    }

    public static void sumOfArray() {
        int[] inputArray = {0,12,13,14};

        int sum = 0;

        for(int num : inputArray){
            sum = sum + num;
        }

        System.out.println(sum);
    }
}
