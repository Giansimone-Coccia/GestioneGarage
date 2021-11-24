package veicoli;

//Classe Motocicletta che estende la classe astratta VeicoloAMotore
public class Motocicletta extends VeicoloAMotore{
	
	private int tipologia;
	private int tempiMotore;
	
	//Costruttore
	public Motocicletta(int annoImmatricolazione, String marca, String alimentazione, int cilindrata, int tipologia, int tempiMotore) {
		super(annoImmatricolazione, marca, alimentazione, cilindrata);
		
		this.tipologia = tipologia;
		this.tempiMotore = tempiMotore;
	}
	
	//Vari metodi get e set
	public int getTipologia() {
		return tipologia;
	}
	
	public void setTipologia(int tipologia) {
		this.tipologia = tipologia;
	}
	
	public int getTempiMotore() {
		return tempiMotore;
	}
	
	public void setTempiMotore(int tempiMotore) {
		this.tempiMotore = tempiMotore;
	}
	
	//@override toString
	public String toString() {
		return "Motocicletta " + getMarca() + " " + getAnnoImmatricolazione() + " alimentata a "+ getAlimentazione() + " cilindrata " + getCilindrata() + " di tipologia " + getTipologia() + " e di tempi motore pari a " + getTempiMotore();
	}
}
