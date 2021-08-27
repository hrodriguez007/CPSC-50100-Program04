//Heidy Rodriguez
//Programming Fundamentals
//Summer 2021
//Programming Assignment 4 (Test)

import java.util.Scanner;

public class Test {

   public static void main(String[] args) {

       Set set = new Set(); // create a new object of class Set
       System.out.println("Programming Fundamentals");
       System.out.println("NAME: HEIDY RODRIGUEZ");
       System.out.println("PROGRAMMING ASSIGNMENT 4 - SET");
       Scanner sc = new Scanner(System.in);
       String command, line;
       int x;
       
       // infinite loop
       while(true) {
           System.out.print("Enter command: ");
           line = sc.nextLine();
           // convert the command into array of strings
           String data[] = line.split(" ");
           if(data[0].equalsIgnoreCase("add")) { // add
               try {
                   if(data.length > 1) { // validate data has been passed
                       x = Integer.parseInt(data[1]); // convert the data to integer
                       set.add(x); // add x to set
                       System.out.println(set); // display the updated set
                   }else // data not passed
                       System.out.println("ERROR: Pass the integer to insert.");
               }catch(NumberFormatException e) {
            	   
            	   // data not integer
                   System.out.println("ERROR: Enter an integer as the data to insert.");
               }
           }
           else if(data[0].equalsIgnoreCase("del")) { // delete
               try {
                   if(data.length > 1) { // validate data has been passed
                       x = Integer.parseInt(data[1]); // convert the data to integer
                       set.delete(x); // delete x from set
                       System.out.println(set); // display the updated set
                   }else // data not passed
                       System.out.println("ERROR: Pass the integer to delete.");
               }catch(NumberFormatException e) {
            	   
            	   // data not integer
                   System.out.println("ERROR: Enter an integer as the data to delete.");
               }
           }
           else if(data[0].equalsIgnoreCase("exists")) { // exists
               try {
                   if(data.length > 1) { // validate data has been passed
                       x = Integer.parseInt(data[1]); // convert the data to integer
                       System.out.println(set.exists(x)); // display if x exists in set
                   }else // data was not passed
                       System.out.println("ERROR: Pass the integer to test exists.");
               }catch(NumberFormatException e) {
            	   
                   // data passed was not integer
                   System.out.println("ERROR: Enter an integer as the data to test exists.");
               }
           }
           else // invalid command
               System.out.println("Invalid command");
       }
   }

}