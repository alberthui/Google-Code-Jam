import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
	try(Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {  
	    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    in.nextLine();
	    Stack<String> stack = new Stack<>();
	    
	    for (int i = 1; i <= t; ++i) {
	      String n = in.nextLine();
	      StringTokenizer st = new StringTokenizer(n);
	      while (st.hasMoreTokens()) {
	    	  stack.push(st.nextToken());
	      }
	      
	      StringBuffer sb = new StringBuffer();
	      while(!stack.isEmpty()) {
	    	  sb.append(stack.pop());
	    	  sb.append(" ");
	      }
	      
	      System.out.println("Case #" + i + ": " + sb);
	    }
	  }
  }
}