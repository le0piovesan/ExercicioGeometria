/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista003.solid;

/**
 *
 * @author Leonardo
 */
public class Retangulo extends FiguraGeometrica {
    int lados = 4;
    private float altura;
    private float base;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public int getLados() {
        return lados;
    }

    public float calcularPerimetro(float base, float altura) {
        return 2 * (base + altura);
    }
    
    public float calcularArea(float base, float altura) {
        return base * altura;
    }
}
