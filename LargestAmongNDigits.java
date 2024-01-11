import java.util.*;

class LargestAmongNDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a length of array : ");
        int lengthOfArray = input.nextInt();
        input.nextLine();

        float[] numberArray = new float[lengthOfArray];

        System.out.print("Enter the elments of the array : ");
        
        for(int i = 0; i<lengthOfArray; i++) {
            numberArray[i] = input.nextFloat();
        }

        float maxNum = maximumNumber(numberArray);

        System.out.println("The maximum number in the array is : " + maxNum);
    }
     // Finding the maximum number in array method
     static float maximumNumber(float[] array) {

        float max = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
     }
}