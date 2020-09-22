package com.company;

public class Hero {
    private int health;
    private String damage;
    private String superpower;

    public Hero (int health, String damage, String superpower){

        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    public Hero (int health, String damage){

        this.health = health;
        this.damage = damage;
    }
    public int gethealth(){
        return health;
    }
    public String getdamage(){
        return damage;
    }
    public String getsuperpower(){
        return superpower;
    }


}
