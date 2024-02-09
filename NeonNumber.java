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