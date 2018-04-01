
import java.util.*;
import java.util.Map.Entry;
public class phoneBook {



	public static void main(String[] args) {
			Osoba osoba1 = new Osoba("Janko", "Muzykant", "Lodz", 48, 668213531);
			Osoba osoba2 = new Osoba("Jan", "Dzban", "Zgierz", 48, 568713931);
			Osoba osoba3 = new Osoba("Zbyszko", "Bogda", "Pabianice", 48, 581213567);
			Osoba osoba4 = new Osoba("Ricardo", "Ronaldo", "Salvador", 55, 688261531);
			Osoba osoba5 = new Osoba("Markus", "Sznajder", "Rotterdam", 31, 888961531);

			Firma firma1 = new Firma("Mirkopol", "Gdansk", 48, 468213151);
			Firma firma2 = new Firma("Poltex", "Karkow", 48, 800400400);
			Firma firma3 = new Firma("KFC", "Chicago", 1, 565328982);
			Firma firma4 = new Firma("BMW", "Monachium", 49, 788123512);
			Firma firma5 = new Firma("Sony", "Tokio", 81, 712451974);

			TreeMap<Integer, Firma> tm= new TreeMap<Integer, Firma>();
			// tm.put(osoba1.numer.nrTelefonu, osoba1);
			// tm.put(osoba2.numer.nrTelefonu, osoba2);
			// tm.put(osoba3.numer.nrTelefonu, osoba3);
			// tm.put(osoba4.numer.nrTelefonu, osoba4);
			// tm.put(osoba5.numer.nrTelefonu, osoba5);
			tm.put(firma1.numer.nrTelefonu, firma1);
			tm.put(firma2.numer.nrTelefonu, firma2);
			tm.put(firma3.numer.nrTelefonu, firma3);
			tm.put(firma4.numer.nrTelefonu, firma4);
			tm.put(firma5.numer.nrTelefonu, firma5);

   		Set keys = tm.keySet();
   		for (Iterator i = keys.iterator(); i.hasNext();) {
     		Integer key = (Integer) i.next();
     		Firma value = (Firma) tm.get(key);
     		value.opis();
   		}

	}

}