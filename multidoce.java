import java.util.Scanner;
public class multidoce {

    public static void main(String[] args) {
        
    Scanner s = new Scanner (System.in);

    System.out.println("Ingrese un numero para multiplicarlo de 1 a 12");
    int a = s.nextInt();

    for(int i=1; i<=12; i++)

    System.out.println(a + " x " + i + " es igual a: " + (a*i));
    s.close();
    }
    
}
