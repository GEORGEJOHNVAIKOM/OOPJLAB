import java.util.*;
class Fibonacci
{
	int n1,n2,n3,limit;
	Fibonacci(int n)
	{
		limit=n;
		n1=0;
		n2=1;
	}
	void series()
	{
		System.out.println("The Fibonacci series upto "+limit+"are:");
		System.out.println(n1+""+n2+"");
		int i;
		for (i=3;i<=limit;i++)
			System.out.println(n3+"");
			n1=n2;
			n2=n3;
			
	}
}

public class FibonacciSeriesByConstructors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		Fibonacci f=new Fibonacci(n);
		f.series();
	

	}

}
