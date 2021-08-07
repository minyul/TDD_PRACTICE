package random;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Minyul {

	public static void main(String[] args) {
		String text = "//;\n1;2;3";
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		if (m.find()) {
			String customDelimiter = m.group(1);
			String[] tokens = m.group(2).split(customDelimiter);
			for(String str : tokens) {
				System.out.println(str);
			}
		}
	}
}
