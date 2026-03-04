class Fact
{
	public static void main(String[]args)
	{
	
		int n = 6 , Fact=1,temp=n;
		while(n>1)
		{
			Fact*=n--;
		}
		System.out.println(temp+" Factorial is :"+Fact);
	}
}
