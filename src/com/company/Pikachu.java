package com.company;

import java.util.HashMap;
import java.util.Map;

public class Pikachu extends BasePokemon {


    private Map<String, Integer> pikachuAttackMoves = new HashMap<String, Integer>();


    //Tailwhip and thundershock unique moves to pikachu


    public Pikachu(String name, String color, double weight, int level, int healthPoints, int experience,
                     int maxHealthPoints){
        super(name, color, weight, level, healthPoints, experience, maxHealthPoints);
        pikachuAttackMoves.put("Tailwhip", 5);
        pikachuAttackMoves.put("Thundershock" , 10);
        setAttackMoves(pikachuAttackMoves);
    }

    //Updates the affected pokemons health after taking damage from the user selected
    public void attackMove(BasePokemon affectedPokemon, String moveName) {
        int damage = pikachuAttackMoves.get(moveName);
        affectedPokemon.setHealthPoints(affectedPokemon.getMaxHealthPoints()-damage);

    }
}
