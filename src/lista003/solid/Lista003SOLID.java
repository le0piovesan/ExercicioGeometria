/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista003.solid;

/**
 *
 * @author Leonardo
 */
public class Lista003SOLID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.setMedidaLado(10);
        quadrado.setPoligono(true);
        System.out.println("Quadrado e um poligono: " + (quadrado.isPoligono() ? "Sim" : "Nao"));
        System.out.println("Area do Quadrado: " + quadrado.calcularArea(quadrado.getMedidaLado(), quadrado.getLados()));
        System.out.println("Perimetro do Quadrado: " + quadrado.calcularPerimetro(quadrado.getMedidaLado(), quadrado.getLados()));
        
        Circulo circulo = new Circulo();
        circulo.setRaio(4);
        quadrado.setPoligono(false);
        System.out.println("\nCirculo e um poligono: " + (quadrado.isPoligono() ? "Sim" : "Nao"));
        System.out.println("Area do Circulo: " + circulo.calcularArea(circulo.getRaio()));
        System.out.println("Circunferencia do Circulo: " + circulo.calcularCircunferencia(circulo.getRaio()));

        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(8);
        retangulo.setBase(12);
        System.out.println("\nArea do Retangulo: " + retangulo.calcularArea(retangulo.getBase(), retangulo.getAltura()));
        System.out.println("Perimetro do Retangulo: " + retangulo.calcularPerimetro(retangulo.getBase(), retangulo.getAltura()));
    
        Triangulo triangulo = new Triangulo();
        triangulo.setLado1(20);
        triangulo.setLado2(30);
        triangulo.setLado3(40);
        System.out.println("\nArea do Triangulo: " + triangulo.calcularArea(triangulo.getLado1(), triangulo.getLado2(), triangulo.getLado3()));
        System.out.println("Perimetro do Triangulo: " + triangulo.calcularPerimetro(triangulo.getLado1(), triangulo.getLado2(), triangulo.getLado3()));
        System.out.println("Tipo do Triangulo: " + triangulo.tipoTriangulo(triangulo.getLado1(), triangulo.getLado2(), triangulo.getLado3()));

        Octogono octogono = new Octogono();
        octogono.setMedidaLados(5);
        System.out.println("\nArea do Octogono: " + octogono.calcularArea(octogono.getMedidaLados(), octogono.getLados()));
        System.out.println("Perimetro do Octogono: " + octogono.calcularPerimetro(octogono.getMedidaLados(), octogono.getLados()));
        System.out.println("Apotema do Octogono: " + octogono.calcularApotema(octogono.getMedidaLados()));
    }
    
}
