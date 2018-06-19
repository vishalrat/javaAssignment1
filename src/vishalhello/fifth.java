package vishalhello;

import java.util.Scanner;

public class fifth {

	public int sumEven(String name) {
		// TODO Auto-generated method stub
		
		
		int sum=0;
		int sum_t=0;
		int e=0;
		for(int i=0;i<name.length();i++)
		{
			
			if(Character.isDigit(name.charAt(i)))
			{
				sum_t=sum_t*10+(name.charAt(i)-'0');
				
			}
			else if((name.charAt(i))==' ')
			{
				
				sum=sum+sum_t;
				sum_t=0;
				e=1;
			}
			else
			{
				e=2;
				
			}
			
			
			
		}
		sum=sum+sum_t;
		if(e!=2)return(sum);
		else return 0;
		
			
	}

}
