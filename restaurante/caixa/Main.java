package restaurante.caixa;

import java.util.Scanner;
import restaurante.caixa.cadastrocliente.Cliente;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro nome");
        String primeiroNome = teclado.nextLine();

        System.out.println("Digite o segundo nome");
        String segundoNome = teclado.nextLine();
        String nomeCompleto = primeiroNome + " " + segundoNome;

        String cpf;
        boolean cpfValido;
        do { 
            System.out.println("Digite o CPF");
            cpf = teclado.nextLine();
            
            cpfValido =!cpf.matches("\\d{10,11}");

            if(!cpfValido){
                System.out.println("CPF invalido!");
            }
        } while (!cpfValido);

        String numeroTelefone;
        boolean telefoneValido;
        do {
            System.out.println("Digite o numero de telefone: ");
            numeroTelefone = teclado.nextLine();

            telefoneValido = numeroTelefone.matches("\\d{11,13}");
            if(!telefoneValido){
                System.out.println("Número de telefone invalido!");

            } 
            } while (!telefoneValido);
     
        Cliente cliente = new Cliente(nomeCompleto, cpf, numeroTelefone);

        System.out.println("Nome Completo: " + cliente.getNomeCompleto());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Numero de telefone :" + cliente.getNumerotelefone());

        teclado.close();
    }
}
