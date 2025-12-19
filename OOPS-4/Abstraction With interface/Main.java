public class Main {

    public static void main(String[] args) {
        

        System.out.println(Animal.legs);
    }
    
}

interface Animal{

    // Variables are implicitly public static final
    // public -> can be accessed anywhere
    // static -> called with class name directly
    // final -> value cannot be changed and must initialized while declaration
    int legs = 4;

    // By default abstract and public in interface
     void livesIn();
     void eats();

    //  default method that can override by any class and its implementation can be changed
     default void walk(){
        System.out.println("I can walk.");
     }

}

interface Human{

    // By default abstract and public in interface
     void thinks();
     void eats();
}

class Monkey implements Animal,Human{

    // here In class needs to specify access modifier (only public) as it is not interface

    public void livesIn(){
        System.out.println("lives in Jungle");
    }

    public void thinks(){
        System.out.println("I can think");
    }

    public void eats(){
        System.out.println("I ate bananas");
    }

    // default method overridden
    public void walk(){
        System.out.println("Monkey walks");
    }

}
