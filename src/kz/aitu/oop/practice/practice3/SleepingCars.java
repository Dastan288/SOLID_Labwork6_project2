package kz.aitu.oop.practice.practice3;

public class SleepingCars extends Car implements ToSleep{
    public SleepingCars(String model, int capacity){
        super(model, capacity);
    }

    public String forSleeping(){
        return "Place for sleeping";
    }

    @Override
    public String works() {
        return forSleeping();
    } //how it works

    @Override
    public String bringAPillow() {
        return "Here is your pillow";
    }
}
