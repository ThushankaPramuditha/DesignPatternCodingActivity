package Coding_Activity_1.Prototype_Pattern;

public class Square extends Shape {
    
    public Square() {
        type = "Square";
    }
    
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
