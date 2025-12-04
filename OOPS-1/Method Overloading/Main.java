public class Main{

    public static void main(String[] args) {
        
        greetings g1 = new greetings();
        g1.greeting();
        g1.greeting("Saurabh");
        g1.greeting("Radha", 3);
    }
}

class greetings{

    // Same method names with different arguments

    void greeting(){
        System.out.println("Hello Good Morning");
    }

    void greeting(String name){
        System.out.println("Hello " + name + " Good Morning");
    }

    void greeting(String name,int count){
        for(int i=1;i<=count;i++){
            System.out.println("Good Morning " + name);
        }
    }

    // Not allowed Not overloading

    // int greeting(){
    //     System.out.println("Hello Good Moring");
    // }
}