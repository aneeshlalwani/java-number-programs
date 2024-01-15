import java.util.*;
public class PrimeNumberLogicOne{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check either it's a prime or not : ");
        int number = input.nextInt();

        int count = 0; // increment counter

        for(int i=1; i<=number; i++){
            if(number%1 == 0){
                count++;
            }
        }
        if(count == 2) {       // exactly 2 if number is prime 
            System.out.println(number+" is a prime number");
        }else {
            System.out.println(number+" is NOT a prime number");
        }
    }
}