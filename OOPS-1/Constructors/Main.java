public class Main{

    public static void main(String[] args) {
        
        Complex n1 = new Complex(3,4);
         n1.print();
        Complex n2 = new Complex(5,6);
        n2.print();

    }
}

class Complex{

    int a,b;

    // Default contructor that java implicitly creates and initializes instance variables with default values

  /*  Complex(){
        a = 0;
        b = 0;
    }             */

    // When we create No-Args constructor it overrides that default contructor

 /*   Complex(){
        System.out.println("New Object created");
        a = 5;
        b = 4;
    }                 */

        // Parameterized Constructor

        Complex(int real, int imaginary){
            a = real;
            b = imaginary;
        }


    public void print(){
        // this.a = a;
        // this.b = b;
        System.out.println(a + " + " +  b  + "i");
    }
}