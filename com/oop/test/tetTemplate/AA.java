package com.oop.test.tetTemplate;

public class AA extends Template{
    @Override
    public void job(){
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
    }
}
