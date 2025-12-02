public class Main{

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "Thor";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "Leo";
        d2.walk();

        Complex n1 = new Complex();
        n1.print(3, 4);

    }
}

class Dog{

    int age;
    String name;
    String color;

    public void bark(){
        System.out.println(name + " is barking.");
    }

    public void walk(){
        System.out.println(name + " is walking.");
    }
}

// Using class for Creating user Defined data type for complex number

class Complex{

    int a,b;

    void print(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println(a+ " + " + b + "i");
    }
}