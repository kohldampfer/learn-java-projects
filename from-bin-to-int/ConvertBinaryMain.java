import java.util.*;
import java.io.*;

public class ConvertBinaryMain {

  public static void main(String args[]) {
    BufferedReader br = null;
    
    try {
    
      br = new BufferedReader(new InputStreamReader(System.in));
    
      System.out.println("Enter something: ");
      String input = br.readLine();
      
      System.out.println("Input was: '" + input + "'");
      
      int result = ConvertBinary.convert(input);
      
      System.out.println("Result is: '" + result + "'");
    
    } catch (NoBinaryNumberException n) {
      System.out.println(n.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
