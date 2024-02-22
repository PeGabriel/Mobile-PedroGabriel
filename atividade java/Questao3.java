/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade3;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Questao3 {

    public static void main(String[] args) {
        
        try{
        double resultado = 0;
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        double x = leia.nextDouble();
        System.out.println("Digite um numero: ");
        double y = leia.nextDouble();
        System.out.println("Digite a operação que deseja realizar: ");
        Scanner ope = new Scanner(System.in);
        String operacao = ope.nextLine();
        
        
        
        switch (operacao){
        case "+":
            resultado = x + y;
        break;
        
        case "-":
            resultado = x - y;
        break;
        
        case "*":
            resultado = x * y;
        break;
        
        case "/":
            if (y == 0) {
                    throw new ArithmeticException("Divisão por zero não é permitida.");
                }
            resultado = x / y;
        break;
        
        default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
        }
        
        
        System.out.println("O valor da " + operacao + " entre os numeros " + x + " e " + y + " é: ");
        System.out.println(resultado);   
        
        }catch (ArithmeticException e) {
            
            System.out.println( e);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e);
        } finally {
            
            
        }
    }
}
