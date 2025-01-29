import java.util.Scanner;

public class Input{
    public static void main(String args[]){
        // Creating a scanner object
        Scanner scanner = new Scanner(System.in);

        //Print statements ask the user for the information.
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();

        //After nextDouble reads its line, it creates a new empty line, so this line is needed to skip over that empty line.
        scanner.nextLine();

        System.out.println("Are you a smoker? (Yes or No): ");
        String smokes = scanner.nextLine();
        boolean isSmoker = false;
        // converts Yes or No into boolean value.
        if(smokes.equals("Yes")){
            isSmoker = true;
        }

        //Output
        System.out.println("");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Smokes: " + isSmoker);
    }
}
