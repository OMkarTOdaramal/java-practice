public class Main {
    public static void main(String[] args) {
        
        SampleSub obj1 = new SampleSub();
        obj1.print();

        // Lambda Expression -> we can directly implement that single method that interface contains as we know that it can have only one method
        // it's same as javascripts Arrow (fat arrow) functions
        LambdaExample obj2 = (String greet) -> {

            System.out.println("Hello" + greet);
        };
        obj2.show("Good Morning..");

    }
}

@FunctionalInterface
interface sample{

    void print();
}

class SampleSub implements sample{

    public void print(){
        System.out.println("This is SampleSub");
    }
}

@FunctionalInterface
interface LambdaExample{

    public void show(String greet);
}
