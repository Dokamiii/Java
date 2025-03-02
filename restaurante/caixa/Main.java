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
        
        do { 
            System.out.println("Digite o CPF");
            String cpf = teclado.nextLine();            
        } while (false);

        System.out.println("Digite o numero de telefone: ");
        String numeroTelefone = teclado.nextLine();
     
        Cliente cliente = new Cliente(nomeCompleto, cpf, numeroTelefone);

        System.out.println("Nome Completo: " + cliente.getNomeCompleto());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Numero de telefone :" + cliente.getNumerotelefone());

        teclado.close();
    }
}
