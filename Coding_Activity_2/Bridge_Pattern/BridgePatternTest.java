package Coding_Activity_2.Bridge_Pattern;

public class BridgePatternTest {
    
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();
        
        Shape pent = new Pentagon(new RedColor());
        pent.applyColor();
    }
}
