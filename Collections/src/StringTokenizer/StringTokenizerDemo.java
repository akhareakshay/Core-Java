package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		String str = "Hari krishna, Naresh i Technology";
		
	//	StringTokenizer st = new StringTokenizer(str);
		
	//	StringTokenizer st = new StringTokenizer(str,",");
		
		StringTokenizer st = new StringTokenizer(str,",",false);
		
		System.out.println("Number of tokens : "+st.countTokens());
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}

	}

}
