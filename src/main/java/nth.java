package vishalhello;

import java.util.Scanner;

public class nth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s=sc.next();
				System.out.print(s);
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=x;j++)
			{
				System.out.print(x+" ");
			}
			x++;
		}
		
	}

}
