/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista003.solid;

/**
 *
 * @author Leonardo
 */
public class Circulo extends FiguraGeometrica {
    double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
      public double calcularCircunferencia(double raio) {
        double circunf;
        circunf =  2 * 3.14 * raio;
        return circunf;
    }
    
    public double calcularArea(double raio) {
        double area;
        area = 3.14 * (raio * raio);
        return area;
    }  
}
