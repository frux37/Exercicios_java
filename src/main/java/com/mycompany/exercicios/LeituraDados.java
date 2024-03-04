/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exercicios;
import java.util.Scanner;

/**
 *
 * @author 20212pf.cc0012
 */
public class LeituraDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma string");
        String texto = entrada.nextLine();
        System.out.printf("O texto digitado é %s", texto);
    }
    
}
