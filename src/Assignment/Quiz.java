package Assignment;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        int choice;
        int score = 0;
        Scanner input = new Scanner(System.in);

        while (score<4) {
            System.out.println("How many legs does a spider have?  \n 1-for 7 " +
                    "\n 2- for 8 \n 3- for 4 \n 4- for 10 \n choice >>>>");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Wrong");
            } else if (choice == 2) {
                System.out.println("Correct");
                score++;
            } else if (choice == 3) {
                System.out.println("Wrong");
            } else if (choice == 4) {
                System.out.println("Wrong");

            }
            System.out.println("what do they call it when a dog is trying to cool itself off?  \n 1-for sweating " +
                    "\n 2- for painting \n 3- for getting cold \n 4- for panting \n choice >>>>");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Wrong");
            } else if (choice == 2) {
                System.out.println("Wrong");
            } else if (choice == 3) {
                System.out.println("Wrong");
            } else if (choice == 4) {
                System.out.println("Correct");
                score++;

            }
            System.out.println("How many years can a snail sleep?  \n 1-for 5 years" +
                    "\n 2- for 2 years \n 3- for 1 year \n 4- for 3 years \n choice >>>>");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Wrong");
            } else if (choice == 2) {
                System.out.println("Wrong");
            } else if (choice == 3) {
                System.out.println("Wrong");
            } else if (choice == 4) {
                System.out.println("Correct");
                score++;
            }
            System.out.println("How many years can a panda live?  \n 1-for 15 years" +
                    "\n 2- for 20 years \n 3- for 10 year \n 4- for 30 years \n choice >>>>");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Wrong");
            } else if (choice == 2) {
                System.out.println("Correct");
                score++;
            } else if (choice == 3) {
                System.out.println("Wrong");
            } else if (choice == 4) {
                System.out.println("Wrong");
            }
            System.out.println("How long and much does a giraffe's neck weigh ?  \n 1-for 3ft 205lbs" +
                    "\n 2- for 2ft 100lbs \n 3- for 6ft 600lbs  \n 4- for 4ft 800lbs \n choice >>>>");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Wrong");
            } else if (choice == 2) {
                System.out.println("Wrong");
            } else if (choice == 3) {
                System.out.println("Correct");
                score++;
            } else if (choice == 4) {
                System.out.println("Wrong");
            }
            System.out.println("Your score is " + score + " out of 5");
        }
    }

}


