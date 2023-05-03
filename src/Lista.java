public class Lista {
//Se ha testa punta a null la lista è vuota

    private Nodo testa;
    int dim;
//    
    public Lista() {
        this.testa = null;
        dim = 0;
    }

/**
 * Operazioni : 
 * 
 * -Inserimento in testa
 * -Inserimento in coda
 * -Inserimento in posizione → accesso sequenziale!
 * 
 * -Rimozione in testa
 * -Rimozione in coda
 * -Rimozione in posizione → accesso sequenziale!
 * 
 * -Visita → stampare tutti i nodi(pieni) dela lista
 */

    public void InserisciInTesta(int info){
        Nodo nuovo = new Nodo(info);
        nuovo.setSuccessivo(testa);
        testa = nuovo;
        dim++;
    }
    


}
