package com.bridgelabz.practiseprograms;
import java.util.Scanner;
public class palindrom{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str = "Madam", reverseStr = "";
	    
	    //int strLength = str.length();

	    //for (int i = (strLength - 1); i >=0; --i) {
	      //reverseStr = reverseStr + str.charAt(i);
	    //}

	    //if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      //System.out.println(str + " is a Palindrome String.");
	    //}
	    //else {
	      //System.out.println(str + " is not a Palindrome String.");
	    //}
	  //}
	//}
		String x, y = "";
	       Scanner a = new Scanner(System.in);
	      System.out.print("Enter  string you want to check:");
	     x = a.nextLine();
	        int l = x.length();
	       for(int k = l - 1; k >= 0; k--)
	     {
	          y = y + x.charAt(k);
	      }
	      if(x.equalsIgnoreCase(y))
	        {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        {
	            System. out.println("The string is not a palindrome.");
	        }

}
}
	