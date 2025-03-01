package restaurante.cadastrocliente;

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

}
