/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao4;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos a serem cadastrados: ");
            int quantidadeAlunos = scanner.nextInt();
            scanner.nextLine();

            String[] nomes = new String[quantidadeAlunos];
            int[] idades = new int[quantidadeAlunos];
            double[] notas = new double[quantidadeAlunos];
        try {
            

            for (int i = 0; i < quantidadeAlunos; i++) {
                try{
                    System.out.printf("Digite o nome do aluno %d: ", i + 1);
                nomes[i] = scanner.nextLine();
                if(nomes[i].matches(".*\\d.*")){
                    throw new IllegalArgumentException("o nome possui numeros no nome");
                }
                    System.out.printf("Digite a média do aluno %d: ", i + 1);
                    notas[i] = scanner.nextDouble();
                    scanner.nextLine();
                    if (notas[i] < 0 || notas[i] > 10) {
                        throw new InputMismatchException("A média deve estar entre 0 e 10.");
                    }
                    System.out.printf("Digite a idade do aluno %d: ", i + 1);
                    idades[i] = scanner.nextInt();
                    scanner.nextLine();
                    if (idades[i] < 0) {
                        throw new InputMismatchException("A idade não pode ser negativa.");
                    }
                } catch (Exception e) {
                    System.out.println("Erro: Entrada inválida." + e);
                    i--; // 
                }
            }
        }catch(Exception e){
                    System.out.println(e);
        }finally {
            scanner.close();
            System.out.println("Cadastro de Alunos:");
            for (int i = 0; i < quantidadeAlunos; i++) {
                System.out.printf("%s - %d anos - %.1f\n", nomes[i], idades[i], notas[i]);
            }
        }
    }
}
