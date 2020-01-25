package com.company;

public class Pies extends Psowate {
    public Pies(String zdjecie, String pozywienie, int glod, String terytorium, String polozenie) {
        super(zdjecie, pozywienie, glod, terytorium, polozenie);
    }

    @Override
    public String toString() {
        return "Pies{" +
                "zdjecie='" + zdjecie + '\'' +
                ", pozywienie='" + pozywienie + '\'' +
                ", glod=" + glod +
                ", terytorium='" + terytorium + '\'' +
                ", polozenie='" + polozenie + '\'' +
                '}';
    }
}
