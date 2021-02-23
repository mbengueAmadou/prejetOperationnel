package sn.Am.domain;

import java.util.Date;

public class Constante {
    private int idConst;
    private String temperature;
    private String pouls;
    private Date createdAt;

    public Constante() {
    }

    public Constante(int idConst, String temperature, String pouls, Date createdAt) {
        this.idConst = idConst;
        this.temperature = temperature;
        this.pouls = pouls;
        this.createdAt = createdAt;
    }

    public int getIdConst() {
        return idConst;
    }

    public void setIdConst(int idConst) {
        this.idConst = idConst;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPouls() {
        return pouls;
    }

    public void setPouls(String pouls) {
        this.pouls = pouls;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
