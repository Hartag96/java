public class Firma extends Wpis {
	String nazwa;
	String adres ;
	NrTelefoniczny numer;
	public Firma(String nazwa, String adres, int nrkierunkowy, int nrTelefonu){
	        this.nazwa = nazwa;
	        this.adres = adres;
	        this.numer = new NrTelefoniczny(nrkierunkowy, nrTelefonu);
	}
	public void opis() {
	  System.out.println("Firma: " + nazwa + " Adres: " + adres);
	  numer.printNumber();
	}
}
