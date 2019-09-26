package Example;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int choice = 999;
        int counter = 0;
        int rand_pick = r.nextInt(10 + 1);
        while (choice != rand_pick) {


            System.out.println("Please pick a number between 1 and 10 >>>> ");
            choice = input.nextInt();

            if (choice == rand_pick) {
                System.out.println("Congratulations you are a good guesser. ");
            } else if (choice > rand_pick) {
                System.out.println("Nope, it was lower. The number is ");
            } else if (choice < rand_pick) {
                System.out.println("Nope, it was higher. The number is ");

            }
            counter++;
        }
        System.out.println("It took you " + counter + " chances");
    }
}