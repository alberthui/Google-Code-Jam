import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {
		    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		    in.nextLine();
		    for (int i = 1; i <= t; ++i) {
		        int credit = in.nextInt();
		        in.nextLine();
		        int n = in.nextInt();
		        in.nextLine();
		        int[] items = new int[n];
		        for (int j=0; j<n; j++) {
		        	items[j] = in.nextInt();
		        }
		        
		        //start calculate
		        for (int p=0; p<n-1; p++) {
		        	for (int q=p+1; q<n; q++) {
		        		if (items[p] + items[q] == credit) {
		        			System.out.println("Case #" + i + ": " + (p+1) + " " + (q+1));
		        		}
		        	}
		        }
		    }
		}
	}

}
