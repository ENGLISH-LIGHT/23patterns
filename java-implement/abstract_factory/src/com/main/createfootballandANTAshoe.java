package com.main;

public class createfootballandANTAshoe implements factory {
    @Override
    public ball createball() {
        return new football();
    }

    @Override
    public shoe createshoe() {
        return new ANTAshoe();
    }
}
