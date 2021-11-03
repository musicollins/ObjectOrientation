package com.demiurgos;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    //State
    private String name; //null
    private String country; //null
    private String city; //null
    private List<Flight> flights; //null

    //Constructor
    public Airport(String Name, String Country, String City){
        //state        //parameter
        name      =      Name;
        country   =      Country;
        city      =      City;
        flights   =      new ArrayList<>();
    }

    //Behaviour
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void AddFlight(Flight flight){
        flights.add(flight);
    }

    public void RemoveFlight(String flightname){
        //ForEach loop
        for( Flight item : flights){
            String fName = item.GetFlightName();
            if(fName.equals(flightname)){
                flights.remove(item);
            }
        }
    }


}
