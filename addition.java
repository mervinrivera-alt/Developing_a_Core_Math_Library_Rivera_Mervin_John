/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2act1;

/**
 *
 * @author SHANE
 */
public class addition extends sem2ArithMath {

    public addition(double A, double B) {
        super(A, B);
    }
    
    @Override
    public double calculate() {
        return getValue() + getValue2();
    }
}
