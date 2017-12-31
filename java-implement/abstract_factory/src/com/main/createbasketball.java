package com.main;

public class createbasketball implements factory {
    @Override
    public ball createball() {
        return new basketball();
    }
}
