package com.demiurgos;

//In this class we describe how Flight Objects will contain as state
//and how they will behave.
//Encapsulation
//My Member Variables (fields) generally must be "private"
public class Flight {

    //State
    //Access Modifier
    private String FlightName;
    private int Height;

    //Behaviour
    public Flight(String flightName){
        if(CheckIfNewFlightNameIsValid(flightName)){
            FlightName = flightName;
        }else{
            FlightName = "Unknown";
        }
    }


    //Returns a String with FlightName
    public String GetFlightName(){
        return FlightName;
    }

    //Changes State of variable FlightName
    public void SetFlightName(String newName){
        //CheckIfFlightNameIsValid(newName) => true
        if(CheckIfNewFlightNameIsValid(newName)){
            FlightName = newName;
        }

    }

    //Returns an int with Height value
    public int GetHeight(){
        return Height;
    }
    //Sets Height value
    public void SetHeight(int height){
        if(height < 0){
            System.out.println("Not Valid Height");
        }else{
            Height = height;
        }
    }

    //Checks if new value for FlightName is valid
    private boolean CheckIfNewFlightNameIsValid(String newName) {
        if(newName.equals("Obsenity") || newName.isEmpty())
        {
            System.out.println("Try Again! Name is not valid");
            return false;

        }else{
            System.out.println("FlightName variable changed from " + FlightName +" To " + newName);
            return true;

        }
    }




}
