package sn.Am.domain;

public class Ticket {
    private String id;
    private String createdAt;
    private String montant;
    private Caissier caissier;
    private Patient patient;
    private TypeVisite typeVisite;

    public Ticket() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public Caissier getCaissier() {
        return caissier;
    }

    public void setCaissier(Caissier caissier) {
        this.caissier = caissier;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public TypeVisite getTypeVisite() {
        return typeVisite;
    }

    public void setTypeVisite(TypeVisite typeVisite) {
        this.typeVisite = typeVisite;
    }

    public Ticket(String id, String createdAt, String montant, Caissier caissier, Patient patient, TypeVisite typeVisite) {
        this.id = id;
        this.createdAt = createdAt;
        this.montant = montant;
        this.caissier = caissier;
        this.patient = patient;
        this.typeVisite = typeVisite;
    }
}
