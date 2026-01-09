// Multiple inheritance in java can achieved only through interfaces

interface WaterAnimal {
    public boolean canBreathe();
}

interface LandAnimal{
    public boolean canBreathe();
}

// Multiple inheritance

public class Crocodile implements WaterAnimal,LandAnimal{

    public boolean canBreathe(){
        return true;
    }
}