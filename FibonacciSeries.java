import java.util.*;

class FibonacciSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number to get a Fibonacci Series : ");
        int inputValue = input.nextInt();

        int firstNumber = 0, secondNumber = 1;
        int count = 0;
        while(true){
            int result = firstNumber + secondNumber;
            count++;
            if(result > inputValue){
                break;
            }
            firstNumber = secondNumber;
            secondNumber = result;

            System.out.println("Fibonacci No: ["+count+"] -> " +result);
        }
    }
}