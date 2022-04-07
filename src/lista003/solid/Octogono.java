/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista003.solid;

/**
 *
 * @author Leonardo
 */
public class Octogono extends FiguraGeometrica {
    int lados = 8;
    boolean regular = true;
    float medidaLados;
    
    public int getLados() {
        return lados;
    }
    
    public boolean isRegular() {
        return regular;
    }

    public float getMedidaLados() {
        return medidaLados;
    }

    public void setMedidaLados(float medidaLados) {
        this.medidaLados = medidaLados;
    }
    
    public float calcularPerimetro(float medidaLados, float lados) {
        return medidaLados * lados;
    }
    
    public double calcularApotema(float medidaLados) {
        double apotema;
        apotema = medidaLados / 0.828;
        return apotema;
    }
    
    public double calcularArea(float medidaLados, float lados) {
        double area;
        float perimetro = calcularPerimetro(medidaLados, lados);
        double apotema = calcularApotema(medidaLados);
        
        area = (perimetro * apotema) / 2;
        return area;
    }


}
