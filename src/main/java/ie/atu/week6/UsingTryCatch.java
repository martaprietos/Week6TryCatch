package ie.atu.week6;

import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 0 and 9: ");
        Scanner scan1 = new Scanner(System.in);

        String input = scan1.nextLine();

        int myNum = Integer.parseInt(input);

        if (myNum >=0 && myNum <=9){
            System.out.println("You entered " + myNum);
        }
        else{
            System.out.println("Not a valid number");
        }
    }
}
