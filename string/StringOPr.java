package study.string;

public class StringOPr 
{

	public static void get_length(String str)
	{
		int a=str.length();
		System.out.println(a);
	}
	public static void show_substring(int a,int b,String str)
	{
		String str1="";
		str1=str1+str.substring(a, b);
		System.out.println(str1);
		
	}
	public static void vowels(String str)
	{
		int cnt=0;
		String str1;
		str1=str.toUpperCase();
		for(int i=0;i<str.length();i++)
		{
			if(str1.charAt(i)=='A' || str1.charAt(i)== 'E' ||str1.charAt(i)== 'I'||str1.charAt(i)== 'O'||str1.charAt(i)== 'U')
			{
				cnt++;
				
			}
		}
		System.out.println("Total Number Of Vowels:"+cnt);
	}
	public static void noofwhitespaces(String str)
	{
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isWhitespace(str.charAt(i)))
			{
			cnt++;
			
			}
			
		}
		System.out.println("Total Number Of White Spaces Are:"+cnt);
		
	}
	
	
	public static void noofDigit(String str)
	{
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
			cnt++;
			
			}
			
		}
		System.out.println("Total Number Of Digits are:"+cnt);
		
	}
	public static boolean check_palindrome(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i).equalsto(str.charAt(str.length()-i)));
			{
				return true;
			}
			else
				return false;
		}
	}
	
}
