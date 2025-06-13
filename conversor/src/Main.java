import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);

        try {
            Seleccion seleccion = new Seleccion();
            seleccion.setSelec();
        } catch (NumberFormatException e) {
            System.out.println("Número no encontrado\n" + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación..");
        }
    }
}
