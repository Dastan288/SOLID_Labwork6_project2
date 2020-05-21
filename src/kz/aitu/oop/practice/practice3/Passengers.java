package kz.aitu.oop.practice.practice3;
import java.sql.*;
import java.util.ArrayList;

public class Passengers{
    private String passengerName;
    private int id;
    private int cabin;
    private int seat;
    private ArrayList<Passengers> passengersList;

    public Passengers(){
        passengersList =  new ArrayList<Passengers>();
    }


    public String getPassengerName() {
        return this.passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCabin() {
        return this.cabin;
    }

    public void setCabin(int cabin) {
        this.cabin = cabin;
    }

    public int getSeat() {
        return this.seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return id + " " + passengerName + " " + cabin + " " + seat;
    }
}
