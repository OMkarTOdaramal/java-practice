public class SuperKeyword{

    public static void main(String[] args) {
        
        C c = new C();
        c.print();

    }

}

class A{

    public A(){
        // By default super
        // super();
        System.out.println("Constructor A");
    }

    public void print(){
        System.out.println("In class A");
    }
}

class B extends A{

     public B(){
         // By default super
        // super();
        System.out.println("Constructor B");
    }

    public void print(){
        super.print();
        System.out.println("In class B");
    }
}

class C extends B{

     public C(){
         // By default super
        // super();
        System.out.println("Constructor C");
    }

    
    public void print(){
        // super.print();
        // Not by default
        super.print();
        System.out.println("In class C");
    }
}