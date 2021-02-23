package sn.Am.domain;

public class User {
    private int idUser;
    private String email;
    private String password;
    private String prenom;
    private String nom;
    private String adresse;
    private String cni;
    private String dateNaiss;
    private String telephone;
    private Medecin medecin;
    private Patient patient;
    private Caissier caissier;
    private Infirmier infirmier;
    private String profil;
    private String pseudo;

    public User() {
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCni() {
        return cni;
    }

    public void setCni(String cni) {
        this.cni = cni;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Caissier getCaissier() {
        return caissier;
    }

    public void setCaissier(Caissier caissier) {
        this.caissier = caissier;
    }

    public Infirmier getInfirmier() {
        return infirmier;
    }

    public void setInfirmier(Infirmier infirmier) {
        this.infirmier = infirmier;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public User(int idUser, String email, String password, String prenom, String nom, String adresse, String cni, String dateNaiss, String telephone, Medecin medecin, Patient patient, Caissier caissier, Infirmier infirmier, String profil, String pseudo) {
        this.idUser = idUser;
        this.email = email;
        this.password = password;
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.cni = cni;
        this.dateNaiss = dateNaiss;
        this.telephone = telephone;
        this.medecin = medecin;
        this.patient = patient;
        this.caissier = caissier;
        this.infirmier = infirmier;
        this.profil = profil;
        this.pseudo = pseudo;
    }
}
