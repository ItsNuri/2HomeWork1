package com.company;

import java.util.Random;

public class Computer extends CubeSides {

    @Override
    public int rollTheDice(int cube1, int cube2) {
        super.rollTheDice(cube1, cube2);
        return cube1 + cube2;
    }

    public int computersPredictedNumber() {
        Random random = new Random();
        int computersPredictedNumber = random.nextInt(1,7);
        return computersPredictedNumber;
    }
}
