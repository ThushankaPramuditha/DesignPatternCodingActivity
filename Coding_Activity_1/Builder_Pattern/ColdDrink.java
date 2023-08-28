package Coding_Activity_1.Builder_Pattern;

public abstract class ColdDrink implements Item{
    
    @Override
    public Packing packing() {
        return new Bottle();
    }
    
    @Override
    public abstract float price();
}
