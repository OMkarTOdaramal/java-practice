interface Bird{
    
    public void fly();
}

// Hierarchical Inheri

class Eagle implements Bird{

    public void fly(){
        System.out.println("Eagle flies");
    }
}

class Hen implements Bird{

    public void fly(){
        System.out.println("Hen flies");
    }
}