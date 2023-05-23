import java.util.ArrayList;

class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;

    public Prodotto(int codice, String nome, String descrizione, double prezzo) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }
    
    public String toString (){
        return "CODICE: "+codice+"\nNOME: "+nome+"\nDESCRIZIONE: "+descrizione+"\nPREZZO: "+prezzo;
    }
}

