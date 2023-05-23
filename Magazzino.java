import java.util.*;


public class Magazzino
{
    private ArrayList<Container> containers;

    public Magazzino() {
        containers = new ArrayList<Container>();
    }

    public void aggiungiContainer(Container container)throws TroppiElementi {
        if (containers.size()>100)
            throw new TroppiElementi("ERRORE");
        containers.add(container);
         
    }
    
    public void eliminaContainer (String id)
    {
        Iterator<Prodotto> i;
        for (i=containers.iterator();i.hasNext();){
            Prodotto c = i.next();
            if (c.getCodice()==id){
                i.remove();
                return;
            }
        }
    }
    

    public double getPrezzoTotale() {
        double PrezzoTotale = 0;
        for (Container container : containers) {
            PrezzoTotale += container.getPrezzoTotale();
        }
        return PrezzoTotale;
    }

    
}
