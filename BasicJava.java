// Solve the below challenges. Use either an Array or ArrayList when an array is necessary, depending on what you think is appropriate. The class name should be BasicJava; you will need to create methods for each of the tasks below and test them in the main method.

import java.util.ArrayList;

public class BasicJava{

    // Print 1-255
    // Write a method that prints all the numbers from 1 to 255.
    public void printAll(){
        for (int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }

    // Print odd numbers between 1-255
    // Write a method that prints all the odd numbers from 1 to 255.
    public void printOdds(){
        for (int i = 1; i <= 255; i++){
            if( i % 2 != 0){
                System.out.println(i);
            }
        }
    }    

    // Print Sum
    // Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far.
    public void printSums(){
        int sum = 0;

        for (int i = 0; i <= 255; i++){
            sum += i;

            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }  

    // Iterating through an array
    // Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. Being able to loop through each member of the array is extremely important.
    public void printArray(int[] X){
        //ForEach loop
        for (int value : X){
            System.out.println(value);
        }
    }  

    // Find Max
    // Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
    public void findMax(int[] X){
        int max = X[0];

        for( int i = 0; i < X.length; i++){
            if(max < X[i]){
                max = X[i];
            }
        }

        System.out.println(max);
    }

    // Get Average
    // Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.
    public void getAvg(int[] X){
        double avg = 0;
        int i;

        for (i = 0; i < X.length; i++){
            avg += X[i];
        }

        System.out.println(avg/i);
    }

    // Array with Odd Numbers
    // Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
    public ArrayList<Integer> arrOdd(){
        ArrayList<Integer> y = new ArrayList<Integer>();

        for( int i = 1; i <= 255; i += 2){
            y.add(i);
        }

        return y;
    }

    // Greater Than Y
    // Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).
    public int greaterThan(int[] X, int y){
        int i;
        int count = 0;

        for ( i = 0; i < X.length; i++){
            if(X[i] > y){
                count++;
            }
        }
        
        return count;
    }

    // Square the values
    // Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
    public int[] squareVals(int[] X){
        int[] newArr = new int[X.length];

        for( int i = 0; i < X.length; i++){
            //get square of value
            double temp = Math.pow(X[i], 2);

            //type cast from double into an int
            newArr[i] = (int) temp;
        }

        return newArr;
    }

    // Eliminate Negative Numbers
    // Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].
    public int[] elimNeg(int[] X){
        for( int i = 0; i < X.length; i++){
            if(X[i] < 0){
                X[i] = 0;
            }
        }
        return X;
    }

    // Max, Min, and Average
    // Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
    public Object[] minMaxAvg(int[] X){
        int min = X[0];
        int max = X[0];
        double sum = 0;

        for( int i = 0; i < X.length; i++){
            sum += X[i];
            if (X[i] > max){
                max = X[i];
            }
            if (X[i] < min){
                min = X[i];
            }
        }

        Object[] newArr = {max, min, sum/X.length};

        return newArr;
    }

    // Shifting the Values in the Array
    // Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.
    public int[] shifting(int[] X){
        for(int i = 0; i < X.length - 1; i++){
            X[i] = X[i + 1];
        }

        X[X.length - 1] = 0;

        return X;
    }   
    

}