/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem2act1;

/**
 *
 * @author SHANE
 */
public class Sem2Act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        addition add = new addition(15, 10);
        System.out.println("Addition Result: " + add.calculate());
        
        subtraction sub = new subtraction(15,10);
        System.out.println("\nSubtraction Result: " + sub.calculate());
        
        multiplication mul = new multiplication(15, 10);
        System.out.println("\nMultiplication Result: " + mul.calculate());

        division div = new division(20, 0);
        System.out.println("\nDivision Result: " + div.calculate());

        circleClass circle = new circleClass(-3);
        System.out.println("\nCircle Area: " + circle.calculate());

        PrimeCheckerClass prime = new PrimeCheckerClass(4);
        System.out.println("\nPrime: " + prime.initialize());
        
        StatsTestClass mean = new StatsTestClass(10,12);
        System.out.println("\nMean Result: " + mean.calculate());
    }

}
    

