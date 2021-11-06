package com.company;

public class Main {

    public static void main(String[] args) {

        SolarSystem andromeda = new SolarSystem();
        andromeda.sun = 1;
        andromeda.planet = 2;
        andromeda.moon = 4;

        FeatureSun sun = new FeatureSun();
        sun.color="blue";
        sun.heat="600000000kj";
        sun.temp="5celcius";
        sun.radius="0.009";
        sun.maritalStatus="single";
    }
}
