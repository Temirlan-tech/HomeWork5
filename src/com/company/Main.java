package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();

        boss.setHealth(100);
        boss.setDamage("Magical");
        boss.setSuperpower("fly");

        System.out.println(boss.gethealth() + boss.getdamage() + boss.getsuperpower());




    }
}
