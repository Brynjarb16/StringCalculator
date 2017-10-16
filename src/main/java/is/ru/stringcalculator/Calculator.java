
package is.ru.stringcalculator;

public class Calculator {
	public static int add (String text) {
		if (text.equals(""))
			return 0;
		else {
			if (text.contains(",") || text.contains("\n")) {
				String [] numbers = text.split(",|\n");
				return getSum(numbers);
			}
			return toInt(text);
		}
	}

	private static int toInt (String number) {
		return Integer.parseInt(number);
	}

	private static int getSum (String [] numbers) {
		int total = 0;

		for (String number: numbers) {
			total += toInt(number);
		}
		return total;
	}
}