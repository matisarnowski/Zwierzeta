package com.company;

public class Wilk extends Psowate {
    public Wilk(String zdjecie, String pozywienie, int glod, String terytorium, String polozenie) {
        super(zdjecie, pozywienie, glod, terytorium, polozenie);
    }

    @Override
    public String toString() {
        return "Wilk{" +
                "zdjecie='" + zdjecie + '\'' +
                ", pozywienie='" + pozywienie + '\'' +
                ", glod=" + glod +
                ", terytorium='" + terytorium + '\'' +
                ", polozenie='" + polozenie + '\'' +
                '}';
    }
}
