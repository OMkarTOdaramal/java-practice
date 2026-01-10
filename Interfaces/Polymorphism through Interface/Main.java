public class Main {
    
    public static void main(String[] args) {
        
        // We cannot create an object of interface
        // but interface can hold the reference of its child classes 

        Bird obj1 = new Eagle();
        obj1.fly();

        Bird obj2 = new Hen();
        obj2.fly();
    }
}
