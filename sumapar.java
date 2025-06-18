import java.util.Scanner;
public class sumapar {
    
    public static void main(String[] args) {
    
        Scanner s = new Scanner (System.in);
        int contador=0;

        for (int i=1; i<=10; i++){
        int num1;
        System.out.println("Ingrese el numero " + i);
        num1 = s.nextInt();
        

        if (num1 % 2 == 0){
        contador = contador+num1;
        }

        }
        System.out.println(contador);
        s.close();
        }
        }
