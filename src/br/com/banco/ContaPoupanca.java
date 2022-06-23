package br.com.banco;

public class ContaPoupanca extends  Conta{

    public Double Rendimentopoupanca(double saldo){

        Double rendimentopoupanca = saldo * 0.5;
        System.out.println("================================");
        System.out.println("Numero da Agencia :"+getNumero());
        System.out.println("Nome do Titula :"+getTitular());
        System.out.println("Saldo :"+getSaldo());
        System.out.println("Rendimentos Conta Poupança é :"+rendimentopoupanca);

        return rendimentopoupanca;
    }
}