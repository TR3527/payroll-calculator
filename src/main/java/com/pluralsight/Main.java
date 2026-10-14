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

        System.out.println(workerName + (" gross pay: $") + grossPayCalc);



        reader.close();
    }
}
