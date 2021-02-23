package sn.Am.domain;

public class Infirmier {
    private int idInf;
    private User user;
    private Constante constante;

    public int getIdInf() {
        return idInf;
    }

    public void setIdInf(int idInf) {
        this.idInf = idInf;
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

    public Infirmier(int idInf, User user, Constante constante) {
        this.idInf = idInf;
        this.user = user;
        this.constante = constante;
    }

    public Infirmier() {
    }
}
