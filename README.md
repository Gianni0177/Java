## Progetto Autonolleggio

Correzzione Prima verifica del secondo Periodo

---

Una grande catena di autonoleggio deve gestire con un sistema informatico i propri
veicoli (autovetture, furgoni ,bus, motociclette); per ogni veicolo devono essere
memorizzate le seguenti informazioni:

- `targa;`
- `marca;`
- `modello;;`
- `cilindrata;;`
- `anno di acquisto;;`
- `capacità del serbatoio in litri;`
- `tipo di alimentazione;`
- `anno di Immatricolazione;`

Per le autovetture e per i bus è inoltre necessario memorizzare il numero di posti;
Per i furgoni, invece, deve essere memorizzata la capacità di carico;
Per le motociclette memorizzare i tempi del motore;

> Info: (Cos'è il “tempo” nella moto? Un tempo è un movimento di un pistone, il che
significa che una moto a due tempi ha 2 diversi movimenti del pistone, mentre una
a quattro tempi ne ha 4.)

Sapendo inoltre che i veicoli vengono forniti con il pieno di carburante e che il costo
del noleggio è così calcolato:

---

## ATTENZIONE AL CALCOLO…

- `autovetture`: 50 € al giorno, più 1 € ogni 25 km percorsi, più 2 € per ogni litro
di carburante che manca dal pieno al momento della restituzione;

- `furgoni`: 70 € al giorno, più 1 € ogni 30 km percorsi dopo i primi 100 km, più 2€
per ogni litro di carburante che manca al pieno al momento della restituzione;

- `bus`: 60 € al giorno, più 1€ ogni 35 km percorsi dopo i primi 50 km, più 4 € per
ogni litro di carburante che manca dal pieno al momento della restituzione;

- `motocicletta`: 100 € alla settimana, più 1€ ogni 70 km percorsi dopo i
primi 50 km, più 5 € per ogni litro di carburante che manca dal pieno al
momento della restituzione;

implementare una classe Java che consenta la gestione del noleggio dei mezzi e il
calcolo dell’importo da far pagare al noleggiatore in funzione dei parametri descritti.
Oltre al calcolo dell’importo finale da far pagare al noleggiatore, implementare i
seguenti metodi:

>N.B. veicolo qualsiasi vuol dire: un furgone,una autovettura o un bus.

- Metodo di `aggiunta di veicoli di qualsiasi tipo all’interno dell’array`, in una
`posizione nota`.

- Metodo di `aggiunta di veicoli di qualsiasi tipo all’interno dell’array`, in una
`posizione qualsiasi`.

- Metodo di `rimozione di veicoli di qualsiasi tipo dall’array`, partendo dalla
`targa` del mezzo.

- Metodo di `rimozione di veicoli di qualsiasi tipo dall’array`, partendo dalla
`posizione del mezzo`.

- Metodo di `ricerca di veicoli di qualsiasi tipo all’interno dell’array`, partendo
dalla `posizione`, e che `restituisca le informazioni relative al mezzo`.

- Metodo di `ricerca di veicoli di qualsiasi tipo all’interno dell’array`,partendo
dalla `targa`, e che `restituisca le informazioni del mezzo`.

- Metodo di `stampa`, che permette di `restituire le caratteristiche di tutti i veicoli`
(ovviamente di qualsiasi tipo) presenti nell’array, stampando anche la
posizione esatta in cui il mezzo stesso si trova.
