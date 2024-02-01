import java.util.*;

class LeapYear{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = input.nextInt();

        if(year%400 == 0){
            System.out.println(year+" is a LEAP YEAR!");
        } else if (year%100 == 0){
            System.out.println(year+" is NOT a LEAP YEAR!");
        } else if (year%4 == 0){
            System.out.println(year+" is a LEAP YEAR!");
        } else{
            System.out.println(year+" is NOT a LEAP YEAR!");
        }
    }
}