/*
Rusty Degarmo
Professor Payne
Programming with Java
24 June 2021
*/

public class While {
    public static void main(String[] args) {
        //Declare my sentinel
        double i = 3;

        //while loop to display operations from small sentinel to large
        while(i <= 99){
            System.out.println("1 / " + i + " = " + 1 / i);
            i += 2;
        }

        //print a new line
        System.out.println();

        //while loop to display operations from large sentinel to small
        while(i > 3){
            //decrement operation goes first this time because i is 101 to start
            //the condition isn't >= 3 because if i is 3 to start then the operation
            //would be 1/1 and we want to stop at 1/3
            i -= 2;
            System.out.println("1 / " + i + " = " + 1 / i);
        }
    }
}







