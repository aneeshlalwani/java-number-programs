/***************
 * An Armstrong number, also known as a narcissistic number, is a special type of integer. 
 * It is equal to the sum of its own digits, each raised to the power of the number of digits. 
 * For example, let's consider the number 153: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153. 
 * 153 is an Armstrong number because the sum of the cubes of its digits equals the number itself. 
 ***************/ 

import java.util.*;
class ArmstrongNumber{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check either It is a Perfect Number or Not : ");

        int number = input.nextInt();

        int sum = 0;
        int temp = 0;
        int i = number;

        while(number > 0){
            temp = number % 10;
            number /= 10;
            sum += (temp * temp * temp);
        }
        if(sum == i){
            System.out.println(i+" is an ArmStrong Number!");
        } else {
            System.out.println(i+" is NOT an ArmStrong Number!");
        }
    }
}