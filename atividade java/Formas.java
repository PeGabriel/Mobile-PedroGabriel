
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


abstract class Forma {
    abstract double calcular_area() ;
}

class Quadrado extends Forma {
    double lado;
    Quadrado(double lado) {
        this.lado = lado;
    }
    @Override
    double calcular_area() 
        throws InputMismatchException {
        if (lado < 0) {
            throw new InputMismatchException("Entrada inválida: lado não pode ser negativo.");
        }
        return lado * lado;
    }
}
class Circulo extends Forma {
    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    double calcular_area() 
        throws InputMismatchException {
        if (raio < 0) {
            throw new InputMismatchException("Entrada inválida: raio não pode ser negativo.");
        }
        return Math.PI * raio * raio;
    }
}
class Triangulo extends Forma {
    double base;
    double altura;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    double calcular_area() throws InputMismatchException {
        if (base < 0 || altura < 0) {
            throw new InputMismatchException("Entrada inválida: base ou altura não podem ser negativos.");
        }
        return (base * altura) / 2;
    }
}
public class Formas {
    public static void main(String[] args) {
        try {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Digite o lado do quadrado: ");
                double ladoQuadrado = scanner.nextDouble();
                Forma quadrado = new Quadrado(ladoQuadrado);
                
                System.out.print("Digite o raio do círculo: ");
                double raioCirculo = scanner.nextDouble();
                Forma circulo = new Circulo(raioCirculo);
                
                System.out.print("Digite a base do triângulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Digite a altur do triângulo: ");
                double alturaTriangulo = scanner.nextDouble();
                Forma triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                
                
                System.out.println("Área do quadrado: " + quadrado.calcular_area());
                System.out.printf("Área do círculo:" + circulo.calcular_area());
                System.out.println("");
                System.out.println("Área do triângulo: " + triangulo.calcular_area());
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida: o valor digitado não é um número válido.");
        }
    }
}


