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

        //Planet2 features
        Planet2 bastronaut = new Planet2();
        bastronaut.color = "pink";
        bastronaut.size = "343433433km";
        bastronaut.status = "same as MIKE's";

        //Moon2 Features
        Moon2 moon2 = new Moon2();
        moon2.color = "no color";
        moon2.size = "Big";


        //Moon1 features
        Moon1 moon1 = new Moon1();
        moon1.color="Red";
        moon1.size="negative";
        moon1.dob="98";
        moon1.rings="6";

    }
}
