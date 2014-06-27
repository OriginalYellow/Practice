package intro2java.chap9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PE35Genes {

	public static void main(String[] args) {
		
		System.out.println("Enter the genetic code:");
		Scanner s = new Scanner(System.in);
		String code = s.next();
		/* This pattern will match any string that starts with "ATG" followed by groups of exactly 3
		 * characters that must be A, T, G, or C, followed by either "TAG", "TAA", or "TGA" (this
		 * pattern is described in better detail in the exercise on page 342 */
		Pattern p = Pattern.compile("(ATG)([ATGC]{3}+)+?((TAG)|(TAA)|(TGA))");
		Matcher m = p.matcher(code);
		System.out.println("The genes are: ");
		while (m.find()) {
			
			StringBuffer sb = new StringBuffer(m.group());
			/* Once it finds a gene with a beginning 3 group and a terminating 3 group, it cuts those
			 * groups off */
			sb.delete(0, 3);
			sb.delete(sb.length() - 3, sb.length());
			System.out.println(sb);
			
		}
		
	}
	
}
