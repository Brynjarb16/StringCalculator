package is.ru.StringCalculator;
import java.util.ArrayList; 

public class Calculator {
	private static String deli = ("[\n ,]");

	public static int add(String text) {
		if(text.equals("")){
			return 0;
		}
		else{
			if(text.contains("//")){
				return sum(removeDeli(text));
			}
			else if (text.contains(",") || text.contains("\n")){
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
			else if(toInt(number) > 1000){

			}
			else{
				total += toInt(number);
			}
		}
		if(negative.size() > 0){
			throw new RuntimeException("Negatives not allowed: " + negative);
		}
		return total;
	}

	private static String [] removeDeli(String numb){
		int index = numb.indexOf("//") + 2;
 		deli = deli + "|" + numb.substring(index, index + 1); 
 		numb = numb.substring(index + 2); 
 		return numb.split(deli);
	}
}