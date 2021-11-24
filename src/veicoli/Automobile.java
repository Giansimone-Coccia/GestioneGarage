package veicoli;

//Classe Automobile che estende la classe astratta VeicoloAMotore
public class Automobile extends VeicoloAMotore{
	
	private int numPorte;
	
	//Costruttore
	public Automobile(int annoImmatricolazione, String marca, String alimentazione, int cilindrata, int numPorte) {
		super(annoImmatricolazione, marca, alimentazione, cilindrata);
		
		this.numPorte = numPorte;
	}
	
	//Vari metodi get e set
	public int getNumPorte() {
		return numPorte;
	}
	
	public void setNumPorte(int numPorte) {
		this.numPorte = numPorte;
	}
	
	//@override toString
	public String toString() {
		return "Automobile" + getMarca() + " " + getAnnoImmatricolazione() + " alimentato a "+ getAlimentazione() + " cilindrata "  + getCilindrata() + " con numero porte pari a " + getNumPorte();
	}
}
