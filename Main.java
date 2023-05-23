public class Main {
    public static void main(String[] args) {
        // creazione dei prodotti
        Prodotto p1 = new Prodotto(1, "Prodotto 1", "Descrizione prodotto 1", 10.0);
        Prodotto p2 = new Prodotto(2, "Prodotto 2", "Descrizione prodotto 2", 20.0);
        Prodotto p3 = new Prodotto(3, "Prodotto 3", "Descrizione prodotto 3", 30.0);

        // creazione dei container
        Container c1 = new Container(1);
        Container c2 = new Container(2);

        // aggiunta dei prodotti ai container
        c1.aggiungiProdotto(p1);
        c1.aggiungiProdotto(p2);
        c2.aggiungiProdotto(p3);

        // creazione del magazzino e aggiunta dei container
        Magazzino magazzino = new Magazzino();
        magazzino.aggiungiContainer(c1);
        magazzino.aggiungiContainer(c2);

        // calcolo del prezzo totale del magazzino e dei container
        System.out.println("Prezzo totale del container 1: " + c1.getPrezzoTotale());
        System.out.println("Prezzo totale del container 2: " + c2.getPrezzoTotale());
        System.out.println("Prezzo totale del magazzino: " + magazzino.getPrezzoTotale());

    }
}