package cadastrocliente;

public class Cliente {

    static String nomeCliente() {
        String primeiroNome = "Eduardo";
        String segundoNome = "Francisco";
        return primeiroNome + " " + segundoNome;
    }

     static String cpfCliente(){
        String cpf = "460.006.258.20";
         return cpf;
     }

    public static void main(String[] args) {
        System.out.println("O nome do cliente é " + nomeCliente() + " e seu cpf é " + cpfCliente() );

    }
    
}
