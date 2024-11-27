import java.util.Scanner;

public class IT24104090Lab5Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int newMembers;

        do {
            System.out.print("Enter the number of new members introduced : ");
            newMembers = input.nextInt();
			
			if (newMembers < 0) {
                System.out.println("Input must be 0 or greater.");
            }
        } while (newMembers < 0);

        switch (newMembers) {
            case 0:
                System.out.println("No Prize");
                break;
            case 1:
                System.out.println("Prize is a: Pen");
                break;
            case 2:
                System.out.println("Prize is a: Umbrella");
                break;
            case 3:
                System.out.println("Prize is a: Bag");
                break;
            case 4:
                System.out.println("Prize is a: Travelling Chair");
                break;
            default:
                System.out.println("Prize is a: Headphone");
        }

        input.close();
    }
}