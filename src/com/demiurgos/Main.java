package com.demiurgos;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Task
        //Airport (State, Behaviour)
        //State => Name (data type),
                // Flights (data type),
                // Country (data type),
                // City (data type)
        //Behaviour => getters & setters, Constructor/s
        //What should we do with our Airport:
            //Look at all Flight names
            //Add new Flight
            //Remove a Flight

        Airport a1 = new Airport("Arlanda", "Sweden", "Stockholm");
        System.out.println(a1.getName());
        System.out.println(a1.getCountry());
        System.out.println(a1.getCity());
        //System.out.println(a1.getFlights().isEmpty());
        Flight f1 = new Flight("F2 554");
        Flight f2 = new Flight("C3 678");
        Flight f3 = new Flight("B4 999");
        a1.AddFlight(f1);
        a1.AddFlight(f2);
        a1.AddFlight(f3);
        //System.out.println(a1.getFlights().isEmpty());

        System.out.println("Flights List");
        //System.out.println(a1.getFlights());
/*        for ( Flight flight : a1.getFlights()) {
            System.out.println(flight.GetFlightName());
        }*/
        int arraySize = a1.getFlights().size();
        for (int i = 0; i < arraySize; i++){
            Flight flight = a1.getFlights().get(i);
            System.out.println(flight.GetFlightName());
        }


    }

    //Group 1 => Andreas Lanhede, Christian Tallner, Daniel Lingberg, Fredrik Karmsten
    //Group 2 => Hassan Siala, Idris Ahmed, Ismail Guven, Josip Marijic
    //Group 3 => Linda Petterson, Mohammed Shahriayari, Muhammed Kan, Nenad Skulic
    //Group 4 => Noah, Redon, Robin, Torsten
    //Group 5 => Torun, Safer, Zaid, Troy, William


}
