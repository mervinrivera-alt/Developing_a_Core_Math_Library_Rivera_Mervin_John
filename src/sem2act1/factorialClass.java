/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2act1;

/**
 *
 * @author SHANE
 */
public class factorialClass extends NumberAnalysisClass{
    
    public factorialClass(int number) {
        super(number);
    }
    
    @Override
    public boolean initialize() {
    if (getNumber() <= 0) return false;
    
    for (int i= 1; i <= Math.sqrt(getNumber()); i++) {
        if (getNumber() % i == 0) return false;
    }
    return true;
    }
}
