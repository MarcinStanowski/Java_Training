import java.util.Scanner;

public class Skaner {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); //nowy obiekt
		System.out.println("Podaj imi�");
		String imie = input.nextLine();
			
		System.out.println("Podaj wiek");
		int wiek = input.nextInt();
		System.out.println("Nazywasz si� " + imie + ", Tw�j wiek to " + wiek + " lat.");
	}

}
