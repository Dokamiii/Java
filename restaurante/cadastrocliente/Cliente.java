package restaurante.cadastrocliente;

import java.util.Scanner;

public class Cliente {

    private String nomeCompleto;
    private String cpf;
    private String numeroTelefone;

    public Cliente(String nomeCompleto, String cpf, String numeroTelefone) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto; 
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumerotelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro nome");
        String primeiroNome = teclado.nextLine();

        System.out.println("Digite o segundo nome");
        String segundoNome = teclado.nextLine();
        String nomeCompleto = primeiroNome + " " + segundoNome;

        System.out.println("Digite o CPF");
        String cpf = teclado.nextLine();

        System.out.println("Digite o numero de telefone: ");
        String numeroTelefone = teclado.nextLine();

        Cliente cliente = new Cliente(nomeCompleto, cpf, numeroTelefone);

        System.out.println("Nome Completo: " + cliente.getNomeCompleto());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Numero de telefone :" + cliente.getNumerotelefone());

        teclado.close();
    }

}
