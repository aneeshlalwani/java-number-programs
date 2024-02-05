/***************
 * A strong number, also known as a digital factorial, is a number whose sum of factorial digits equals the number itself. 
 * In general, if a number 'n' is a strong number, the sum of the factorials of its digits will be equal to 'n'. 
 * For example, let's consider the number 145: 1! + 4! + 5! = 1 + 24 + 120 = 145. 
 * Hence 145 is a Strong Number.
 ***************/

import java.util.*;
class StrongNumber {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check either It is a Strong or not : ");
        int number = input.nextInt();

        int savedNumber = number;

        int i,digitFactorial,remainder;
        int sum = 0;
        while (number != 0){
           i = 1;
           digitFactorial = 1;
           remainder = number % 10;
           
           while (i <= remainder){
                digitFactorial = digitFactorial * i;
                i++;
           }
           sum += digitFactorial;
           number /= 10;     
        }
        
        if(sum == savedNumber){
            System.out.println(savedNumber+" is a Strong Number!");
        } else {
            System.out.println(savedNumber+" is NOT a Strong Number!");
        }
    }
}