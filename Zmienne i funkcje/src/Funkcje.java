/**
 * 
 */

/**
 * @author Lenovo
 *
 */
public class Funkcje {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("wartosæ tuñczyka wynosi: " + tunczyk());
			
		System.out.println("suma "+ suma(7, 2));
		
		System.out.println("obwód ko³a: " + obliczObwodKola(10));
	}
	
		
	public static int tunczyk()
	{
		return 110;
	}
	
	
	public static int suma(int a, int b)
	{
			
		return (int) Math.pow(a+b, 3);
				
	}
	
	
	public static double obliczObwodKola(double R)
	{
		
		double obwodKola = 2*Math.PI*R;
		return obwodKola ;
	
	}
}
