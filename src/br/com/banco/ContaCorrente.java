package br.com.banco;

public class ContaCorrente extends Conta{

    public Double RendimentoCorrente(double saldo){

        Double rendimentocorrente = saldo *0.3;
        System.out.println("================================");
        System.out.println("Numero da Agencia :"+getNumero());
        System.out.println("Nome do Titula :"+getTitular());
        System.out.println("Saldo :"+getSaldo());
        System.out.println("Rendimentos Conta Corrente é :"+rendimentocorrente);

        return rendimentocorrente;
    }
}