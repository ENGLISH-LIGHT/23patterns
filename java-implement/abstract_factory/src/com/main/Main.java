package com.main;

public class Main {

    public static void main(String[] args)
    {
        factory f1 = new createbasketballandNIKEshoe();
        ball ball1 = f1.createball();
        shoe shoe1 = f1.createshoe();
        ball1.play();
        shoe1.showLogo();

        factory f2 = new createfootballandANTAshoe();
        ball ball2 = f2.createball();
        shoe shoe2 = f2.createshoe();
        ball2.play();
        shoe2.showLogo();
    }
}
