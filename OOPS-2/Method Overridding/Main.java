public class Main{

    public static void main(String args[]){

        C obj = new C();
        obj.print(); 
    }
}

class A{

    public void print(){
        System.out.println("Print in class A");
    }
}

class B extends A{
     public void print(){
        System.out.println("Print in class B");
    }
}

class C extends B{
    //  public void print(){
    //     System.out.println("Print in class C");
    // }
}