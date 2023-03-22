
public class Bus extends Veicoli{

	protected int numPosti;

	
	
	/* bus: 60 � al giorno, pi� 1� ogni 35 km percorsi dopo i primi 50 km, 
	 * pi� 4 � per ogni litro di carburante che manca dal pieno 
	 * al momento della restituzione;	
	 */
	@Override
	public double costoNoleggio(int numGiorni, double km, double litriRimanenti) {
		if(km<=50) {
			km=0;
		}else {
			km=(km-50)/35;
		}
		double totale=(60*numGiorni) + km + (4*(this.capacitaSerbatoio-litriRimanenti));
			return totale;
	}

	/**Costruttore con tutti i parametri
	 * 
	 * @param targa
	 * @param marca
	 * @param modello
	 * @param cilindrata
	 * @param annoAcquisto
	 * @param capacitaSerbatoio
	 * @param numPosti
	 */
	
	

	public Bus(String targa, String marca, String modello, int cilindrata, int annoAcquisto, double capacitaSerbatoio,
			String tipoAlimentazione, int annoImmatricolazione, int numPosti) {
		super(targa, marca, modello, cilindrata, annoAcquisto, capacitaSerbatoio, tipoAlimentazione,
				annoImmatricolazione);
		this.numPosti = numPosti;
	}
	

	
	
	
	
	
	
	
	
	
	
	

	
}
