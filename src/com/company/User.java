package com.company;

public class User extends CubeSides {

    @Override
    public int rollTheDice(int cube1, int cube2) {
        super.rollTheDice(cube1, cube2);
        return cube1 + cube2;
    }
}
