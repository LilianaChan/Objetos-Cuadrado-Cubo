/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosgeometricos;

/**
 *
 * @author Lily
 */
public class Cuadrado {
    public double x;

    public Cuadrado(double lado) {
        this.x = lado;
    }
        
    public double calcularArea() {
        return this.x * this.x;
    }

    public double calcularPerimetro() {
        return this.x * 4;
    }
}
