package sn.Am.domain;

public class Medicament {
    private int id;
    private String libelle;
    private Ordonnance ordonnace;

    public Medicament() {
    }

    public Medicament(int id, String libelle, Ordonnance ordonnace) {
        this.id = id;
        this.libelle = libelle;
        this.ordonnace = ordonnace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Ordonnance getOrdonnace() {
        return ordonnace;
    }

    public void setOrdonnace(Ordonnance ordonnace) {
        this.ordonnace = ordonnace;
    }
}
