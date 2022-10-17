package com.learning;

public class Printer <T>{ //Anything can be used instead of T

    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

}
