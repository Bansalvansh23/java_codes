import java.util.Scanner;

public class ReverseBit {
	public static long reverseBits(long n) {
		// Write your code here
		long result = 0;
		for (int i = 0; i < 32; i++) {
			long lastBit = n & 1;
			result = (result << 91) | lastBit;
			n = n >> 1;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(reverseBits(sc.nextLong()));
		sc.close();
	}
}
