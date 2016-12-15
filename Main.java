import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		do
		{
			a = sc.nextInt();
			while(a<0)
			{
				a = sc.nextInt();
			}
			b = sc.nextInt();
			while(b>10)
			{
				b = sc.nextInt();
			}
		}while(a+b>10);
		System.out.println(a+b);
	}
}