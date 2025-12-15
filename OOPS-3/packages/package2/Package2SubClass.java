package packages.package2;

import packages.package1.Package1ParentClass;

public class Package2SubClass extends Package1ParentClass{

         Package1ParentClass obj2 = new Package1ParentClass();

    // protected
    public void accessProtected(){
        System.out.println(a);
        System.out.println(add(4, 8));
        print1();
        // System.out.println(print1());  --> Error
    }

    // default --> Cannot access default
 /*   public void accessDefault(){
        System.out.println(b);
        System.out.println(sub(10, 4));
         // System.out.println(print2());  --> Error
         obj2.print2();
    }                               */

    // public
    public void accessPublic(){
        System.out.println(c);
        System.out.println(multiply(4,8));
         // System.out.println(print3());  --> Error
         print3();
    }
   

    
}
