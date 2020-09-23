package com.company;

public class Main {


    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage("Magical");
        boss.setSuperpower("fly");

        System.out.println(boss.gethealth() + boss.getdamage() + boss.getsuperpower());

        String [] x = createHeroes();

    }

    public static Hero[] createHeroes(){
        Hero iron = new Hero(100, "15", "strong");
        Hero spider = new Hero(80, "5");
        Hero batman = new Hero(90, "10", "money");

        Hero [] heroes = new Hero[] {iron, spider, batman};
        return heroes;
    }



}
