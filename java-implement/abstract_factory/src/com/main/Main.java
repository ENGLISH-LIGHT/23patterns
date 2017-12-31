package com.main;

public class Main {

    public static void main(String[] args)
    {
        factory f1 = new createbasketball();
        ball ball1 = f1.createball();
        ball1.play();

        factory f2 = new createfootball();
        ball ball2 = f2.createball();
        ball2.play();
    }
}
