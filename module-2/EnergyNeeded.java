/*
Rusty DeGarmo
Professor Payne
Programming with Java
5 June 2021
*/

// import the scanner class
import java.util.Scanner;


public class EnergyNeeded {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create Scanner Object

        System.out.println("Enter the amount of water in kilos: ");
        double waterMass = myObj.nextDouble();

        System.out.println("Enter the starting temperature in Celsius: ");
        double initialTemperature = myObj.nextDouble();

        System.out.println("Enter the ending temperature in Celsius: ");
        double finalTemperature = myObj.nextDouble();

        double result = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed in joules is: " + result); 
    }
    
}





