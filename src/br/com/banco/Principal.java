package br.com.banco;

public class Principal {


    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.setNumero(01);
        cc.setTitular("Adolfo");
        cc.setSaldo(1000);
        cc.getSaldo();
        cc.RendimentoCorrente(cc.getSaldo());


        cp.setNumero(02);
        cp.setTitular("honam");
        cp.setSaldo(500);
        cp.getSaldo();
        cp.Rendimentopoupanca(cp.getSaldo());



    }




}
