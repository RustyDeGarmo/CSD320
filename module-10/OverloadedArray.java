/*
Rusty Degarmo
Professor Payne
Programming with Java
14 July 2021
*/


//import Math
import java.lang.Math;

public class OverloadedArray{
    public static void main(String [] args){
        //main method to call the overloaded methods

        //fill an array of shorts and test
        short[] shortArray = new short[29];
        fillArray(shortArray);
        System.out.println("\n\n");
        System.out.println("TEST SHORT ARRAY");
        System.out.println("\nThe array values are: ");
        printArray(shortArray);
        System.out.print("\n\nThe average value is: ");
        System.out.println(average(shortArray));

        //fill an array of ints and test
        int[] intArray = new int[24];
        fillArray(intArray);
        System.out.println("\n\n");
        System.out.println("TEST INTEGER ARRAY");
        System.out.println("\nThe array values are: ");
        printArray(intArray);
        System.out.print("\n\nThe average value is: ");
        System.out.println(average(intArray));
        

        //fill an array of longs and test
        long[] longArray = new long[19];
        fillArray(longArray);
        System.out.println("\n\n");
        System.out.println("TEST LONG ARRAY");
        System.out.println("\nThe array values are: ");
        printArray(longArray);
        System.out.print("\n\nThe average value is: ");
        System.out.println(average(longArray));
        

        //fill an array of doubles and test
        double[] doubleArray = new double[14];
        fillArray(doubleArray);
        System.out.println("\n\n");
        System.out.println("TEST DOUBLE ARRAY");
        System.out.println("\nThe array values are: ");
        printArray(doubleArray);
        System.out.print("\n\nThe average value is: ");
        System.out.println(average(doubleArray));
        
    }
    
    /*
    Here are the overloaded methods to calculate the averages
    */
    public static short average(short[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (short)(sum/array.length);
    }

    public static int average(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum/array.length;
    }

    public static long average(long[] array){
        long sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum/array.length;
    }

    public static double average(double[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum/array.length;
    }

    //overloaded methods to fill the arrays
    public static void fillArray(short [] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (short)(Math.random() * 32767);
        }
    }

    public static void fillArray(int [] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 2147483);
        }
    }

    public static void fillArray(long [] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (long)(Math.random() * 922337203685477L);
        }
    }

    public static void fillArray(double [] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (Math.random() * 100 + 1);
        }
    }

    //Overloaded methods to print the arrays
    public static void printArray(short [] array){
        int row = 1;
        System.out.print("Row " + row + ": ");
        for(int i = 0; i < array.length; i++){
            if((i+1)%5 == 0){
                row += 1;
                System.out.println(array[i]);
                System.out.print("Row " + row + ": ");
            }else{
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void printArray(int [] array){
        int row = 1;
        System.out.print("Row " + row + ": ");
        for(int i = 0; i < array.length; i++){
            if((i+1)%5 == 0){
                row += 1;
                System.out.println(array[i]);
                System.out.print("Row " + row + ": ");
            }else{
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void printArray(long [] array){
        int row = 1;
        System.out.print("Row " + row + ": ");
        for(int i = 0; i < array.length; i++){
            if((i+1)%5 == 0){
                row += 1;
                System.out.println(array[i]);
                System.out.print("Row " + row + ": ");
            }else{
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void printArray(double [] array){
        int row = 1;
        System.out.print("Row " + row + ": ");
        for(int i = 0; i < array.length; i++){
            if((i+1)%5 == 0){
                row += 1;
                System.out.println(array[i]);
                System.out.print("Row " + row + ": ");
            }else{
                System.out.print(array[i] + " ");
            }
        }
    }

}