import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double h,d,areacir,areatri,altura,areatotaltri, areatotalcir,sumaarea=0;

        System.out.println("ingrese la medida del diametro=   ");
        d=sc.nextDouble();

        System.out.println("ingrese la medida de la hipotenusa=   ");
        h=sc.nextDouble();

        altura=Math.sqrt(Math.pow(h, 2)+Math.pow(d/2, 2));
        areatri=((d/2)*altura)/2;
        areatotaltri=areatri*2;

        areacir=Math.PI*Math.pow(d/2, 2);
        areatotalcir=areacir/2;
        sumaarea=areatotaltri+areatotalcir;

        System.out.println("el area total es=   "+sumaarea);







        
    }
    
}