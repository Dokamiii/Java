package scr;

public class Loop {
    
    public static void main(String[] args) {
        
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while ( i <= 5);

        System.out.println("Contagem regressiva");
        int regressivo = 5;
        while (regressivo > 0) {
            System.out.println(regressivo);
            regressivo--;
        }

        System.out.println("zerado");

        int dice = 1;
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("Não passou");
            } else {
                System.out.println("passou");
            }
            dice = dice + 1;
        }

        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("testando outro for ");
        for (i = 0; i < 10; i = i + 2) {
            System.out.println(i);
        }

        for(i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " , " + j + " ");
            }
        }
    }
    
}
