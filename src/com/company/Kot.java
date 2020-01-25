package com.company;

public class Kot extends Kotowate {
    public Kot(String zdjecie, String pozywienie, int glod, String terytorium, String polozenie) {
        super(zdjecie, pozywienie, glod, terytorium, polozenie);
    }

    @Override
    public String toString() {
        return "Kot{" +
                "zdjecie='" + zdjecie + '\'' +
                ", pozywienie='" + pozywienie + '\'' +
                ", glod=" + glod +
                ", terytorium='" + terytorium + '\'' +
                ", polozenie='" + polozenie + '\'' +
                '}';
    }
}
