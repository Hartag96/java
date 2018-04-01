public class NrTelefoniczny implements Comparable<NrTelefoniczny> {
	int nrkierunkowy;
	int nrTelefonu;
	NrTelefoniczny(int nrkierunkowy, int nrTelefonu) {
		this.nrkierunkowy = nrkierunkowy;
		this.nrTelefonu = nrTelefonu;
	}
	public void printNumber() {
	    System.out.println("Number: +" + nrkierunkowy + " " + nrTelefonu);   
	}
	public int compareTo(NrTelefoniczny other) {
		return Integer.compare(this.nrkierunkowy, other.nrkierunkowy);
	}
}
