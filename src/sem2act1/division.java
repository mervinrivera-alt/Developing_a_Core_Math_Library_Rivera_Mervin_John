/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2act1;

/**
 *
 * @author SHANE
 */
public class division extends sem2ArithMath{
    
    public division(double A, double B) {
        super(A, B);
    }

    @Override
    public double calculate() {
        if (getValue2() == 0) { 
            System.out.println("Erorr\ntask cannot be performed!");
            return 0;
        }
        return getValue() / getValue2();
    }
}
