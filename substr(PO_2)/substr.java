import java.util.InputMismatchException;

public class substr {

	public static void main(String[] args) {
		int start = 0;
		int end = 0;
		int length = 0;
		String str = null;

		try{
			start = Integer.parseInt(args[0]);
			end = Integer.parseInt(args[1]);
			str = args[2];
			str = str.substring(start, end+1);
			System.out.println("Z: "+args[2]+"\nrobie: "+str);
		} catch (StringIndexOutOfBoundsException e){
			System.out.println("Pramentry poza wymiarami napisu");
		} catch(NumberFormatException e){
			System.out.println("Nieporawnny pierwszy lub drugi argument");
		}

	}

}
