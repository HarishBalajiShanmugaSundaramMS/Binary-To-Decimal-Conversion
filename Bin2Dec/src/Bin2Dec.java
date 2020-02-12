import java.util.Scanner;
import java.lang.Math;

public class Bin2Dec {
	public static void convert(int number) {
		String str = Integer.toString(number);
		int length = str.length();

		int sum = 0;

		StringBuffer sbf = new StringBuffer(str);
		sbf.reverse();
		for (int i = 0; i < length; i++) {
			int a = Character.getNumericValue(sbf.charAt(i));
			int c = (int) Math.pow(2, i);
			sum = sum + (a * c);
		}
		System.out.print(sum);

	}

	public static void main(String[] args) {
		System.out.println("Enter a Binary: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		convert(number);

	}

}
