package com.company;
import java.util.Scanner;

/**
 * Created by Owner on 1/19/2017.
 */
public class Main {
    public static void main (String[] args){


        int userNum =  0; // stores entire number that will be reversed
        int i          =  0; // iteration count outer loop
        int x          =  0; // iteration count inner loop
        String userStringNum  = ""; // holds the entire number as a string
        Character firstUserNum = '_';  // holds first digit of userNumber
        Character secondUserNum = '-'; // holds second digit of userNumber
        Character thirdUserNum  = '-'; // holds third digit of userNumber
        Character fourthUserNum = '-'; // holds fourth digit of userNumber


        System.out.println("Type a number: ");
        Scanner scnr = new Scanner(System.in);
        userNum = scnr.nextInt();
        userStringNum = userStringNum.valueOf(userNum);


        //  for loop runs for the amount of times of the length of string minus 1
        //  if statement holds the value of each Character of the string in a different character

        for (i = 0; i < userStringNum.length(); ++i){

            if( (i == 0) && (userStringNum.length() >= 1 ) ){

                firstUserNum =  userStringNum.charAt(i);
            }
            if( (i == 1) && (userStringNum.length() >= 2 ) ){

                secondUserNum = userStringNum.charAt(i);
            }
            if( (i == 2) && (userStringNum.charAt(i) >= 3 ) ){

                thirdUserNum = userStringNum.charAt(i);

            }
            if( (i == 3) && (userStringNum.charAt(i) >= 4 ) ){

                fourthUserNum = userStringNum.charAt(i);

            }

        }


        System.out.print("Your number reversed is: ");
        System.out.print(fourthUserNum);
        System.out.print(thirdUserNum);
        System.out.print(secondUserNum);
        System.out.print(firstUserNum);





    }
}
