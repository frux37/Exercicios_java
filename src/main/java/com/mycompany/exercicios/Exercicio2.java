/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author carlos.aguirre
 */
import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        int num1 = entrada.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        int num2 = entrada.nextInt();
        
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = 0;
        
        if(num2 != 0){
            divisao = num1 / num2;
        }
        
        System.out.println("O resultado da soma eh: " + soma);
        System.out.println("O resultado da subtracao eh: " + subtracao);
        System.out.println("O resultado da multiplicacao eh: " + multiplicacao);
        
        if(num2 != 0)
        {
             System.out.println("O resultado da divisao eh: " + divisao);
        } else {
            System.out.println("Não é possível dividir por 0!!");
        }
        
        entrada.close();
        
        System.out.println("Alteração no código do exercício 2");
    }
    
}
