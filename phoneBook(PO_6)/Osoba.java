

public class Osoba extends Wpis {
	String imie;
	String nazwisko;
	String adres;
	NrTelefoniczny numer;
	// nrTelefonu
	public Osoba(String imie, String nazwisko, String adres, int nrkierunkowy, int nrTelefonu){
	        this.imie = imie;
	        this.nazwisko = nazwisko;
	        this.adres = adres;
	        this.numer = new NrTelefoniczny(nrkierunkowy, nrTelefonu);
	}
	public void opis() {
	  System.out.println("Osoba: " + imie + " " + nazwisko + "  Adres: " + adres);
	  numer.printNumber();
	}
}