public class Main implements FlyingBirds,NonFlyingBirds{

    public void fly(){
        System.out.println("Birds can Fly");
    }

    public void flyHigh(){
        System.out.println("Birds can Fly High");
    }

    public void notFly(){
        System.out.println("We cannot fly");
    }

   public static void main(String[] args) {
    
    Main obj = new Main();
    obj.fly();
    obj.flyHigh();
   }
}
