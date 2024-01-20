import java.util.*;

class PascalTriangle {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines : ");
        int lines = input.nextInt();

        for(int i = 0; i < lines; i++){
            for(int j = 0; j < lines-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(" "+ factorial(i)/(factorial(j) * factorial(i-j)));
            }
            System.out.println("");
        }
    }

    // Method for Factorial
    public static int factorial(int number){

        int fact = 1;

        int i=1;
        while(i <=number){
            fact = fact * i;
            i++;
        }
        return fact;
    }
}