package com.exam.main.non_player_character.animal.predator;

import com.exam.main.non_player_character.animal.Animal;

public abstract class Predator  extends Animal {

    public abstract void attack();

    @Override
    public void takeDamage(int health) {

    }
}
