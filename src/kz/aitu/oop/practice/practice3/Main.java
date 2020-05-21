package kz.aitu.oop.practice.practice3;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {
        ArrayList<Car> all = new ArrayList<Car>();
        all.add(new PassengersCar("Passengers", 20)); //adding into the list new car
        all.add(new SleepingCars("Sleeping", 30));//adding into the list new car
        Train t = new Train(all, new Locomotive("Steam")); //adding a train
        System.out.println(t.getTotalCapacity()); //counts how many people are sitting there
        t.showTheCars();
        t.everythingWorks();
        t.locomotiveWorks();
        ArrayList<Passengers> passengerList = new ArrayList<Passengers>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/train", "root", "dastan");//connection to the db
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from train");//selecting all passengers from the db
            while(resultSet.next()){
                Passengers passenger = new Passengers();//creating a new passenger
                passenger.setPassengerName(resultSet.getString(1));
                passenger.setId(resultSet.getInt(2));
                passenger.setCabin(resultSet.getInt(3));
                passenger.setSeat(resultSet.getInt(4));//getting all of their values and setting them
                passengerList.add(passenger);//adding the passenger to our list
                System.out.println(passenger.toString());
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (SQLException | ClassNotFoundException sql){
            sql.printStackTrace();
        }




    }
}
