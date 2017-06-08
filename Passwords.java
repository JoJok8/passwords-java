//Password Program- Java Edition
//Jack Kalina
//Runner File

/*
 * The way this works is it takes user input to determine whether the user wants to log a password, retrieve a password,
 * or end the program. When save is used, it writes a file that has the name of the account and one line in it-
 * the password. This method was used as this seemed like it worked perfectly well without becoming overly complicated
 * and risky, as just reading from one file is more difficult than it is in python. When get is used, it opens the file
 * with the name of the account (which is why that get function works better) and reads the only thing inside of the 
 * file, the password. It then returns that password and prints it to the user. For cancel tow ork, I place the entire
 * thing inside of a while loop based on a boolean 'on' (since I'm creative). When cancel is outputted, it simply 
 * alerts the user that the program is closing and changes 'on' from true to false. 
*/
import static java.lang.System.*;
import java.util.Scanner;
import java.io.*;

public class Passwords {
  public static boolean on = true;
  public static void main( String[] args ){
    while(on == true){
  Scanner keyboard = new Scanner(System.in);
  System.out.println("\nWelcome to this Password Logger! To navigate, use 'save', 'get', or 'cancel'.");
  System.out.println("Would you like to save a password, get a password, or cancel?\n");
  String next = keyboard.nextLine();
  if(next.equals("save")){
    System.out.println("\nWhat account is this password for?\n");
    String acct = keyboard.nextLine();
    System.out.println("\nWhat is the password for this account?\n");
    String pass = keyboard.nextLine();
    passwordFunctions.write(acct, pass);
    System.out.println("\nPassword added!\n");
  } else if(next.equals("get")){
    System.out.println("\nWhat account should I retrieve the password for?\n");
    String acct = keyboard.nextLine();
    String pass = passwordFunctions.get(acct);
    System.out.println("\nThe password to " + acct + " is " + pass + ".\n");
  } else if(next.equals("cancel")){
    System.out.println("\nShutting down...");
    on = false;
  } else {
    System.out.println("\nInvalid entry. Please enter 'save', 'get', or 'cancel'.");
  }
  }
  } 
}

