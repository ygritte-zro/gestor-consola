package gestor;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println("========= Gestor de Archivos por consola ================");
        System.out.println("=========================================================");

        Ventana ventana = new Ventana();
        System.out.println(ventana.view());

    }

}
