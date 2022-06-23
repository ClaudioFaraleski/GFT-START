package br.com.banco;

public class Conta {

    private Integer numero;
    private String titular;
    private double saldo;

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Double Rendimentos (Double saldo){

        double rendimento;

        rendimento = this.Rendimentos(saldo);
        return rendimento;
    }

    public void imprimir(){
        System.out.println("================================");
        System.out.println("Numero da Agencia :"+getNumero());
        System.out.println("Nome do Titula :"+getTitular());
        System.out.println("Saldo :"+getSaldo());


    }




}