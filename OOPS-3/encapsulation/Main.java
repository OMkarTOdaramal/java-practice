public class Main {

    public static void main(String[] args) {
        
        // setting data members private and accessing it thorugh getter-setter provides data encapsulation
        // as data members are private you cannot access them directly

        Person obj = new Person();
        // obj.age = 12 --> Not Allowed;

        // but you can access this private members through getter setters

        obj.setAge(23);
        System.out.println(obj.getAge());
    }
    
}
