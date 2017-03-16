import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {
			int totalTests = in.nextInt();
			in.nextLine();
			for (int i = 1; i <= totalTests; ++i) {
				int arrayLength = in.nextInt();
				in.nextLine();
				 
				Vector<Integer> A = new Vector<>();
				Vector<Integer> B = new Vector<>();
				 
				for (int j=0; j<arrayLength; j++) {
					A.add(in.nextInt());
				}
				A.sort(null);
				in.nextLine();
				for (int j=0; j<arrayLength; j++) {
					B.add(in.nextInt());
				}
				in.nextLine();
				B.sort(null);
				
				//split the vector as one with +ve values and the other one as -ve to zero values
				
				System.out.println("Case #" + i + ": " + multiplySortedArray(A, B));
			}
		}
	}
	
	public static BigInteger multiplySortedArray(Vector<Integer> a, Vector<Integer> b) {
		BigInteger result = BigInteger.ZERO;
		for (int i=0; i< a.size(); i++) {
			BigInteger temp_a = BigInteger.valueOf(new Long(a.get(i)));
			BigInteger temp_b = BigInteger.valueOf(new Long(b.get(b.size()-i-1)));
			result = result.add(temp_a.multiply(temp_b));
		}
		return result;
	}
}
