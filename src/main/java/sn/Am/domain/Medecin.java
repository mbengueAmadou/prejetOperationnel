package sn.Am.domain;

public class Medecin {
    private int idMed;
    private String user;
    private Spetialite spetialite;
    private Visite visites;

    public Medecin() {
    }

    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Spetialite getSpetialite() {
        return spetialite;
    }

    public void setSpetialite(Spetialite spetialite) {
        this.spetialite = spetialite;
    }

    public Visite getVisites() {
        return visites;
    }

    public void setVisites(Visite visites) {
        this.visites = visites;
    }

    public Medecin(int idMed, String user, Spetialite spetialite, Visite visites) {
        this.idMed = idMed;
        this.user = user;
        this.spetialite = spetialite;
        this.visites = visites;
    }
}
