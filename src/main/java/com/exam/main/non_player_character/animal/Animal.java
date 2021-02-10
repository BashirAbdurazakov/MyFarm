package com.exam.main.non_player_character.animal;

public abstract class Animal {
    private int health;
    private String name;
    private double speed;


    public abstract void takeDamage(int health);
//    public abstract void eat();
//    public abstract void eat(int damage);

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Animal() {

    }

    public Animal(int health, String name, double speed) {
        this.health = health;
        this.name = name;
        this.speed = speed;
    }
}
