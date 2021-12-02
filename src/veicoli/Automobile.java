package veicoli;

/**
 * Classe Automobile che estende la classe astratta VeicoloAMotore
 * @author gians_ji5genm
 *
 */
public class Automobile extends VeicoloAMotore{
	
	private int numPorte;
	
	/**
	 * Costruttore
	 * @param annoImmatricolazione
	 * @param marca
	 * @param alimentazione
	 * @param cilindrata
	 * @param numPorte
	 */
	public Automobile(int annoImmatricolazione, String marca, String alimentazione, int cilindrata, int numPorte) {
		super(annoImmatricolazione, marca, alimentazione, cilindrata);
		
		this.numPorte = numPorte;
	}
	
	/**
	 * Metodo per ottenere il numero di porte
	 * @return numero porte
	 */
	public int getNumPorte() {
		return numPorte;
	}
	/**
	 * Metodo per settare il numero di porte
	 * @param numPorte
	 */
	public void setNumPorte(int numPorte) {
		this.numPorte = numPorte;
	}
	
	/**
	 * @override toString
	 */
	public String toString() {
		return "Automobile" + getMarca() + " " + getAnnoImmatricolazione() + " alimentato a "+ getAlimentazione() + " cilindrata "  + getCilindrata() + " con numero porte pari a " + getNumPorte();
	}
}
