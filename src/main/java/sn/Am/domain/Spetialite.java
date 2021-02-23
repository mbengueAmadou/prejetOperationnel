package sn.Am.domain;

public class Spetialite {
    private int id;
    private String libelle;
    private Medecin medecin;

    public Spetialite(int id, String libelle, Medecin medecin) {
        this.id = id;
        this.libelle = libelle;
        this.medecin = medecin;
    }

    public Spetialite() {
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

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
}
