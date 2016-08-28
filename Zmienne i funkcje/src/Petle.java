
public class Petle {

	public static void main(String[] args) 
	{
		
		int n=100;
		System.out.println(ObliczSilnie(n));
	}
	
	public static double ObliczSilnie(int n)
	{
		double silnia = 1;
		int i=1;
		do
		{
			silnia = silnia * i;
			i++;
				}
		while(i<=n);
		return silnia;
	}
		
}
