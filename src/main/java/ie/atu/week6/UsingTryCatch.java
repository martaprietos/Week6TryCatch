package ie.atu.week6;

import java.util.Scanner;


public class UsingTryCatch {

    public static void main(String[] args) {
        int correct = 0;
        try (Scanner scan1 = new Scanner(System.in);) { //will close scanner for me when finished
            while(correct == 0) {
                System.out.println("Please enter a number between 0 and 9: ");
                String input = scan1.nextLine();
                try {
                    int myNum = Integer.parseInt(input);
                    if (myNum >= 0 && myNum <= 9) {
                        System.out.println("You entered " + myNum);
                        correct = 1;
                    } else {
                        System.out.println("Not a valid number");
                    }
                } catch (NumberFormatException ne) {
                    System.out.println("You have not entered a number / " + ne.getMessage());

                } catch (Exception e) {
                    System.out.println("You have made an error / " + e.getMessage());//add general catch to catch other errors
                }


            }
        }catch (NumberFormatException ne) {
            System.out.println("You have not entered a number / " + ne.getMessage());

        } catch (Exception e) {
            System.out.println("You have made an error / " + e.getMessage());//add general catch to catch other errors
        }
    }
}



