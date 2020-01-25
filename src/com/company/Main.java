package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        isKot();
        isLew();
        isPies();
        isTygrys();
        isWilk();
        isHipopotam();
    }

    private static void isTygrys(){
        Tygrys tygrys = new Tygrys("Logik", "mięso", 0, "500; 500", "250, 250");
        System.out.println(tygrys);
    }

    private static void isLew(){
        Lew lew = new Lew("Leoś", "mięso", 0, "300, 350", "250, 250");
        System.out.println(lew);
    }

    private static void isKot(){
        Kot kot = new Kot("Ivan", "karma", 0, "20, 20", "10, 10");
        System.out.println(kot);
    }

    private static void isPies(){
        Pies pies = new Pies("Burek", "karma", 0, "50, 50", "10, 10");
        System.out.println(pies);
    }

    private static void isWilk(){
        Wilk wilk = new Wilk("Geralt", "różne", 10, "1000, 2000", "0, 0");
        System.out.println(wilk);
    }

    private static void isHipopotam(){
        Hipopotam hipopotam = new Hipopotam("Grubasek", "różne", 0, "450, 50", "10, 30");
    }
}
