// Only PUBLIC and DEFAULT interfaces(modifiers) are allowed (protected and private not allowed) 

// public interface -> must define in its OWN file as of or similar to CLASS 

interface Bird {

    // Methods in interface are by default PUBLIC and ABSTRACT
    void fly();
}

// default interface
interface Bird2{
    // Methods in interface are by default PUBLIC and ABSTRACT
    void fly();
}

// One interface can EXTENDS multiple parent interfaces

public interface  FlyingBirds extends Bird,Bird2{

    // Methods in interface are by default PUBLIC and ABSTRACT
    void fly();
    void flyHigh();
}

// interface cannot EXTENDS or IMPLEMENTS class
class NotBird{


}

interface  NonFlyingBirds{

    void notFly();
}