import java.util.Scanner;
public class If_Else_Ex
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number between 1 to 10");
		int str = input.nextInt();
		//String str = input.nextline();
		
		if(str >=1 && str<=10)
		{
			System.out.println("Correct choice");	
		}
		else
		{
			System.out.println("Invalid choice");
			
		}
	}
}
