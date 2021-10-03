/*
Rusty DeGarmo
Professor Payne
Programming with Java
11 June 2021
*/

// A program that plays rock, paper, scissors

//import Scanner and Math
import java.util.Scanner;
import java.util.Random;

public class RPS {
    public static void main(String[] args) {
        
        // Get the cpu roll
        Random rand = new Random();
        int cpuRoll = rand.nextInt(3) + 1;

        //testing my rng
        //System.out.println(cpuRoll);
        
        // Create a scanner
        Scanner myObj = new Scanner(System.in);

        // Greeting and explanation 
        System.out.println();
        System.out.println("Hello! Guess rock, paper, or scissors!" 
            + System.lineSeparator() + "1: Rock"
            + System.lineSeparator() + "2: Paper"
            + System.lineSeparator() +"3: Scissors");


        // Get the user guess
        int userGuess = myObj.nextInt();


        // testing the cpu roll
        System.out.println("The computer rolled: " + cpuRoll +
            " You chose: " + userGuess);
        System.out.println();

        //compare the rolls and evaluate the winner
        if(cpuRoll == userGuess){
            System.out.println("You picked the same attack! It's a tie.");
        }
        else if(cpuRoll == 1){
            if(userGuess == 2){
                System.out.println("The computer rolled rock. You chose paper. "
                    + "Paper beats rock, you win!");
            }else{
                System.out.println("The computer rolled rock. You chose scissors. "
                    + "Rock beats scissors, you lose!");
            }
        }
        else if(cpuRoll == 2){
            if(userGuess == 1){
                System.out.println("The computer rolled paper. You chose rock."
                    + "Paper beats rock, you lose!");
            }else{
                System.out.println("The computer rolled paper. You chose scissors. "
                    + "Scissors beats paper, you win!");
            }
        }
        else if(cpuRoll == 3){
            if(userGuess == 1){
                System.out.println("The computer rolled scissors. You chose rock. "
                    + "Rock beats scissors, you win!");
            }else{
                System.out.println("The computer rolled scissors. You chose paper. "
                    + "Scissors beats paper, you lose!");
            }
        }
    }
}