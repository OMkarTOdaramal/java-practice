package packages.package1;

public class Package1NonSubClass {

     Package1NonSubClass obj1 = new Package1NonSubClass();

    // You can access variables and methods of another class in same package non-subclass
    // By creating object of class which contains them not by object of class in which you try to access

     /* We cannot access void method(method which not returning anything) without object of class in which it is present
    as it not returns anything and println(boolean) is only applicable for boolean type*/
      public static void main(String[] args) {
        
        // We can access void methods 
        Package1ParentClass obj = new Package1ParentClass();
        obj.print1();
        obj.print2();
        obj.print3();
    }                                           

    Package1ParentClass obj2 = new Package1ParentClass();
    
       // protected
    public void accessProtected(){
        System.out.println(obj2.a);
        System.out.println(obj2.add(4, 8));
        obj2.print1();
        // System.out.println(print1());  --> Error
    }

    // default
    public void accessDefault(){
        System.out.println(obj2.b);
        System.out.println(obj2.sub(10, 4));
         // System.out.println(print2());  --> Error
         obj2.print2();
    }

    // public
    public void accessPublic(){
        System.out.println(obj2.c);
        System.out.println(obj2.multiply(4,8));
         // System.out.println(print3());  --> Error
         obj2.print3();
    }
}
