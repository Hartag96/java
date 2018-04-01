
public class equation {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		if(a == 0){
			double x = (double) -c/b;

			System.out.println("To równanie liniowe, jego pierwiastkek to: " + x);
		}else{
		int delta = b*b - (4*a*c);

			if(delta > 0){
				double sqrt_delta = Math.sqrt(delta);
				double x1 = (-b+sqrt_delta)/ (2*a);
				double x2 = (-b-sqrt_delta)/ (2*a);

				System.out.println("Pierwiastki \n x1:"+x1+"\n x2:"+x2);
			}else if ( delta == 0){
				double x0 = (double) -b/ (2*a);

				System.out.println("Pierwiastkek: x1: "+x0);
			}else{
				System.out.println("Rownanie nie ma pierwiastkow");
			}
		}
	}

}
