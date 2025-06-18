import java.util.Scanner;
public class clientes {
    public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);

    System.out.println("Cuantos clientes hay el dia de hoy?");
    int clientes = scanner.nextInt();

    for (int i=1; i<=clientes; i++)
        
    scanner.close();
    }
}
