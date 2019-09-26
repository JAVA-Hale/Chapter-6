package Assignment;

import java.util.Random;
import java.util.Scanner;

public class OpenDoorGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice = 4;
        int Door1 = 100;
        int Door2 = 500;
        int Door3 = 1000;
        while (choice >= 4) {
            System.out.println("Pick a door \n1-for Door1 \n2-for Door2\n3-for Door3");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("You win " + Door1);
            }

            if (choice == 2) {
                System.out.println("You win " + Door2);
            }

            if (choice == 3) {
                System.out.println("You win " + Door3);
            } else
                System.out.println("That is not a choice! Try again");

        }
    }
}
