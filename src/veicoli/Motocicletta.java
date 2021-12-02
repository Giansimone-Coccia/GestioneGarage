package veicoli;

/**
 * Classe Motocicletta che estende la classe astratta VeicoloAMotore
 * @author gians_ji5genm
 *
 */
public class Motocicletta extends VeicoloAMotore{
	
	private int tipologia;
	private int tempiMotore;
	
	/**
	 * Costruttore
	 * @param annoImmatricolazione
	 * @param marca
	 * @param alimentazione
	 * @param cilindrata
	 * @param tipologia
	 * @param tempiMotore
	 */
	public Motocicletta(int annoImmatricolazione, String marca, String alimentazione, int cilindrata, int tipologia, int tempiMotore) {
		super(annoImmatricolazione, marca, alimentazione, cilindrata);
		
		this.tipologia = tipologia;
		this.tempiMotore = tempiMotore;
	}
	
	/**
	 * Metodo per ottenere la tipologia 
	 * @return tipologia
	 */
	public int getTipologia() {
		return tipologia;
	}
	/**
	 * Metodo per settare la tipologia 
	 * @param tipologia
	 */
	public void setTipologia(int tipologia) {
		this.tipologia = tipologia;
	}
	/**
	 * Metodo per ottenere tempi motore
	 * @return tempi motore
	 */
	public int getTempiMotore() {
		return tempiMotore;
	}
	/**
	 * Metodo per settare tempi motore
	 * @param tempiMotore
	 */
	public void setTempiMotore(int tempiMotore) {
		this.tempiMotore = tempiMotore;
	}
	
	/**
	 * @override toString
	 */
	public String toString() {
		return "Motocicletta " + getMarca() + " " + getAnnoImmatricolazione() + " alimentata a "+ getAlimentazione() + " cilindrata " + getCilindrata() + " di tipologia " + getTipologia() + " e di tempi motore pari a " + getTempiMotore();
	}
}
