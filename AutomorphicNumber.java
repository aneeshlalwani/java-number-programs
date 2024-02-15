/* An automorphic number is a number whose square ends in the same digits as the
 * number itself.
 * for example: 5, 6, 25 are automorphic numbers.
 * 5 * 5 = 25 --> last digit is 5
 * 6 * 6 = 36 --> last digit is 6
 * 25 * 25 = 625 --> last digit is 25
 */

import java.util.*;
class AutomorphicNumber {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check either It is automorphic or not : ");
        int number = input.nextInt();

        int inputHolder = number;
        int square = number * number; // Finding square

        System.out.println("Square of number is : " + square);

        int divisor = 10;
        boolean equal = false; // for checking equality
        while( number > 0 ){
            int remainder = square % divisor;
            if(number == remainder){
                equal = true;
                break;
            }
            number = number / 10;
            divisor = divisor * 10;

        }
        
        if(equal == true){
            System.out.println(inputHolder +" is an Automorphic number.");
        }else {
            System.out.println(inputHolder +" is NOT an Automorphic number.");
        }
    }
}