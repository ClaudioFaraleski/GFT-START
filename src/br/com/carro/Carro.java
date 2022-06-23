package br.com.carro;

public class Carro {

    String modelo;
    String Marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String Combustivel(String modelo) {

        if (modelo.equals("fiat")) {

            System.out.println("Gasolina");
        }else{

            System.out.println("Diesel");
        }
        return modelo;
    }
}