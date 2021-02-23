package sn.Am.domain;

public class Caissier {
    private int idCais;
    private User user;
    private Ticket ticket;

    public int getIdCais() {
        return idCais;
    }

    public void setIdCais(int idCais) {
        this.idCais = idCais;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Caissier(int idCais, User user, Ticket ticket) {
        this.idCais = idCais;
        this.user = user;
        this.ticket = ticket;
    }

    public Caissier() {
    }
}
