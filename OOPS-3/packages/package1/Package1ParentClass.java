package packages.package1;

public class Package1ParentClass {

    // protected
    protected int a = 5;
    protected void print1(){
        System.out.println("In protected");
    }
    protected int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        
        Package1ParentClass obj = new Package1ParentClass();
        obj.print1();
        obj.print2();
        obj.print3();
    }

    // default
    int b = 10;
     void print2(){
        System.out.println("In default");
    }
     int sub(int a,int b){
        return a-b;
    }

    // public
    public int c = 5;
    public void print3(){
        System.out.println("In public");
    }
    public int multiply(int a,int b){
        return a*b;
    }
    
}
