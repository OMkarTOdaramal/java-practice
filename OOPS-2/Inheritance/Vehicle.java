public class Vehicle{

    int mileage;
    int numberOfWheels;
    String color;
    String name;

    public void vehicleInfo(String name,int mileage){
        this.name = name;
        this.mileage = mileage;
        System.out.println(name + " : " + mileage);
    }

    public void start(){
        System.out.println(name + " Started....");
    }
}