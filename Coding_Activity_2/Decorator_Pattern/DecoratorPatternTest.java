package Coding_Activity_2.Decorator_Pattern;

public class DecoratorPatternTest {
    
    public static void main(String[] args) {
        
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        
        System.out.println("\n*****");
        
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
