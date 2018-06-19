package vishalhello;

import java.util.Scanner;

public class VOWEL {

	public String vowelConsonants(String name) {
		// TODO Auto-generated method stub
		String str="";
		
		for(int i=0;i<name.length();i++)
		{
			if(Character.isLetter(name.charAt(i)))
			{
				if(name.charAt(i)=='a' || name.charAt(i)=='A' || name.charAt(i)=='e' || name.charAt(i)=='E' || name.charAt(i)=='i' || name.charAt(i)=='I' || name.charAt(i)=='o' || name.charAt(i)=='O' ||     name.charAt(i)=='u' || name.charAt(i)=='U')
				{
					str=str+"Vowel";
					
				}
				else
					str=str+"Consonant";
			}
			else
				str=str+"Not a alphabet";
		}
		return str;
	}
	

}
