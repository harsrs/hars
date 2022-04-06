package caom.capgemini.day8;

interface Lambda
{
	public void print();
}

interface SumInterface
{
	public void sum(int a, int b);
}
public class MyLambda {
	
	public static void main(String[] args) {
		
		int aa=10;
		Lambda result= () -> System.out.println("Hello Java lambda");
		result.print();
		
		SumInterface sumInterface=(int a, int b) ->
		{
			int c=a+b;
			System.out.println(c);
		};
		sumInterface.sum(10, 10);
	}
	
	public static void print()
	{
		System.out.println("Hello Java");
	}
	
	public static void addingNumber(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}

}
