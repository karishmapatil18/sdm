package study.string;

import java.util.Scanner;

/*Q2.Create a class stringOpr in study.string package which will do below tasks.
1.show length of string        // stringName.length();
2.Show substring               //s.substring(0,5)
3.check Palindrome string
4.Count noof Vowels,number of white spaces and number of digits (Character class functions)
you can make this as menu driven program (hint : make use of built-in 
functions of String class refer javadoc)*/


public class Main {
    static int ch;
	public static void main(String[] args)
	{
		StringOPr strO = new StringOPr();
		do
		{
			System.out.println("Enter Your choice:");
			System.out.println("1)to get length  2)show substring 3)No Of Vowels 4)No of white spaces 5)no of digit");
			Scanner sc = new Scanner(System.in);
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter String");
				String str=sc.next();
				study.string.StringOPr.get_length(str);
				break;
			}
			case 2:
			{
				System.out.println("Enter String");
				String str = sc.next();
				System.out.println("Enter starting index");
				int a=sc.nextInt();
				System.out.println("Enter Ending index");
				int b=sc.nextInt();
				study.string.StringOPr.show_substring(a,b,str);
				break;
			}
			case 3:
			{
			    System.out.println("Enter String");
			    String str = sc.next();
			    study.string.StringOPr.vowels(str);
			    break;
			}
			case 4:
			{
				sc.nextLine();   // after 4...we press enter ...so it is already save in buffer memory..and it directly goes on line 58...to avoid this we need to free buffer memory while we use nextline()....
				System.out.println("Enter String");
			    String str = sc.nextLine();                   //whenever we use nextline() ----it takes all input before going to next line
			    study.string.StringOPr.noofwhitespaces(str);
			    
			    break;
			}
			case 5:
			{

			    System.out.println("Enter String");
			    String str = sc.next();
			    study.string.StringOPr.noofDigit(str);
			    break;
			}
			case 6:
			{
				System.out.println("Entedr String");
				String str = sc.next();
				boolean a=study.string.StringOPr.check_palindrome(str);
				if(a==true)
				{
					System.out.println("It's a Palindrome");
				}
				else
				System.out.println("It's not a palindrome");
			}
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}while(ch != 10);

		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end of main

}//end of class
