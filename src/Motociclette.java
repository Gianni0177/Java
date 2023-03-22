public class Motociclette extends Veicoli{

    protected int tempiMotore;

    public Motociclette(String targa, String marca, String modello, int cilindrata, int annoAcquisto,
            double capacitaSerbatoio, String tipoAlimentazione, int annoImmatricolazione, int tempiMotore) {
        super(targa, marca, modello, cilindrata, annoAcquisto, capacitaSerbatoio, tipoAlimentazione,
                annoImmatricolazione);
        this.tempiMotore = tempiMotore;
    }

    @Override
    public double costoNoleggio(int numGiorni, double km, double litriRimanenti) {
        if(km<=50) {
			km=0;
		}else {
			km=(km-50)/70;
		}
		double totale=(100*(numGiorni/7)) + km + (5*(this.capacitaSerbatoio-litriRimanenti));
		return totale;
        
    }

    


}