package sn.Am.domain;

public class Patient {
    private int id;
    private Ticket ticket;
    private Visite visite;
    private User user;
    private Constante constante;

    public Patient() {
    }

    public Patient(int id, Ticket ticket, Visite visite, User user, Constante constante) {
        this.id = id;
        this.ticket = ticket;
        this.visite = visite;
        this.user = user;
        this.constante = constante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Visite getVisite() {
        return visite;
    }

    public void setVisite(Visite visite) {
        this.visite = visite;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Constante getConstante() {
        return constante;
    }

    public void setConstante(Constante constante) {
        this.constante = constante;
    }
}
