package kz.aitu.oop.practice.practice3;

public class Locomotive implements Works{
    private String type; //Steam, Electric, Diesel, Maglev types of locomotoves

    public Locomotive(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String works() {
        return "All work fine, Chuh-chuuuuuuh!";
    }
}
