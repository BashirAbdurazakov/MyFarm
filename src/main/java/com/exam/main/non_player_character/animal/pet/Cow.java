package com.exam.main.non_player_character.animal.pet;

import com.exam.main.food.Food;

public class Cow extends Pet{
    public static int COW_HEALTH = 300;
    @Override
    public void eat(Food food) {
        System.out.println("Корова поела сено");
        System.out.println("Жизни до восстановления: " + getHealth());
        setHealth(COW_HEALTH % (getHealth() + food.giveHealth()));
        System.out.println("Текущее здоровье: " + getHealth());
    }


    @Override
    public void takeDamage(int health) {

    }
}
