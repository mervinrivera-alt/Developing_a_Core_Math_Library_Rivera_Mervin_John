/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2act1;

/**
 *
 * @author SHANE
 */
public class circleClass extends sem2GeomMath{
    
    private double radius;
    
    public circleClass(double radius) {
         if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }
        
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    @Override
    public double calculate() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double Circumference() {
        return 2 * Math.PI * radius;
    }
}
