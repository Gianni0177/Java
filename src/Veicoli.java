
public class Veicoli {


	//attributi
	
	protected String targa;
	protected String marca;
	protected String modello;
	protected int cilindrata;
	protected int annoAcquisto;
	protected double capacitaSerbatoio;
	protected String tipoAlimentazione;
	protected int annoImmatricolazione;
	
	/**
	 * Metodo che permette di calcolare il costo del noleggio di un Veicolo 
	 * ( ovviamente da sovrascrivere nelle sottoclassi )...
	 * 
	 * @param numGiorni
	 * @param km
	 * @param litriRimanenti
	 * @return totale (nelle sottoclassi)
	 * @return 0 in questa , 
	 * altrimenti si poteva inserire come astratta sia la classe che il metodo 
	 */
	public double costoNoleggio(int numGiorni, double km, double litriRimanenti) {
		
		return 0;
		
	}

	
	/* set & get */
	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public int getAnnoAcquisto() {
		return annoAcquisto;
	}

	public void setAnnoAcquisto(int annoAcquisto) {
		this.annoAcquisto = annoAcquisto;
	}

	public double getCapacitaSerbatoio() {
		return capacitaSerbatoio;
	}

	public void setCapacitaSerbatoio(double capacitaSerbatoio) {
		this.capacitaSerbatoio = capacitaSerbatoio;
	}

	
	
	
	
	/** Costruttore con tutti i parametri:
	 * 	
	 * @param targa
	 * @param marca
	 * @param modello
	 * @param cilindrata
	 * @param annoAcquisto
	 * @param capacitaSerbatoio
	 * @param tipoAlimentazione;
	 * @param annoImmatricolazione;
	 */
	public Veicoli(String targa, String marca, String modello, int cilindrata, int annoAcquisto,
			double capacitaSerbatoio,String tipoAlimentazione, int annoImmatricolazione) {
		super();
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.annoAcquisto = annoAcquisto;
		this.capacitaSerbatoio = capacitaSerbatoio;
	}


    


	/* toString */
	@Override
    public String toString() {
        return "Veicoli [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata
                + ", annoAcquisto=" + annoAcquisto + ", capacitaSerbatoio=" + capacitaSerbatoio + ", tipoAlimentazione="
                + tipoAlimentazione + ", annoImmatricolazione=" + annoImmatricolazione + "]";
    }
	
	
	
	
	
	
	
	
}
