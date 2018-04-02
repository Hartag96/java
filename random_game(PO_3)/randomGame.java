import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class randomGame {

	public static void main(String[] args) {
		Random generator = new Random();
		int rand = generator.nextInt(100);
		int n = 101;
		int i = 0;
		char c;
		System.out.println(rand);

		Scanner reader = new Scanner(System.in);

		while(n != rand){
			try{
				System.out.println("\nZgadnij: ");
				n = reader.nextInt();
				i++;

				if( n > rand)
					System.out.println("Liczba jest mniejsza");
				else if( n < rand )
					System.out.println("Liczba jest wieksza");
				else{
					System.out.println("Brawo Udalo Ci sie!\nWykonales "+i+" prob");
					System.out.println("Chcesz zagrac jeszcze raz? T/N");
					c = reader.next().charAt(0);
					if(c == 'T'){
						rand = generator.nextInt(100);
						n = 101;
						i = 0;
					}else if(c == 'N')
						System.out.println("Koniec");
					else
						System.out.println("Nieporawne polecenie, koncze dzialanie");
				}
			} catch (InputMismatchException e){
				System.out.println("Niewłaściwy format danych wejściowych, spróbuj ponownie");
				reader.next();
			}

		}
		reader.close();
	}

}
