public class Eagle implements Bird{

    // We can access static method directly using interface name same as static method in class
    public void show(){
    if(Bird.canBreathe()){
        System.out.println("Birds can breathe..");
    }}
    

    // if we try to override the static method it will be treated as a normal method in Bird class
     boolean canBreathe(){
        System.out.println("Eagle can Breathe..");
        return true;
    }

    // if you try to put @override annotation it will not allow you

    }

