import java.util.Scanner;

public class Saludos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número del 1 al 10: ");
        int numero = sc.nextInt();



        if (numero < 1 || numero > 10)  {
            System.out.println("Número fuera de rango. Fin del programa.");
        } else  {
            

            sc.nextLine(); 
            System.out.print("Introduce tu nombre: ");
            String nombre = sc.nextLine();


            for (int i = 0; i < numero; i++) {
                System.out.println("Hola " + nombre);
            }


            System.out.println("Tu nombre tiene " + nombre.length() + " caracteres");
        }

        sc.close();
    }
}