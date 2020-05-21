package kz.aitu.oop.practice.practice3;

public  class Car implements Works {
    private String model; //is it passengers or sleeping car?
    private int ID; //ID of a car
    private static int generator_ID = 1;
    private int capacity; //capacity of a car

    public Car(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
        this.ID = generator_ID++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return ID + ". Model of the car:" + model + ", capacity of it: " + capacity;
    }

    @Override
    public String works() {
        return null;
    }
}

