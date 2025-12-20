public class Main{

    public static void main(String[] args) {

        Main m = new Main();

        // --- Calling anonymous class methods ---

        // Calls overridden outerMethod()
        m.obj1.outerMethod();  

        // Can't call show() directly because reference type is OuterClass
        // But we can call using cast
        ((OuterClass)m.obj1).outerMethod();
        
        // If you want to call show(), must cast:
        // ((YourAnonymousClass) not possible, so use reflection or
        // move show() in OuterClass if you want normal access.

        // Calling interface anonymous class method
        m.obj2.interfaceMethod();
    }

    // Instead of doing this
    // class InnerClass extends OuterClass{

    // }

    // We can create Anonymous class of tyoe a superclass that an anonymous class extends
    OuterClass obj1 = new OuterClass(){

        public void show(){
            System.out.println("This is anonymous class");
        }
        

         public void outerMethod(){
        System.out.println("This is Inner");
    }

    };

    // Type b an interface that an anonymous class implements
    SuperInterface obj2 = new SuperInterface(){

        public void interfaceMethod(){
            System.out.println("This is an interface method");
        }

    };
}

class OuterClass{

    public void outerMethod(){
        System.out.println("This is outer");
    }
}

interface SuperInterface {

    public void interfaceMethod();
    
}