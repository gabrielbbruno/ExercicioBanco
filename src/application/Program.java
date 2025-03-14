package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Account conta;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Insira o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Insira o titular da conta: ");
        sc.nextLine();
        String titularConta = sc.nextLine();

        System.out.print("Existe um depósito inicial? (s/n) ");
        char resposta = sc.next().charAt(0);
        if (resposta == 's') {
            System.out.print("Insira o valor inicial do depósito: ");
            double depositoInicial = sc.nextDouble();
            conta = new Account(numeroConta, titularConta, depositoInicial);
        }
        else {
            conta = new Account(numeroConta, titularConta);
        }
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.print(conta);

        System.out.println();
        System.out.print("Insira o valor do depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados da conta atualizados: ");
        System.out.print(conta);

        System.out.println();
        System.out.print("Insira o valor do saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Dados da conta atualizados: ");
        System.out.print(conta);

    sc.close();
    }
}
