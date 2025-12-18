public class Main {

    public static void main(String[] args) {

        Pulser obj = new Pulser();
        obj.noOfSeats(2);
        obj.noOfWheels(2);
        obj.maxSpeed(120);
        
    }    
}

 abstract class Vehicle{

    public abstract int maxSpeed(int speed);
    public abstract int noOfWheels(int wheels);
}

abstract class TwoWheeler extends Vehicle{

    public abstract int noOfSeats(int seats);

}

class Pulser extends TwoWheeler{

    public int noOfSeats(int seats){
        return seats;
    }

    public int noOfWheels(int wheels){
        return wheels;
    }

    public int maxSpeed(int speed){
        return speed;
    }
}

// Gives Error as there is an abstract method but class is not abstract
// class FourWheeler extends Vehicle{

//      public abstract int noOfSeats(int seats);
// }
