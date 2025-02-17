package scr;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
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