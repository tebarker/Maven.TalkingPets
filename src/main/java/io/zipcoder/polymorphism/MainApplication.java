package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {

    public static void main (String[] args){

        String userResponse;
        Scanner in = new Scanner (System.in);

        System.out.println("How many pets do you have?");
        userResponse = in.nextLine();
        System.out.println("User said: " + userResponse);

        System.out.println("What kind of animal is each of your pets?");
        userResponse = in.nextLine();
        System.out.println("User said " + userResponse);

        System.out.println("List the names of your pets!");
        userResponse = in.nextLine();
        System.out.println("User said " + userResponse);



    }

}
