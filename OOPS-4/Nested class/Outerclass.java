public class Outerclass {

    // Innerclass - non-static nested class
    class Toy{
        int price;
    }

    // static nested class
    static class Playstation{
        int price;
    }
    public static void main(String[] args) {
        
        // You cannot create an object of Toy class as it is non-static
        // Toy obj = new Toy(); -> gives Error

        // but You can create its object using Outerclass
        Toy obj1 = new Outerclass().new Toy();
        obj1.price = 50;

        // You can create in this way also
        Outerclass obj = new Outerclass();
        Toy toy = obj.new Toy();
        toy.price = 100;

        // no need to create an object for static nested class
        Playstation playstation = new Outerclass.Playstation();
        playstation.price = 200;
    }
    
}
