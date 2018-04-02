
public class equation {

	public static void main(String[] args) {
		if(args.length < 3) {
		System.out.println("Za malo parametrow");
			return;
		}
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);

			if(a == 0){
				double x = (double) -c/b;

				System.out.println("To równanie liniowe, jego pierwiastkek to: " + x);
			}else{
				double delta = b*b - (4*a*c);
				System.out.println("Delta wynosi: " + delta);

				if(delta < 0){
					System.out.println("Delta ujemna, brak pierwiastkow w zbiorze liczb rzeczywistych");
					delta = Math.sqrt(-delta);
					b = -b;
					System.out.println("Rozwiazania biegunowe: \nx1= ("+b+"-"+delta+")/"+2*a);
					System.out.println("x2= ("+b+"+"+delta+")/"+2*a);

				}else if ( delta == 0){
					double x0 = (double) -b/ (2*a);

					System.out.println("Pierwiastkek: x0: "+x0);
				}else{
					double x1 = (-b+Math.sqrt(delta))/ (2*a);
					double x2 = (-b-Math.sqrt(delta))/ (2*a);

					System.out.println("Pierwiastki \n x1:"+x1+"\n x2:"+x2);
				}
			}
		}catch(NumberFormatException e) {
			System.out.println("Zly format liczby: " + e.getLocalizedMessage());
		}
	}
}
