package is.ru.StringCalculator;
import java.util.ArrayList; 

public class Calculator {

	public static int add(String text) {
		if(text.equals("")){
			return 0;
		}
		else{
			if (text.contains(",") || text.contains("\n")){
 				String numbers [] = text.split(deli);
 				return sum(numbers); 
  			}
			return toInt(text);
		}
	}

	private static int toInt(String number){
		return Integer.parseInt(number); 
	}

	private static int sum(String [] numbers){
		int total = 0;
		ArrayList<Integer> negative = new ArrayList<Integer>();

		for(String number : numbers){
			if(toInt(number) < 0){
				negative.add(toInt(number));
			}
			total += toInt(number);
		}
		if(negative.size() > 0){
			throw new RuntimeException("Negatives not allowed: " + negative);
		}
		return total;
	}

	private static String deli = ("[\n ,]");
}