/*
Rusty DeGarmo
Professor Payne
Programming with Java
25 June 2021
*/


public class Triangle{
    public static void main(String[] args){

    //outer loop determines the number of lines in the triangle
    for(int a = 0; a < 1; a++){
        for(int b = 0; b < 1; b++){
            for(int c = 0; c < 1; c++){
                for(int d = 0; d < 1; d++){
                    for(int e = 0; e < 1; e++){
                        for(int f = 0; f < 1; f++){
                            for(int g = 0; g < 1; g++){
                                System.out.println("              1                  @");
                                System.out.println("");
                            }
                            System.out.println("            1 2 1                @");
                            System.out.println("");
                        }
                        System.out.println("          1 2 4 2 1              @");
                        System.out.println("");
                    }
                    System.out.println("        1 2 4 8 4 2 1            @");
                    System.out.println("");
                }
                System.out.println("      1 2 4 8 16 8 4 2 1         @");
                System.out.println("");
            }
            System.out.println("   1 2 4 8 16 32 16 8 4 2 1      @");
            System.out.println("");
        }
        System.out.println("1 2 4 8 16 32 64 32 16 8 4 2 1   @");
    }

    
    }
}