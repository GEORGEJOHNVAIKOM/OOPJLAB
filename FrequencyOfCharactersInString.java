import java.util.Scanner;
public class FrequencyOfCharactersInString 
{

	public static void main(String[] args)
	{
		System.out.println("Enter the string:  ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter the character: ");
		char ch= sc.next().charAt(0);
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if (ch==str.charAt(i))
				count++;
		}
                      
        if(count==0)
        	System.out.println("Element not present");
        else
        	System.out.println("Frequency:"+count);
}
}