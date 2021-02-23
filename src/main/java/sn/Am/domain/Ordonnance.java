package sn.Am.domain;

public class Ordonnance {
    private String id;
    private String createdAt;
    private Medicament medicament;

    public Ordonnance() {
    }

    public Ordonnance(String id, String createdAt, Medicament medicament) {
        this.id = id;
        this.createdAt = createdAt;
        this.medicament = medicament;
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

    public Medicament getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }
}
