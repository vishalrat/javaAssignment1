package vishalhello;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String queryString="asd ad cc c from asd b asd orderby";
		String str="";
		int indexfrom=0;
		int indexorder=0;
		int c=0;
		String[] newString=queryString.toLowerCase().split(" ");
		String[] result;
		
		
		for(int i=0;i<newString.length;i++)
		{
			if(newString[i]=="from")
			{
				
				c=1;
				
			}
			else if(newString[i]=="orderby"||newString[i]=="groupby")
			{
				indexorder=i;
				break;
				
			}
			else
			{
				if(c==1)
				{
				
				str=str+newString[i];
				}
			}
			
			
		}
			System.out.println(str); 

	}

}
