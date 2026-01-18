public class Main {

    public static void main(String[] args) {
        
        Car[] carArray = new Car[3];

        carArray[0] = new Car("SUV", "Petrol");
        carArray[1] = new Car("Sedan", "Diesel");
        carArray[2] = new Car("HatchBack", "CNG");

        for (Car car : carArray) {
            System.out.println(car);
        }

        for (Car car : carArray) {
            System.out.println(car.carName + " : " + car.carType);
        }
    }
    
}
