package Coding_Activity_1.Prototype_Pattern;

public class Rectangle extends Shape{
    
    public Rectangle() {
        type = "Rectangle";
    }
    
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
