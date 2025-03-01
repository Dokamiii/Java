package scr;


public class Animal {
    //Atributos
    String nome;
    int idade;
    String sex;

    //metodos
    void correr(int aceleracao) {
        idade += aceleracao;
    }

    void pular(){

    }
    
    //classe
    public class cachorro {
        String latir;
    }

    class gato {
        String miar;
    }

    public static void main(String[] args) {
        //Objeto animal (new Animal)
        Animal animal = new Animal();

        //chamando os atributos
        animal.nome = "Mongu";
        animal.sex = "Masculino";
        animal.idade = 5;

        //chamando o metodo
        animal.correr(10);
        System.err.println(animal.correr);

        Animal animal2 = new Animal();
        animal2.nome = "Kiara";
        animal2.sex = "Femea";
        animal2.idade = 5;

        System.out.println("o nome do Pet: " + animal.nome + ", Ele tem apenas " + animal.idade + " meses");
        System.out.println("o nome do Pet: " + animal2.nome + ", Ela tem apenas " + animal2.idade + " meses");
    }
 
}
 