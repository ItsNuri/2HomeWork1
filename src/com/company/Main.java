package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("---         Start game         ---");
        System.out.println("Predict amount of points (2...12): 9");
        System.out.println("User rolls the dices...");
        Scanner scanner = new Scanner(System.in);
        int usersDice = scanner.nextInt();

        CubeSides cubeSides = new CubeSides();
        int x = cubeSides.rollTheDice(cubeSides.printDice(random.nextInt(),0),cubeSides.printDice(random.nextInt(),0));
        System.out.println("On the dice fell " + x + " points");
        int y = x - Math.abs(x - usersDice) * 2;
        System.out.println("Result is " + x  + " - abs(" + x + " - " + usersDice + ")" + " * 2: " + y + " points\n");

        Computer computer = new Computer();
        System.out.println("Computer predicted " + computer.computersPredictedNumber() + " points");
        System.out.println("Computer rolls the dices...\n");
        int xx = computer.rollTheDice(cubeSides.printDice(random.nextInt(), 0),cubeSides.printDice(random.nextInt(), 0));
        System.out.println("On the dice fell " + xx + " points");
        int yy = xx-Math.abs(xx-usersDice)*2;
        System.out.println("Result is " + xx  + " - abs(" + xx + " - " + computer.computersPredictedNumber() + ")" + " * 2: " + yy + " points\n");


        if(yy > y) {
            yy = yy - y;
            System.out.println("Computer win " + yy + " points more");
            System.out.println("Congratulations!");
        }else if(yy < y){
            y = y - yy;
            System.out.println("User win " + y + " points more");
            System.out.println("Congratulations!");
        }

    }
}
