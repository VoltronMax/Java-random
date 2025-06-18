import java.util.Scanner;
public class posi {
    public static void main(String[] args) {
    
        Scanner s = new Scanner (System.in);

    System.out.println("Veamos si su numero es positivo, o non");
    int numi = s.nextInt();

    if (numi>0){
    System.out.println("Felicidades, su numero es positivo");
    
    }else if (numi==0){
    System.out.println("Su numero es 0");
    
    } else {
    System.out.println("Su numero es negativo");

    }

    s.close();
    }
}
