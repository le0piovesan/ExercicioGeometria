/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista003.solid;

/**
 *
 * @author Leonardo
 */
public class Quadrado extends FiguraGeometrica {
    private int lados = 4;
    private float medidaLado;
    

    public float getMedidaLado() {
        return medidaLado;
    }

    public void setMedidaLado(float medidaLado) {
        this.medidaLado = medidaLado;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }
    
    public float calcularPerimetro(float medidaLado, int lados) {
        return medidaLado * lados;
    }
    
    public float calcularArea(float medidaLado, int lados) {
        return medidaLado * lados;
    }  
}
