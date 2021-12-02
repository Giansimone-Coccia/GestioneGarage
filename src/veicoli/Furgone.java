package veicoli;

/**
 * Classe Furgone che estende la classe astratta VeicoloAMotore
 * @author gians_ji5genm
 *
 */
public class Furgone extends VeicoloAMotore{
	
	private int capacitaCarico;
	
	/**
	 * Costruttore
	 * @param annoImmatricolazione
	 * @param marca
	 * @param alimentazione
	 * @param cilindrata
	 * @param capacitaCarico
	 */
	public Furgone(int annoImmatricolazione, String marca, String alimentazione, int cilindrata, int capacitaCarico) {
		super(annoImmatricolazione, marca, alimentazione, cilindrata);
		
		this.capacitaCarico = capacitaCarico;
	}
	
	/**
	 * Metodo per ottenere la capacit‡ del carico
	 * @return
	 */
	public int getCapacitaCarico() {
		return capacitaCarico;
	}
	/**
	 *  Metodo per settare la capacit‡ del carico
	 * @param capacitaCarico
	 */
	public void setCapacitaCarico(int capacitaCarico) {
		this.capacitaCarico = capacitaCarico;
	}
	
	/**
	 * @override toString
	 */
	public String toString() {
		return "Furgone " + getMarca() + " " + getAnnoImmatricolazione() + " alimentato a "+ getAlimentazione() + " cilindrata " + getCilindrata() + " con capacit√† carico pari a " + getCapacitaCarico();
	}
}
