//Password Program- Java Edition
//Jack Kalina
//Main Functions File

//Base functions done by me. However I used a lot of help from java documentation and then some examples 
//from stackoverflow for examples on use.


import static java.lang.System.*;
import java.util.Scanner;
import java.io.*;

public class passwordFunctions {

  public static String write(String acct, String pass) {
   try{ //based on stack overflow/ java documentation
    PrintWriter writer = new PrintWriter((acct + ".txt"), "UTF-8");
    writer.println(pass);
    writer.close();
} catch (IOException e) {
   return "Error writing to file '" + acct + ".txt" + "'. Please restart.";
}
  return "error";
  }
  public static String get(String acct) {
  try { //reader is based heavily on different sources from stack overflow and java documentation
    String pass = null;
    String fileName = (acct + ".txt");
       FileReader fileReader = 
           new FileReader(fileName);
       BufferedReader bufferedReader = 
           new BufferedReader(fileReader);
       while((pass = bufferedReader.readLine()) != null) {
           return pass;
       }   
        bufferedReader.close();         
    } catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + acct + ".txt" + "'. Please restart.");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" + acct + ".txt" + "'. Please restart.");                  
        }
    return null;
  }
  }


