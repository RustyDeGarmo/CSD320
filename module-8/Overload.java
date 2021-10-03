/*
Rusty DeGarmo
Professor Payne
Programming with Java
3 July 2021
*/



public class Overload{
            //initialize global service charges
        static double standardService = 59.99;
        static double oilChange = 29.99;
        static double tireRotation = 49.99;

    public static void main(String[] args){
        System.out.println();
        System.out.println("Service charges are:");
        System.out.println("Standard Service: $59.99");
        System.out.println("Oil Change: $29.99");
        System.out.println("Tire Rotation: $49.99");

        //test method calls
        System.out.println();
        System.out.print("Your standard service charge is: $");
        System.out.print(yearlyService());
        System.out.println();

        System.out.print("Your second standard service charge is: $");
        System.out.print(yearlyService());
        System.out.println();

        System.out.print("Your service charge with an oil change is: $");
        System.out.println(yearlyService(true));
        System.out.println();

        System.out.print("Your service charge without an oil change is: $");
        System.out.println(yearlyService(false));
        System.out.println();

        System.out.print("Your service charge with an oil change and tire rotation is: $");
        System.out.println(yearlyService(true, true));
        System.out.println();

        System.out.print("Your service charge with an oil change but without a tire rotation is: $");
        System.out.println(yearlyService(true, false));
        System.out.println();

        System.out.print("Your service charge with an oil change, tire rotation, and coupon of $12.99 is: $");
        System.out.println(yearlyService(true, true, 12.99));
        System.out.println();

        System.out.print("Your service charge with an oil change and a coupon of $9.99 is: $");
        System.out.println(yearlyService(true, false, 9.99));
        System.out.println();
       
        
        
    }

    public static double yearlyService(){
        return standardService;
    }

    public static double yearlyService(boolean oil){
        if(oil){
        return(standardService + oilChange);
        }else{
            return(standardService);
        }

    }

    public static double yearlyService(boolean oil, boolean rotate){
        if(oil){
            if(rotate){
                return(standardService + oilChange + tireRotation);
            }else{
                return(standardService + oilChange);
            }
        }else{
            if(rotate){
                return(standardService + tireRotation);
            }else{
                return(standardService);
            }
        }
    }

    public static double yearlyService(boolean oil, boolean rotate, double coupon){
        if(oil){
            if(rotate){
                if(coupon > 0){
                    return(standardService + oilChange + tireRotation - coupon);
                }else{
                    return(standardService + oilChange + tireRotation);
                }
            }else{
                if(coupon > 0){
                    return(standardService + oilChange - coupon);
                }else{
                    return(standardService + oilChange);
                }
            }
        }else{
            if(rotate){
                if(coupon > 0){
                    return(standardService + tireRotation - coupon);
                }else{
                    return(standardService + tireRotation);
                }
            }else{
                if(coupon > 0){
                    return(standardService - coupon);
                }else{
                    return(standardService);
                }
            }
        }
    }
}



