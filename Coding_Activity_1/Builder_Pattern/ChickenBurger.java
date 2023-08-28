package Coding_Activity_1.Builder_Pattern;

public class ChickenBurger extends Burger {
    
    @Override
    public float price() {
        return 50.5f;
    }
    
    @Override
    public String name() {
        return "Chicken Burger";
    }
}
