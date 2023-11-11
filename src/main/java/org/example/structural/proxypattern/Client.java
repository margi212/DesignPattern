package org.example.structural.proxypattern;

public class Client  {
    public static void main (String[] args) {
        // Proxy pattern is used when we need to create a
        // wrapper to cover the main object’s complexity from the client.
        //Structural Pattern
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("google.com");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
