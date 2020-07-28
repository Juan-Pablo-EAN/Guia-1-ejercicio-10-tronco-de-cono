package tronco.de.cono;

import java.util.Scanner;
import java.text.DecimalFormat;
public class TroncoDeCono {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#.0");
        int r = 0;
        int h = 0;
        int h2 = 0;
        
        System.out.println("¿Cual es la altura del cono completo?");
        h = entrada.nextInt();
        System.out.println("¿Cual es el radio del cono completo?");
        r = entrada.nextInt();
        System.out.println("¿Cual es la altura del cono deficiente?");
        h2 = entrada.nextInt();
        
        double r2 = (double)(h2*r)/h;
        double v = (Math.PI*Math.pow(r,2))*h;
        double v2 = (Math.PI*Math.pow(r2,2))*h2;
        double vt = v-v2;
        
        System.out.println(" ");
        System.out.println("El radio del cono deficiente es:" + " " + dec.format(r2) + "cm");
        System.out.println("El volumen del tronco del cono es" + " " + dec.format(vt) + " " + "cm^3");
    }
    
}
