package org.example.structural.bridgepattern;

public class Client {

    public static void main(String[] args) {
        //Structural design pattern.
        //separating abstraction from implementation
        //https://www.digitalocean.com/community/tutorials/bridge-design-pattern-java

        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }

}