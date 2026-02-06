/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2act1;

/**
 *
 * @author SHANE
 */
public abstract class sem2ArithMath extends sem2base{
    private double value2;
    
    public sem2ArithMath(double A, double B) {
        super(A);
        this.value2 = B;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    
}
