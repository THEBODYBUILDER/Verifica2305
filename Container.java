import java.util.*;

class Container {
    private int id;
    private ArrayList<Prodotto> prodotti;

    public Container(int id) {
        this.id = id;
        prodotti = new ArrayList<Prodotto>();
    }


    public void aggiungiProdotto(Prodotto prodotto)
    {
        if (prodotti.size()>100)
            throw new TroppiElementi ("ERRORE");
        prodotti.add(prodotto);
    }
    
    public void eliminaProdotto (String id)
    {
        Iterator<Prodotto> i;
        for (i=prodotti.iterator();i.hasNext();){
            Prodotto c = i.next();
            if (c.getCodice()==id){
                i.remove();
                return;
            }
        }
    }

    public double getPrezzoTotale() {
        double PrezzoTotale = 0;
        for (Prodotto prodotto : prodotti) {
            PrezzoTotale += prodotto.getPrezzo();
        }
        return PrezzoTotale;
    }
}