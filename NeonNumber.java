/***************
 * A neon number is a number where the sum of digits of square of the number is equal to
 * the number itself.
 * For Example: 9 is a neon number. It's square is 9 * 9 = 81, and sum of the digits
 * 8 + 1 = 9
 * 1 is also a neon number
 * NOTE: Except 1 and 9 there are no more neon numbers between 1 and n
 ***************/
import java.util.*;

class NeonNumber{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check either It is Neon or not : ");
        int number = input.nextInt();

        int square = number * number; // finding square of number

        // Calculating the sum of square
        int sum = 0;
        while(square > 0){
            sum += square % 10;
            square /= 10;
        }
        if(sum == number){
            System.out.println(number+" is a neon number!");
        } else {
            System.out.println(number+" is NOT a neon number!");
        }
    }
}