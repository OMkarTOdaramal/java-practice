public class Main {

    // constant -> that cannot changed
    public static final String myName = "Shakespere";

    public static void print1(){
        System.out.println("hii in print1");
        System.out.println(Math.PI);
    }

    

    public void print2(){
        System.out.println("hii in print2");
        // allowed static can be called in not-static
        print1();
    }

    // static block -> loaded first also before main method
    static{
        System.out.println("I'm loaded first static block also before main method");
    }

    public static void main(String[] args) {

        // static variable has single copy shared among all objects
        // Hence if we change value through any object that reference get changed

        // as we need to call most methods in main method which is already static we need to make them also static
        
        System.out.println(Student.id);

        Student s1 = new Student();

        System.out.println(s1.id);
        
        s1.id = 200;
        System.out.println(s1.id);

        // here if you try to access static variable through diff objects you still access same reference as before
        Student s2 = new Student();
        // s2.id = 300;
        System.out.println(s2.id);

        Student s3 = new Student();
        System.out.println(s3.id);

        // You can access static method directly
        print1();

        // but you cannot access not static method directly without object
        //  print2() --> not allowed
    }
    
}
