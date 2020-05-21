package kz.aitu.oop.practice.practice3;

import java.sql.*;
import java.util.ArrayList;

public class PassengersCar extends Car implements Services{
    private ArrayList<Passengers> passengersList;
    public PassengersCar(String model, int capacity){
        super(model, capacity);
    }

    public String forPassengers(){
        return "This car is only for passengers";
    }

    public ArrayList<Passengers> getPassengerList() {
        return passengersList;
    }

    public void setPassengerList(ArrayList<Passengers> passengerList) {
        this.passengersList = passengerList;
    }

    @Override
    public String bringATea() {
        return "Here is your tea";
    }
    @Override
    public String bringCoffee(){
        return "Here is your coffee";
    }

    @Override
    public String bringMeal() {
        return "Here is your meal";
    }


    @Override
    public String works() {
        return forPassengers();
    }

    public void listofPassangers(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/train", "root", "dastan"); //connection to the db
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from train"); //selecting all passengers from the db
            while(resultSet.next()){
                Passengers passenger = new Passengers(); //creating a new passenger
                passenger.setPassengerName(resultSet.getString(1));
                passenger.setId(resultSet.getInt(2));
                passenger.setCabin(resultSet.getInt(3));
                passenger.setSeat(resultSet.getInt(4)); //getting all of their values and setting them
                passengersList.add(passenger);  //adding the passenger to our list
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
