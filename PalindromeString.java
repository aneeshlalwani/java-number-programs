import java.util.*;

class PalindromeString {
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string to check either It's a palindrome or not : ");
        String inputValue = input.nextLine();

        // making the String mutable
        StringBuffer stringBuffer = new StringBuffer(inputValue);

        String reversedValue = stringBuffer.reverse().toString();

        if(inputValue.equals(reversedValue)) {
            System.out.println("Entered String is a PALINDROME....");
        }else {
            System.out.println("Entered String is NOT PALINDROME....");
        }
    }
}