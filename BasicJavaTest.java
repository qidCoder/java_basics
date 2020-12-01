import java.util.Arrays; //to convert an array to a String

public class BasicJavaTest{
    public static void main(String[] args){
        BasicJava run_method = new BasicJava();


        // Print 1-255
        // run_method.printAll();

        // Print odd numbers between 1-255
        // run_method.printOdds();

        // Print Sum
        // run_method.printSums();

        // Iterating through an array
        // int arr[] = {1,3,5,7,9,13};
        // run_method.printArray(arr);

        // Find Max
        int arr2[] = {-3, -5, -7, 0};
        int arr3[] = {1,56,23};
        // run_method.findMax(arr2);

        // Get Average
        int arr4[] = {2,10,3};
        // run_method.getAvg(arr4);

        // Array with Odd Numbers
        // System.out.println(run_method.arrOdd());

        // Greater Than Y
        int[] arr5 = {1, 3, 5, 7};
        // System.out.println(run_method.greaterThan(arr5, 3));

        // Square the values
        int[] arr6 = {1, 5, 10, -2};
        // System.out.println(run_method.squareVals(arr6));//prints out memory location
        // System.out.println(Arrays.toString(run_method.squareVals(arr6)));

        // Eliminate Negative Numbers
        // System.out.println(run_method.elimNeg(arr6));//prints out memory location
        // System.out.println(Arrays.toString(run_method.elimNeg(arr6)));

        // Max, Min, and Average
        // System.out.println(run_method.minMaxAvg(arr6));//prints out memory location
        // System.out.println(Arrays.toString(run_method.minMaxAvg(arr6)));

        // Shifting the Values in the Array
        int[] arr7 = {1, 5, 10, 7,  -2};
        System.out.println(Arrays.toString(run_method.shifting(arr7)));

    }
}