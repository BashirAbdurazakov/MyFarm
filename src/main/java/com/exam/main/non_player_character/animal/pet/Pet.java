package com.exam.main.non_player_character.animal.pet;

import com.exam.main.non_player_character.animal.Animal;
import com.exam.main.food.Food;

public abstract class Pet extends Animal {


    public abstract void eat(Food food);

    @Override
    public abstract void takeDamage(int health);
}
