package com.company;

public class Lew extends Kotowate{
    public Lew(String zdjecie, String pozywienie, int glod, String terytorium, String polozenie) {
        super(zdjecie, pozywienie, glod, terytorium, polozenie);
    }

    @Override
    public String toString() {
        return "Lew{" +
                "zdjecie='" + zdjecie + '\'' +
                ", pozywienie='" + pozywienie + '\'' +
                ", glod=" + glod +
                ", terytorium='" + terytorium + '\'' +
                ", polozenie='" + polozenie + '\'' +
                '}';
    }
}
