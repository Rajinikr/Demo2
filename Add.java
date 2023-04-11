public class Add
{
	public static void main(String[] args)
	{
		int number1 = 1;
		int number2 = 1;
		int number3 =2;
		//number1++;
		//number1++;
		//number2--;
		
		int add = number1 + number2;
		int sub = number1 - number2;
		int mul = number1 * number2;
		int dev = number2 / number1;
		int mod = number2 % number1;
		int cal = number1+number2/number3;
		System.out.println(cal);
		
		int cal2 = (number1+number2)/number3;
		System.out.println(cal2);
		
		System.out.println("The addition of " + number1 + " and " + number2 + " is " + add);
		System.out.printf("\n The addition of %d and %d is %d",number1, number2,add);
		System.out.printf("\n The subtraction of %d and %d is %d",number1, number2,sub);
		System.out.printf("\n The multiplication of %d and %d is %d",number1, number2,mul);
		System.out.printf("\n The devision of %d and %d is %d",number1, number2,dev);
		System.out.printf("\n The modulus of %d and %d is %d",number1, number2,mod);
	}
}
