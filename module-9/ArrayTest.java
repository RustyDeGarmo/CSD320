/*
Rusty DeGarmo
Professor Payne
Programming with Java
9 July 2021
*/

//import Math and Arrays
import java.lang.Math;
import java.util.Arrays;

public class ArrayTest{
    public static void main(String[] args){

        int[] myArray = new int[20];
        
        arrayMethods.fillArray(myArray);
        System.out.println("\nThe array values are: ");
        System.out.println(Arrays.toString(myArray));

        System.out.print("\nThe highest value is: ");
        System.out.println(arrayMethods.highestVal(myArray));

        System.out.print("\nThe lowest value is: ");
        System.out.println(arrayMethods.lowestVal(myArray));

        System.out.print("\nThe average is: ");
        System.out.println(arrayMethods.averageVal(myArray));

        System.out.print("\nThe sum is: ");
        System.out.println(arrayMethods.sumOfVals(myArray));

    }
}

class arrayMethods{
    public static void fillArray(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100 + 1);
        }
    }

    public static int highestVal(int[] array){
        int highest = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > highest){
                highest = array[i];
            }
        }
        return highest;
    }   

    public static int lowestVal(int[] array){
        int lowest = 100;
        for(int i = 0; i < array.length; i++){
            if(array[i] < lowest){
                lowest = array[i];
            }
        }
        return lowest;
    }

    public static int averageVal(int[] array){
        int sum = 0;
        for(int i =0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }

    public static int sumOfVals(int[] array){
       int sum = 0;
        for(int i =0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
