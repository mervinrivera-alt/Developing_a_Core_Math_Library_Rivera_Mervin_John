/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2act1;

/**
 *
 * @author SHANE
 */
public abstract class sem2base {

    private double value;

    public sem2base(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value1) {
        this.value = value1;
    }
    public abstract double calculate();
}
