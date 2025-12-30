public interface Bird {
    
    // abstract method
    public void canFly();

    // default method
    default int getMinimumHeight(){
        return 100;
    }
}

class Eagle implements Bird{

public void canFly(){
    System.out.println("Eagle can fly");
}

// To implement default method here we need to override it here
@Override
public int getMinimumHeight(){
    return 200;
}
}

class Sparrow implements Bird{

    public void canFly(){
        System.out.println("Sparrow can fly");
    }
}