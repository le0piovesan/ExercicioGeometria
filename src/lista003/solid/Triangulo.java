/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista003.solid;

/**
 *
 * @author Leonardo
 */
public class Triangulo extends FiguraGeometrica {
    int lados = 3;
    float lado1;
    float lado2;
    float lado3;

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }
    
    public float getLado1() {
        return lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    
    public float getLado2() {
        return lado2;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }
    
    public float getLado3() {
        return lado3;
    }

    public int getLados() {
        return lados;
    }
    
    public float calcularPerimetro(float lado1, float lado2, float lado3) {
    float perimetro;
    perimetro = (lado1 + lado2 + lado3) / 2;
    return perimetro;
    }
    
    public double calcularArea(float lado1, float lado2, float lado3) {
    double area;
    float perimetro = calcularPerimetro(lado1, lado2, lado3);
    
    area =  Math.sqrt(perimetro * (perimetro - lado1) * (perimetro - lado2) * (perimetro - lado3));
    return area;
    }
    
    public String tipoTriangulo(float lado1, float lado2, float lado3) {
      if (lado1 == lado2 && lado2 == lado3)
    {
        return "O triangulo eh equilatero";
    }
    else if (lado1 != lado2 && lado2 != lado3)
    {
        return "O triangulo eh escaleno";
    }
    else
    {
        return "O triangulo eh isosceles";
    }
    }
    
    
}
