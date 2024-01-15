import java.util.*;

public class PrimeNumberLogicTwo{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check either its prime or not : ");
        int number = input.nextInt();

        int check = 0; // check for 1
        if(number <= 1){
            check = 1;
        }

        int i = 2;
        while(i <= number/2){
            if(number % i == 0){
                check = 1;
                break;
            }else {
                i++;
            }
        }

        if(check == 0){
            System.out.println(number + " is a prime number.");
        }else {
            System.out.println(number + " is NOT a prime number.");
        }
    }
}