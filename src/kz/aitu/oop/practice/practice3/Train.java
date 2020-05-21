package kz.aitu.oop.practice.practice3;

import java.util.ArrayList;

public  class Train{
    private ArrayList<Car> cars;
    private Locomotive head;

    public Train(ArrayList<Car> cars, Locomotive head) {
        this.cars = cars;
        this.head = head;
    }

    public int getTotalCapacity(){ //counts amount of people sitting there
        int sum = 0;
        for(Car c: cars){
            sum += c.getCapacity();
        }
        return sum;
    }

    public void showTheCars(){ //information about cars
        for(Car c:cars){
            System.out.println(c.toString());
        }
    }

    public void everythingWorks(){ //checking the work of cars
        for(Car c: cars){
            System.out.println(c.works());
        }
    }

    public void locomotiveWorks(){ //checking the work of a locomotive
        System.out.println(head.works());
    }// checking the work of locomotive
}
