package com.demiurgos;

public class Main {

    public static void main(String[] args) {

        //Flight f2 = new Flight(); //Not valid Constructor
        Flight f1 = new Flight("X9 000");
        //Flight f3 = new Flight("F7 777", 100); //Not valid Constructor

        //Prints out FlightName via Behaviour method
        System.out.println("F1:  BEFORE => " + f1.GetFlightName());
        //Sets FlightName via Behaviour method
        f1.SetFlightName("B5 999");
        //Prints out Height via Behaviour method
        System.out.println("Flight Height is => " + f1.GetHeight());
        //Prints out FlightName via Behaviour method
        System.out.println("F1:  AFTER => " + f1.GetFlightName());

        /*
        System.out.println("####################################");

        System.out.println("F2:  BEFORE => " + f2.GetFlightName());
        f2.SetFlightName("C5 897");
        System.out.println("F2:  AFTER => " + f2.GetFlightName());

        System.out.println("####################################");

        System.out.println("F3:  BEFORE => " + f3.GetFlightName());
        f3.SetFlightName("C9 999");
        System.out.println("F3: Height => " + f3.GetHeight());
        f3.SetHeight(-4);
        System.out.println("F3: Height => " + f3.GetHeight());
        System.out.println("F3:  AFTER => " + f3.GetFlightName());
        */

    }
}
