class A {
   
    public void printA(){
        System.out.println("Print in A");
    }

    public A(){
        System.out.println("Constructor in A");
    }
}

class B extends A {
   
    public void printB(){
        System.out.println("Print in B");
    }

    public B(){
        System.out.println("Constructor in B");
    }
}

class Main{

    public static void main(String[] args) {
        
       A obj1 = new A();
       obj1.printA();

       B obj2 = new B();
       obj2.printA();

    // Methods are related to referene and constructor checks whose object is created and accordingly call constructor

       A obj3 = new B();
       obj3.printA();
    //    obj3.printB();

    //    B obj4 = new A();


    }
}
