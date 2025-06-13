import java.io.IOException;
import java.util.Scanner;

public class Seleccion {
    public void MostrarMenu() {
        System.out.print("""
                ******************************************
                Bienvenid@ a Nuestro Conversor de Monedas:
                
                1) Dólar Americano => Peso Argentino
                2) Peso Argentino => Dólar Americano
                3) Dólar Americano => Real Brasileño
                4) Real Brasileño => Dólar Americano
                5) Dólar Americano => Peso Chileno
                6) Peso Chileno => Dólar Americano
                7) Salir
                
                Elija una opción válida:
                ******************************************
                """);
    }

    public void setSelec() {
        Scanner lectura = new Scanner(System.in);
        Consultas consulta = new Consultas();
        String codigoBase = "";
        String codigoDestino = "";
        float monto = 0;
        int selec = 0;

        while (selec != 7) {
            MostrarMenu();
            selec = lectura.nextInt();
            switch (selec) {
                case 1:
                    codigoBase = "USD";
                    codigoDestino = "ARG";
                    break;
                case 2:
                    codigoBase = "ARG";
                    codigoDestino = "USD";
                    break;
                case 3:
                    codigoBase = "USD";
                    codigoDestino = "BRL";
                    break;
                case 4:
                    codigoBase = "BRL";
                    codigoDestino = "USD";
                    break;
                case 5:
                    codigoBase = "USD";
                    codigoDestino = "CLP";
                    break;
                case 6:
                    codigoBase = "CLP";
                    codigoDestino = "USD";
                    break;
                default:
                    System.out.println("Por favor ingrese un valor válido para convertir.");
            }
            System.out.println("Por favor ingresa el valor que deseas convertir: ");
            monto = lectura.nextFloat();
            Intercambios resultado = consulta.ConsultaIntercambio(codigoBase, codigoDestino, monto);

            System.out.printf("El valor %.2f [%s] corresponde al valor final de =>>> %.2f [%s]\n",
                    monto, codigoBase,
                    resultado.conversion_result(), codigoDestino);
        }
    }
}