package Unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75484");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		
		String str = "";
		for(int k=s.length()-1;k>=0;k--)
		{
			char ch = s.charAt(k);
			str = str+ch;
		}
		System.out.println(str);
		if(s.compareTo(str)==0)
		{
			System.out.println("Pallindrone");
		}
		else
			System.out.println("Not Pallindrine");
		

	}

	void reverseOfAString(String s) {
		String str = "";
		
		for(int k=s.length()-1;k>=0;k--)
		{
			char ch = s.charAt(k);
			str +=ch;
		}
		
		System.out.println(str);

	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		if(s1.compareTo(s2) == 0)
		{
			System.out.println("EQUAL");
		}
		else
			System.out.println("NOT EQUAL");
		
		
	}
}