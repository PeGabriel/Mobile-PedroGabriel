/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao20;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Questao2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite um numero decimal: ");
        float x = leia.nextFloat();
        
        
        
        int inteira = (int)Math.floor(x);
        System.out.println("parte inteira equivale a:" + inteira);
        
        float decimal = x - inteira;
        System.out.printf("parte decimal equivale a: %.2f" , (decimal * 60));
        
        
    }
}
