package com.company;

public class Tygrys extends Kotowate {
    public Tygrys(String zdjecie, String pozywienie, int glod, String terytorium, String polozenie) {
        super(zdjecie, pozywienie, glod, terytorium, polozenie);
    }

    @Override
    public String toString() {
        return "Tygrys{" +
                "zdjecie='" + zdjecie + '\'' +
                ", pozywienie='" + pozywienie + '\'' +
                ", glod=" + glod +
                ", terytorium='" + terytorium + '\'' +
                ", polozenie='" + polozenie + '\'' +
                '}';
    }
}
