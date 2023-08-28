package Coding_Activity_2.Decorator_Pattern;

public class CarDecorator implements Car {

    protected Car car;
    
    public CarDecorator(Car c){
        this.car=c;
    }
    
    @Override
    public void assemble() {
        this.car.assemble();
    }
    
}
