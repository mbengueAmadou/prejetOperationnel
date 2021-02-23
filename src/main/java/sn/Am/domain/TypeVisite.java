package sn.Am.domain;

public class TypeVisite {
    private String id;
    private String libelle;
    private Ticket ticket;

    public TypeVisite() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public TypeVisite(String id, String libelle, Ticket ticket) {
        this.id = id;
        this.libelle = libelle;
        this.ticket = ticket;
    }
}
