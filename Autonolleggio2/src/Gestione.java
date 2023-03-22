import java.awt.dnd.Autoscroll;

public class Gestione {

	Veicoli veicoli[];
	
	public Gestione(int dim) {
		veicoli=new Veicoli[dim];
	}
	
	/**
	 * metodo di inserimento in una posizione nota
	 * @param pos
	 * @param v
	 * @return true se il veicolo viene inserito
	 * @return false se il veicolo non viene inserito
	 */
	public boolean inserisci(int pos, Veicoli v) {
		if(pos>=0 && pos<veicoli.length && veicoli[pos]==null) {
				veicoli[pos]=v;
				return true;
		}
		return false;
	}
	
	/**
	 * metodo di inserimento in una posizione qualsiasi
	 * @param v
	 * @return true se viene inserito
	 * @return false se non viene inserito 
	 */
	public boolean inserisci(Veicoli v) {
		for(int i=0;i<veicoli.length;i++) {
			if (veicoli[i]==null) {
				veicoli[i]=v;
				return true;
		}
		
		}return false;
		
	}
	
		
	
	/**
	 * metodo di rimozione da una posizione nota
	 * @param pos
	 * @return true se il veicolo viene rimosso
	 * @return false se il veicolo non viene rimosso
	 */
	public boolean rimuovi(int pos) {
		if(pos>=0 && pos<veicoli.length && veicoli[pos]!=null) {
				veicoli[pos]=null;
				return true;
		}
		return false;
	}
	
	/**
	 * metodo di rimozione partendo dalla targa
	 * @param targa
	 * @return true se il veicolo viene rimosso
	 * @return false se il veicolo non viene rimosso
	 */
	public boolean rimuovi(String targa) {
		for(int i=0;i<veicoli.length;i++) {
			if(veicoli[i]!=null && 
			veicoli[i].getTarga().toLowerCase().equals(targa.toLowerCase())) 
			{
				veicoli[i]=null;
				return true;
			}
		}return false;
	}
	
	/**
	 * metodo di ricerca di un veicolo all'interno dell'array, 
	 * partendo dalla posizione
	 * @param pos
	 * @return toString del veicolo che si trova in quella posizione
	 * @return null se non è stato trovato il veicolo
	 */
	public String ricerca (int pos) {
		if(pos>=0 && pos<veicoli.length && veicoli[pos]!=null) {
			return veicoli[pos].toString();
		}
		return " non trovato ";
	}
	
	/**
	 * metodo di ricerca di un veicolo all'interno dell'array, 
	 * partendo dalla targa
	 * @param targa
	 * @return toString del veicolo che ha la stessa targa inserita come parametro dall'utente
	 * @return null se la targa inserita dall'utente è diversa da tutte le targhe dei veicoli 
	 * presenti nell'array
	 */
	public String ricerca (String targa) {
		for(int i=0;i<veicoli.length;i++){
			if(veicoli[i]!=null && 
		veicoli[i].getTarga().toLowerCase().equals(targa.toLowerCase())) {
				return veicoli[i].toString();
			}
		}
		
			return " non trovato ";
		
		
	}
	
	/**
	 * metodo di stampa...
	 * permette di stampare le caratteristiche di tutti i veicoli presenti all'interno dell'array
	 */
	public void stampa() {
		for(int i=0;i<veicoli.length;i++) {
			if(veicoli[i]!=null) {
				System.out.println(veicoli[i].toString() +", pos: " + i ); 
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
