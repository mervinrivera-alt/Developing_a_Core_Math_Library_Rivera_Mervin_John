/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2act1;

/**
 *
 * @author SHANE
 */
public class PrimeCheckerClass extends NumberAnalysisClass{
    public PrimeCheckerClass( int number) {
        super(number);
    }
    
    @Override
    public boolean initialize() {
    if (getNumber() <= 1) return false;
    
    for (int i= 2; i <= Math.sqrt(getNumber()); i++) {
        if (getNumber() % i == 0) return false;
    }
    return true;
    }
}

