package com.company;

import java.util.HashMap;

public class Bulbasaur extends BasePokemon {

    public Bulbasaur(String name, String color, double weight, int level, int healthPoints, int experience,
                     int maxHealthPoints, HashMap<String, Integer> attackMoves){

        //HashMap<String, Integer> attackMoves = new HashMap<String, Integer>();
        //Possibility of adding pre-set moves and passing into super-constructor

        super(name, color, weight, level, healthPoints, experience, maxHealthPoints, attackMoves);
    }



}
