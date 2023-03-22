
public class Furgoni extends Veicoli{

	protected double capacitaCarico;

	
	/* furgoni: 70 � al giorno, pi� 1 � ogni 30 km percorsi dopo i primi 100 km,
	 *  pi� 2� per ogni litro di carburante che manca al pieno 
	al momento della restituzione;
	*/	
	@Override
	public double costoNoleggio(int numGiorni, double km, double litriRimanenti) {
	
		if(km<=100) {
			km=0;
		}else {
			km=(km-100)/30;
		}
		
		double totale= (70*numGiorni) + km + (2*(this.capacitaSerbatoio-litriRimanenti));
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
	 * @param capacitaCarico
	 */
	public Furgoni(String targa, String marca, String modello, int cilindrata, int annoAcquisto,
            double capacitaSerbatoio, String tipoAlimentazione, int annoImmatricolazione, double capacitaCarico) {
        super(targa, marca, modello, cilindrata, annoAcquisto, capacitaSerbatoio, tipoAlimentazione,
                annoImmatricolazione);
        this.capacitaCarico = capacitaCarico;
    }

	
	
	
	
	
	
}
