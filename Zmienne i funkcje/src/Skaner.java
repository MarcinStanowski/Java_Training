import java.util.Scanner;

public class Skaner {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); //nowy obiekt
		System.out.println("Podaj imiê");
		String imie = input.nextLine();
			
		System.out.println("Podaj wiek");
		int wiek = input.nextInt();
		System.out.println("Nazywasz siê " + imie + ", Twój wiek to " + wiek + " lat.");
	}

}
