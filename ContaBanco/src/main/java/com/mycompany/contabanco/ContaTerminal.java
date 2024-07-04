/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.contabanco;

import java.util.Scanner;

/**
 *
 * @author romulo
 */
public class ContaTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta: ");
        numero = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = sc.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente: ");
        nomeCliente = sc.nextLine();
        
        System.out.println("Por favor, digite o saldo do Cliente: ");
        saldo = Float.parseFloat(sc.next());
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso "
                + "banco, sua agência é %s, conta %d e seu saldo %.2f já está "
                + "disponível para saque", nomeCliente, agencia,
                numero, saldo);
    }
    
}
