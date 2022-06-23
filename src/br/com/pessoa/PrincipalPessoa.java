package br.com.pessoa;

public class PrincipalPessoa {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("carlos");
        pessoa1.setEndereco("Rua get start 5 ");
        pessoa1.setTelefone("(11)97766-000");

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getEndereco());
        System.out.println(pessoa1.getTelefone());




    }
}
