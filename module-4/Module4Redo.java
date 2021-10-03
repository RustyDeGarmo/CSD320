/*
Rusty Degarmo
Professor Payne
Programming with Java
20 July 2021
*/

//This is my redo
//I'm redoing module 4


//import Scanner
import java.util.Scanner;

public class Module4Redo{
    public static void main(String [] args){
        //create a scanner
        Scanner myObj = new Scanner(System.in);

        //prompt the user for the first string
        System.out.println("\nGive us a string.");
        String stringOne = myObj.nextLine();

        //prompt the user for the second string
        System.out.println("\nGive us another string.");
        String stringTwo = myObj.nextLine();


        //call the method to check if the strings are substrings of each other
        isSubString(stringOne, stringTwo);
        
    }

    public static void isSubString(String sOne, String sTwo){
        System.out.print("Your strings are: ");
        System.out.println("'" + sOne + "' and '" + sTwo + "'");
        if(sTwo.contains(sOne)){
            System.out.println("\n'" + sOne + "'' is a substring of '" + sTwo + "'");
        }else if(sOne.contains(sTwo)){
            System.out.println("\n'" + sTwo + "'' is a substring of '" + sOne + "'");
        }else{
            System.out.println("\nThere is no substring here.");
        }
    }
    
    

}