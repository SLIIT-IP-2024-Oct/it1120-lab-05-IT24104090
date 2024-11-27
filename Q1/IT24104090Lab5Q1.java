import java.util.Scanner;

public class IT24104090Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int number3 = input.nextInt();

        int largest, smallest;

        if (number1 >= number2 && number1 >= number3) {
            largest = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            largest = number2;
        } else {
            largest = number3;
        }

        if (number1 <= number2 && number1 <= number3) {
            smallest = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            smallest = number2;
        } else {
            smallest = number3;
        }
         
		System.out.println("User entered numbers are :" + number1 + " " + number2 + " " + number3);
        System.out.println("The Largest number: " + largest);
        System.out.println("The Smallest number: " + smallest);
    }
}