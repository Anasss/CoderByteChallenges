import java.util.Scanner;
import java.util.StringTokenizer;

class Main {  
	public static String LongestWord(String sen) { 

		// code goes here   
		/* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
		StringTokenizer st = new StringTokenizer(sen);
		String longest = "";
		while (st.hasMoreTokens()) {
			String word = st.nextToken();
			if (longest.length() < word.length()){
				longest = word;
			}
		}
		return longest;
	} 

	public static void main (String[] args) {  
		// keep this function call here     
		Scanner s = new Scanner(System.in);
		System.out.print(LongestWord(s.nextLine())); 
	}   

}