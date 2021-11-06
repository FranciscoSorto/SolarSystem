package com.company;

public class Main {

    public static void main(String[] args) {

        SolarSystem andromeda = new SolarSystem();
        andromeda.sun = 1;
        andromeda.planet = 2;
        andromeda.moon = 4;

        FeatureSun sun = new FeatureSun();
        sun.color="Red";
        sun.heat="611111111kj";
        sun.temp="10000000000kelvin";
        sun.radius="9000000km";
        sun.maritalStatus="double";
    }
}
