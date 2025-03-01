package scr;

import java.awt.*;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) {

        //Calculadora
        Scanner teclado2 = new Scanner(System.in);
        int n1 = teclado2.nextInt();
        int n2 = teclado2.nextInt();

        int s = n1 + n2;
        System.out.println("A soma é: "+ s);

        String primeiroNome = teclado2.nextLine();
        String sobrenome = teclado2.nextLine();
        System.out.println("meu nome é "+ primeiroNome + sobrenome);

    //Desclaração de variaveis
    int idade = 3; //numero real
    float sal = 1825.54f; //
    char letra = 'G';
    boolean casado = false;

    //Typecast
    int idades = (int) 3;
    float sala = 1825.54f;
    char letras = (char) 'G';
    boolean casada = (boolean) false;
    

    /* Wrapper Class
        Integer years = new Integer(3);
        Float salario = new Float(1825.54f);
        Character letr = new Character('G');
        Boolean casados = new Boolean(false);
        
     Família | Tipo Primitivo | Classe Involucro(Wrapper) | Tamanho | Exemplo
       Logico      Boolean              Boolean                1 bit     truen


       Literais     char               Character               1 Byte     `A`
                     -                  String              1 Byte/cada  "JAVA"


       Inteiros     byte                 Byte                  1 byte     127
                    short               Short                 2 bytes   32 1767
                    int                 Integer                4 bytes  2 147 483
                    long                Long                   8 bytes    2^63


      Reais         float               Float                  4 bytes   3.4e^+38
                    double             Double                  8 bytes   1.8ee^+308

            */

    

        //Converte variaveis atravaes de classe involucro(wrapper class)
        int idade2 = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);

        String valores = "30";
        int idad = Integer.parseInt(valor);
        System.out.println(idad);
        float idadef = Float.parseFloat(valor);
        System.out.println(idadef);



        //Entrada de Dados!
            Scanner teclado = new Scanner(System.in);
            String nome = teclado.nextLine();
            float nota = teclado.nextFloat();
            float salario = teclado.nextFloat();


        //Saida de dados!
            System.out.println("sua nota é " + nota);
            System.out.printf("A nota de %s é %.2f \n", nome, nota);
            System.out.format("A nota de %s é %.2f \n", nome, nota);

        //Codigo para mostrar a hora a linguagem e resolução do PC!
            System.out.println("Olá mundo");
            Date relogio = new Date();
            System.out.println("A hora do sistema é ");
            System.out.println(relogio.toString());

            Locale locale = new Locale("Portugues", "pt");
            System.out.println("Linguagem: " + Locale.getDefault());

            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();
            System.out.println("Screen width = " + d.width);
            System.out.println("Screen height = " + d.height);
            
    }


    

}