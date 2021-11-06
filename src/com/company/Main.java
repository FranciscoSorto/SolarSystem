package com.company;

public class Main {

    public static void main(String[] args) {

        SolarSystem andromeda = new SolarSystem();
        andromeda.sun = 1;
        andromeda.planet = 2;
        andromeda.moon = 4;

        FeatureSun sun = new FeatureSun();
        sun.color = "Red";
        sun.heat = "611111111kj";
        sun.temp = "10000000000kelvin";
        sun.radius = "9000000km";
        sun.maritalStatus = "double";

        //adding planet1 features
        Planet1 astronaut = new Planet1();
        astronaut.color = "grey";
        astronaut.relationshipStatus = "single";
        astronaut.size = "9999999999km";

        Planet1 astronaut1 = new Planet1();
        astronaut1.color = "grey";
        astronaut1.relationshipStatus = "single";
        astronaut1.size = "99999999999km";

    }
}
