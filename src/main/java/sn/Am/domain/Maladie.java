package sn.Am.domain;

public class Maladie {
    private int idMal;
    private String libelle;

    public Maladie() {
    }

    public Maladie(int idMal, String libelle) {
        this.idMal = idMal;
        this.libelle = libelle;
    }

    public int getIdMal() {
        return idMal;
    }

    public void setIdMal(int idMal) {
        this.idMal = idMal;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
