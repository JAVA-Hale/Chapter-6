package Excercises;

import java.util.Scanner;

public class EvenEntryLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int userChoice = 0;
        while (userChoice != 999) {

            System.out.println("Please type a number >>>> ");
            userChoice = input.nextInt();

            if (userChoice % 2 == 0) {
                System.out.println("Even");
            }
            else
                System.out.println("Odd");

        }



        }

    }

