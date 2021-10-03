/*
Rusty DeGarmo
Professor Payne
Programming with Java
18 July 2021
*/

//import math to get some rng going on
import java.lang.Math;

public class Module11{

    public static void main(String[] args){
    
    //initialize some random arrays
    int [][] intArrayOne = new int[2][10];
    int [][] intArrayTwo = new int[2][15];

    double [][] dubArrayOne = new double[2][10];
    double [][] dubArrayTwo = new double[2][15];

    //fill the arrays
    fillArray(intArrayOne);
    fillArray(intArrayTwo);

    fillArray(dubArrayOne);
    fillArray(dubArrayTwo);


    //get the location of the largest elements
    int [] firstArray = locateLargest(intArrayOne);
    int [] secondArray = locateLargest(intArrayTwo);

    int [] thirdArray = locateLargest(dubArrayOne);
    int [] fourthArray = locateLargest(dubArrayTwo);

    int [] firstSmallArray = locateSmallest(intArrayOne);
    int [] secondSmallArray = locateSmallest(intArrayTwo);
    int [] thirdSmallArray = locateSmallest(dubArrayOne);
    int [] fourthSmallArray = locateSmallest(dubArrayTwo);


    //print the arrays
    System.out.println("\n\nThe values in the first array are: ");
    printArray(intArrayOne);
    System.out.print("\nThe coordinates of the largest value are: ");
    printArray(firstArray);
    System.out.print("\nThe coordinates of the smallest value are: ");
    printArray(firstSmallArray);
    System.out.println("\n\n");

    System.out.println("The values in the second array are: ");
    printArray(intArrayTwo);
    System.out.print("\nThe coordinates of the largest value are: ");
    printArray(secondArray);
    System.out.print("\nThe coordinates of the smallest value are: ");
    printArray(secondSmallArray);
    System.out.println("\n\n");

    System.out.println("The values in the third array are: ");
    printArray(dubArrayOne);
    System.out.print("\nThe coordinates of the largest value are: ");
    printArray(thirdArray);
    System.out.print("\nThe coordinates of the smallest value are: ");
    printArray(thirdSmallArray);
    System.out.println("\n\n");

    System.out.println("The values in the fourth array are: ");
    printArray(dubArrayTwo);
    System.out.print("\nThe coordinates of the largest value are: ");
    printArray(fourthArray);
    System.out.print("\nThe coordinates of the smallest value are: ");
    printArray(fourthSmallArray);
    System.out.println("\n\n");


        
        
    }

    public static int [] locateLargest (double [][] arrayParam){
        double largest = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        for(int i = 0; i < arrayParam.length; i++){
            for(int j = 0; j < arrayParam[i].length; j++){
                if(arrayParam[i][j] > largest){
                    largest = arrayParam[i][j];
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        int [] array = {firstIndex, secondIndex};
        return array;
    }

    public static int [] locateLargest (int [][] arrayParam){
        int largest = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        for(int i = 0; i < arrayParam.length; i++){
            for(int j = 0; j < arrayParam[i].length; j++){
                if(arrayParam[i][j] > largest){
                    largest = arrayParam[i][j];
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        int [] array = {firstIndex, secondIndex};
        return array;
    }

    public static int [] locateSmallest (double [][] arrayParam){
        double smallest = 100;
        int firstIndex = 0;
        int secondIndex = 0;
        for(int i = 0; i < arrayParam.length; i++){
            for(int j = 0; j < arrayParam[i].length; j++){
                if(arrayParam[i][j] < smallest){
                    smallest = arrayParam[i][j];
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        int [] array = {firstIndex, secondIndex};
        return array;
    }

    public static int [] locateSmallest (int [][] arrayParam){
        int smallest = 100;
        int firstIndex = 0;
        int secondIndex = 0;
        for(int i = 0; i < arrayParam.length; i++){
            for(int j = 0; j < arrayParam[i].length; j++){
                if(arrayParam[i][j] < smallest){
                    smallest = arrayParam[i][j];
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        int [] array = {firstIndex, secondIndex};
        return array;
    }

    public static void fillArray(int [][] arrayParam){
        for(int i = 0; i < arrayParam.length; i++){
            for(int j = 0; j < arrayParam[i].length; j++)
            arrayParam[i][j] = (int)(Math.random() * 100 + 1);
        }
    }

    public static void fillArray(double [][] arrayParam){
        for(int i = 0; i < arrayParam.length; i++){
            for(int j = 0; j < arrayParam[i].length; j++)
            arrayParam[i][j] = (int)((Math.random() * 100 + 1) * 100) / 100.0;
        }
    }

    public static void printArray(int [][] array){
        int arr = 1;
        
        for(int i = 0; i < array.length; i++){
            System.out.println("Embedded Array: " + arr);
            arr++;
            for(int j = 0; j < array[i].length; j++){
                    System.out.print(array[i][j] + " ");
                }
            System.out.println();
        }
    }

    public static void printArray(double [][] array){
        int arr = 1;
        
        for(int i = 0; i < array.length; i++){
            System.out.println("Embedded Array: " + arr);
            arr++;
            for(int j = 0; j < array[i].length; j++){
                    System.out.print(array[i][j] + " ");
                }
            System.out.println();
        }
    }
    

    public static void printArray(int [] array){
        for(int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
    }

    public static void printArray(double [] array){
        for(int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
    }
}




