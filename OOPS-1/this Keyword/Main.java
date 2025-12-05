public class Main{

    public static void main(String[] args) {
        
    }
}

class Numbers{

    int a,b;

    // accessing current instance var using 'this'

    public void setNumbers(int a,int b){
        this.a = a;
        this.b = b;
    }

    public int getNumbers(){
        return a+b;
    }

    
}