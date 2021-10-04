import java.util.Scanner;

public class palindromeChecker {
	
	public static void main(String args[])
	   {
	      String str, rev = "";
	      
	      // Takes String from user
		  Scanner scan = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = scan.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      // If-Else to check weather the string is Palindrome or not.
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	   }
}
