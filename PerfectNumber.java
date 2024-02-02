import java.util.*;

class PerfectNumber{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check either It is perfect or not : ");
        int number = input.nextInt();

        int sum = 0;    
        int i=1;    
        while(i<number){
            if(number % i == 0){
                sum += i;
            }
            i++;
        }

        if(sum == number){
            System.out.println(number+" is a perfect number!");
        }else{
            System.out.println(number+" is NOT a perfect number!");
        }
    }
}