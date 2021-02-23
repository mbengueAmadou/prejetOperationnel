package sn.Am.domain;

public class Profil {
    private int id;
    private String libelle;
    private String code;
    private User user;

    public Profil(int id, String libelle, String code, User user) {
        this.id = id;
        this.libelle = libelle;
        this.code = code;
        this.user = user;
    }

    public Profil() {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
