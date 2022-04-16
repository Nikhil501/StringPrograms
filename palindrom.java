package StringPrograms;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
			
		String s="abba";
		String  s1="";
		int a=s.length();
		
		for (int i = a-1; i >= 0; i--) {
			 s1=s1+s.charAt(i);
		}
		if (s.equals(s1))
		{
		System.out.println("String is palindrom");	
		} else {
			System.out.println("String is not palindrom");	

		}
		}

}