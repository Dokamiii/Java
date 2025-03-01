package scr;


public class Animal {
    //Atributos
    private String nome;
    private int idade;
    private String genero;

    public String getNome(){
        return nome;
    }

    public String setNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int newIdade){
        idade = newIdade;
    }

    public String getGenero(){
        return genero;
    }

    public String setGenero(){
        return genero;
    }

    //metodos
    public int correr(int aceleracao) {
        aceleracao += idade;
        return aceleracao;
    }

    public void pular(){

    }
    
    //classe
    public class Cachorro {
        void latir () {
        }
    }

    class Gato {
        void miar () {
        }
    }

    public static void main(String[] args) {
        //Objeto animal (new Animal)
        Animal animal = new Animal();

        //chamando os atributos
        animal.nome = "Mongu";
        animal.genero = "Masculino";
        animal.idade = 5;

        //chamando o metodo
        System.err.println("o animal esta correndo a " + animal.correr(10) + " Km/h");

        Animal animal2 = new Animal();
        animal2.nome = "Kiara";
        animal2.genero = "Femea";
        animal2.idade = 5;

        System.out.println("o nome do Pet: " + animal.nome + ", Ele tem apenas " + animal.idade + " meses");
        System.out.println("o nome do Pet: " + animal2.nome + ", Ela tem apenas " + animal2.idade + " meses");
    }
 
}
 