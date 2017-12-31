package com.main;

public class createfootball implements factory {
    @Override
    public ball createball() {
        return new football();
    }
}
