
public class Autovetture extends Veicoli{

	protected int numPosti;

	
	
/* autovetture: 50 � al giorno, pi� 1 � ogni 25 km percorsi, 
 * pi� 2 � per ogni litro di carburante che manca 
 * dal pieno al momento della restituzione;	
 */
	@Override
	public double costoNoleggio(int numGiorni, double km, double litriRimanenti) {
		double totale= (50*numGiorni) + (km/25) + (2*(this.capacitaSerbatoio-litriRimanenti));
		return totale;
	}



	
	/**
	 * Costruttore con tutti i parametri 
	 * @param targa
	 * @param marca
	 * @param modello
	 * @param cilindrata
	 * @param annoAcquisto
	 * @param capacitaSerbatoio
	 * @param numPosti
	 */
	
	public Autovetture(String targa, String marca, String modello, int cilindrata, int annoAcquisto,
			double capacitaSerbatoio, String tipoAlimentazione, int annoImmatricolazione, int numPosti) {
		super(targa, marca, modello, cilindrata, annoAcquisto, capacitaSerbatoio, tipoAlimentazione,
				annoImmatricolazione);
		this.numPosti = numPosti;
	}


	
	


	
	
	
	
	
}
