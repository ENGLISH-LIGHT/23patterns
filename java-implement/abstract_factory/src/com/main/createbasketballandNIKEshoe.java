package com.main;

public class createbasketballandNIKEshoe implements factory {
    @Override
    public ball createball() {
        return new basketball();
    }

    @Override
    public shoe createshoe() {
        return new NIKEshoe();
    }
}
