import java.util.Scanner;

public class Solution
{

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int fib[] = new int[50];
		fib[0] = 0;
		fib[1] = 1;
		int sum = fib[1];
		for (int i = 2; i <= k; ++i) {
			fib[i] = fib[i - 1] + fib[i - 2];
			sum += fib[i];
		}
		System.out.println(sum);
	}
};
