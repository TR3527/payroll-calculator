package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter name: ");
        String workerName = reader.nextLine();

        System.out.print("Hours worked: ");
        float hoursWorked = reader.nextFloat();

//enter 20.5 ^

        System.out.print("Enter pay rate: ");
        float payRate = reader.nextFloat();

        //System.out.printf("%s (id: %d) $%.2f", name, id, pay);

        float grossPayCalc = payRate * hoursWorked;

        //System.out.println(workerName + (" gross pay: $") + grossPayCalc);

        //added a cleaner format below
        System.out.printf("%s (hoursWorked: %f) $%.2f", workerName, hoursWorked, grossPayCalc);

        //called .close() method

        reader.close();
    }



    //DO BONUS!!!!


}

/*You learned about if statements in your pre-work, so although we have not discussed
them in class, you should be able to figure out how to pay 1.5x overtime after 40 hours.
You can use the W3Schools guide as a reference
https://www.w3schools.com/java/java_conditions.asp
*/