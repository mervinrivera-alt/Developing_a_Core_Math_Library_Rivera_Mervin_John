/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2act1;

/**
 *
 * @author SHANE
 */
public class triangleClass extends sem2GeomMath{
    private double lenght;
    private double width;
    
    public triangleClass(double lenght, double width) {
         if (lenght <= 0 || width <= 0 ) {
            throw new IllegalArgumentException("Radius must be positive");
        }
         this.lenght = lenght;
         this.width = width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }
    
    @Override
    public double calculate() {
        return lenght * width;
    }
    
    public double Circumference() {
        return 2 * lenght + 2 * width;
    }
}
