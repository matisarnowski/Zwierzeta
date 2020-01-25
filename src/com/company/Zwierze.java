package com.company;

public class Zwierze {
    protected String zdjecie;
    protected String pozywienie;
    protected int glod;
    protected String terytorium;
    protected String polozenie;

    public Zwierze(String zdjecie, String pozywienie, int glod, String terytorium, String polozenie) {
        this.zdjecie = zdjecie;
        this.pozywienie = pozywienie;
        this.glod = glod;
        this.terytorium = terytorium;
        this.polozenie = polozenie;
    }

    public void halasuj(){};

    public void jeddz(){};

    public void spij(){};

    public void wedruj(){};

    public String getZdjecie() {
        return zdjecie;
    }

    public void setZdjecie(String zdjecie) {
        this.zdjecie = zdjecie;
    }

    public String getPozywienie() {
        return pozywienie;
    }

    public void setPozywienie(String pozywienie) {
        this.pozywienie = pozywienie;
    }

    public int getGlod() {
        return glod;
    }

    public void setGlod(int glod) {
        this.glod = glod;
    }

    public String getTerytorium() {
        return terytorium;
    }

    public void setTerytorium(String terytorium) {
        this.terytorium = terytorium;
    }

    public String getPolozenie() {
        return polozenie;
    }

    public void setPolozenie(String polozenie) {
        this.polozenie = polozenie;
    }
}
