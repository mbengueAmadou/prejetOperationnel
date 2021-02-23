package sn.Am.domain;

public class Visite {
    private String id;
    private String dateVisite;
    private String rv;
    private String patient;
    private String medecin;
    private String note;
    private Ordonnance ordonnance;

    public Visite() {
    }

    public Visite(String id, String dateVisite, String rv, String patient, String medecin, String note, Ordonnance ordonnance) {
        this.id = id;
        this.dateVisite = dateVisite;
        this.rv = rv;
        this.patient = patient;
        this.medecin = medecin;
        this.note = note;
        this.ordonnance = ordonnance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateVisite() {
        return dateVisite;
    }

    public void setDateVisite(String dateVisite) {
        this.dateVisite = dateVisite;
    }

    public String getRv() {
        return rv;
    }

    public void setRv(String rv) {
        this.rv = rv;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getMedecin() {
        return medecin;
    }

    public void setMedecin(String medecin) {
        this.medecin = medecin;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Ordonnance getOrdonnance() {
        return ordonnance;
    }

    public void setOrdonnance(Ordonnance ordonnance) {
        this.ordonnance = ordonnance;
    }
}
