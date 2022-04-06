package com.company;

import java.util.Random;

public class CubeSides {


    public int printDice(int theRandomNumberOfCubeSides, int counter) {
        Random random = new Random();
        counter = 0;
        switch(theRandomNumberOfCubeSides = random.nextInt(1,7)) {
            case 1:
            System.out.println("+-------+");
            System.out.println("|-------|");
            System.out.println("|---#---|");
            System.out.println("|-------|");
            System.out.println("+-------+\n");
                counter++;
            break;
            case 2:
            System.out.println("+-------+");
            System.out.println("|#------|");
            System.out.println("|-------|");
            System.out.println("|------#|");
            System.out.println("+-------+\n");
                counter += 2;
                break;
            case 3:
            System.out.println("+-------+");
            System.out.println("|#------|");
            System.out.println("|---#---|");
            System.out.println("|------#|");
            System.out.println("+-------+\n");
                counter += 3;
                break;
            case 4:
            System.out.println("+-------+");
            System.out.println("|#-----#|");
            System.out.println("|-------|");
            System.out.println("|#-----#|");
            System.out.println("+-------+\n");
                counter += 4;
                break;
            case 5:
            System.out.println("+-------+");
            System.out.println("|#-----#|");
            System.out.println("|---#---|");
            System.out.println("|#-----#|");
            System.out.println("+-------+\n");
                counter += 5;
                break;
            case 6:
            System.out.println("+-------+");
            System.out.println("|#--#--#|");
            System.out.println("|-------|");
            System.out.println("|#--#--#|");
            System.out.println("+-------+\n");
                counter += 6;
                break;
        }
        return counter;
    }

    public int rollTheDice(int cube1, int cube2){
        return cube1 + cube2;
    }

}
