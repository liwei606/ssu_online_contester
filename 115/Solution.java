import java.util.Scanner;

public class Solution
{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int d = s.nextInt();
		int m = s.nextInt();

		int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		if (m <= 0 || d <= 0 || m > 12 || d > 31) {
			System.out.println("Impossible");
			return;
		}
		if (d > days[m]) {
			System.out.println("Impossible");
			return;
		}
		int dsum = 0;

		for (int i = 1; i < m; ++i) {
			dsum += days[i];
		}
		dsum += d;
		int weekday = dsum % 7;
		if (weekday == 0) weekday = 7;
		System.out.println(weekday);

	}
};
