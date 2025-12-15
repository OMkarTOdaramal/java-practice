package packages.package2;

import packages.package1.Package1ParentClass;

public class Package2NonSubClass {

      Package1ParentClass obj2 = new Package1ParentClass();
    
       // protected -> Cannot access
   /* public void accessProtected(){
        System.out.println(obj2.a);
        System.out.println(obj2.add(4, 8));
        obj2.print1();
        // System.out.println(print1());  --> Error
    }               */

    // default
   /* public void accessDefault(){
        System.out.println(obj2.b);
        System.out.println(obj2.sub(10, 4));
         // System.out.println(print2());  --> Error
         obj2.print2();
    }                           */

    // public
    public void accessPublic(){
        System.out.println(obj2.c);
        System.out.println(obj2.multiply(4,8));
         // System.out.println(print3());  --> Error
         obj2.print3();
    }
    
}
