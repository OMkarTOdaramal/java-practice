package packages.package1;

public class Package1SubClass extends Package1ParentClass{

    Package1SubClass obj1 = new Package1SubClass();

    // We cannot access void method with or without object
    // In same package subclass we can access any value and method(returning something) without objects.


        // Package1ParentClass obj2 = new Package1ParentClass();

    // protected
    public void accessProtected(){
        System.out.println(a);
        System.out.println(add(4, 8));
        print1();
        // System.out.println(print1());  --> Error
    }

    // default
    public void accessDefault(){
        System.out.println(b);
        System.out.println(sub(10, 4));
         // System.out.println(print2());  --> Error
         print2();
    }

    // public
    public void accessPublic(){
        System.out.println(c);
        System.out.println(multiply(4,8));
         // System.out.println(print3());  --> Error
         print3();
    }
   

    
}
