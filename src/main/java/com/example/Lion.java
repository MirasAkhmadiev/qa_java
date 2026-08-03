package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private final LionCapabilities lionCapabilities;

    public Lion(String sex, LionCapabilities lionCapabilities) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.lionCapabilities = lionCapabilities;
    }

    public int getKittens() {
        return lionCapabilities.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return lionCapabilities.getFood("Хищник");
    }
}
