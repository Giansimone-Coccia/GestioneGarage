package veicoli;

/**
 * Definizione di una classe astratta VecioloAMotore
 * @author gians_ji5genm
 *
 */
public abstract class VeicoloAMotore {
	
	//Attributi
	private int annoImmatricolazione;
	private String marca;
	private String alimentazione;
	private int cilindrata;
	private int numPosto;
	
	/**
	 * Costruttore
	 * @param annoImmatricolazione
	 * @param marca
	 * @param alimentazione
	 * @param cilindrata
	 */
	public VeicoloAMotore(int annoImmatricolazione, String marca, String alimentazione, int cilindrata) {
		this.annoImmatricolazione = annoImmatricolazione;
		this.marca = marca;
		this.alimentazione = alimentazione;
		this.cilindrata = cilindrata;
	}
	
	/**
	 * Metodo per ottenere l'anno di immatricolazione
	 * @return anno immatricolazione
	 */
	public int getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}
	/**
	 * Metodo per settare l'anno di immatricolazione
	 * @param annoImmatricolazione
	 */
	public void setAnnoImmatricolazione(int annoImmatricolazione) {
		this.annoImmatricolazione = annoImmatricolazione;
	}
	/**
	 * Metodo per ottenere la marca
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * Metodo per settare la marca
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * Metodo per ottenere il tipo di alimentazione
	 * @return alimentazione
	 */
	public String getAlimentazione() {
		return alimentazione;
	}
	/**
	 * Metodo per settare il tipo di alimentazione
	 * @param alimentazione
	 */
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	/**
	 * Metodo per ottenere la cilindrata
	 * @return cilindrata
	 */
	public int getCilindrata() {
		return cilindrata;
	}
	/**
	 * Metodo per settare la cilindrata
	 * @param cilindrata
	 */
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	/**
	 * Metodo per ottenere il numero dei posti
	 * @return numero posti
	 */
	public int getNumPosto() {
		return numPosto;
	}
	/**
	 * Metodo per settare il numero dei posti
	 * @param numPosto
	 */
	public void setNumPosto(int numPosto) {
		this.numPosto = numPosto;
	}
	/**
	 * Classe astratta toString
	 * @override toString
	 */
	public abstract String toString();
}

