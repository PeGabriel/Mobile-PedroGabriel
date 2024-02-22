
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade;



import java.util.Scanner;

 /**
 *
 * @author Gabriel
 */
public class Questão1 {

    public static void main(String[] args) {
        double resultado = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o salário base:" );
        double x = input.nextDouble();
        System.out.println("o anos trabalhados: ");
        int ano = input.nextInt();
        System.out.println("o seu desempenho (0 a 5): ");
        int valor = input.nextInt();
        
        
        if (valor == 5 && ano > 3 ){
            resultado = x * 0.20;
        }else if (valor >= 4 && ano > 2){
            resultado = x * 0.15;
        }else if (valor >= 3 && ano > 1){
            resultado = x * 0.10;
        }
        else{
            resultado = x * 0.05;
        }
        System.out.println("O valor salarial base é: " + x);
        System.out.println("O bonus é: " + resultado);
        System.out.println("Valor total" + (resultado + x));
    }
}
