package Excercises;

import java.util.Scanner;

public class TestScoreStatistics {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numOfEntries = -1;
        int high = 0;
        int low = 100;
        int aug = 0;
        int scoreTotal = 0;
        int userEntry = 0;
        while (userEntry != 999) {
            System.out.println("Please enter a test score >>>> ");
            userEntry = input.nextInt();

            if(userEntry > high) {
                if(userEntry == 999){

                }
                else
                    high = userEntry;
//                System.out.println("Big Brain!");
            }
            else if(userEntry < low){
                low = userEntry;
//                System.out.println("Small Brain!");
            }

            numOfEntries++;
            scoreTotal = scoreTotal + userEntry;


        }
        aug = (scoreTotal-999)/numOfEntries;
        System.out.println("High " + high + " Low " +low);
        System.out.println("Your average is " + aug);
    }

    }
