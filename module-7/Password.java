/*
Rusty DeGarmo
Professor Payne
Programming with Java
3 July 2021
*/


public class Password{
    public static void main(String[] args){
        String p1 = "helloWorld";
        String p2 = "helloworld";
        String p3 = "hello";
        String p4 = "Hell0W0rld";
        verifyPassword(p1);
        verifyPassword(p2);
        verifyPassword(p3);
        verifyPassword(p4);
    }


public static boolean verifyPassword(String password) {
    //variables to hold bools starting at false
    boolean hasUpper = false;
    boolean hasLower = false;
    boolean hasNumber = false;
    
    //check if password is long enough, exit if not
    if(password.length() < 8){
    System.out.println("Password is too short. It must contain at least eight characters.");
    System.out.println();
    return false;
    }

    for(int i = 0; i < password.length(); i++) {
        
        //get an individual character
        char c = password.charAt(i);
        
        //check if there is at least one uppercase letter
        //also satisfies at least one letter requirement
        if(Character.isUpperCase(c)) {
            hasUpper = true;
            }
        
        //check if there is at least one lowercase letter
        else if(Character.isLowerCase(c)) {
            hasLower = true;
            }
        
        //check if there is at least one number
        else if(Character.isDigit(c)) {
            hasNumber = true;
            }
        }

    //check if all of the requirements were met
    if(hasUpper == true && hasLower == true && hasNumber == true) {
        System.out.println("Your password meets all of the requirements.");
        System.out.println();
        return true;
    }
    else{
        System.out.println("Your password doesn't meet all of the requirements.");
        System.out.println("Passwords must be at least 8 characters and contain at least one of each: ");
        System.out.println("Uppercase letter, lowercase letter, and number");
        System.out.println();
        return false;
    }
}
    
}



