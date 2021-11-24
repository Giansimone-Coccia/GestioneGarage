package veicoli;

//Classe Furgone che estende la classe astratta VeicoloAMotore
public class Furgone extends VeicoloAMotore{
	
	private int capacitaCarico;
	
	//Costruttore
	public Furgone(int annoImmatricolazione, String marca, String alimentazione, int cilindrata, int capacitaCarico) {
		super(annoImmatricolazione, marca, alimentazione, cilindrata);
		
		this.capacitaCarico = capacitaCarico;
	}
	
	//Vari metodi get e set
	public int getCapacitaCarico() {
		return capacitaCarico;
	}
	
	public void setCapacitaCarico(int capacitaCarico) {
		this.capacitaCarico = capacitaCarico;
	}
	
	//@override toString
	public String toString() {
		return "Furgone " + getMarca() + " " + getAnnoImmatricolazione() + " alimentato a "+ getAlimentazione() + " cilindrata " + getCilindrata() + " con capacità carico pari a " + getCapacitaCarico();
	}
}
