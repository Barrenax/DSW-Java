public class Saludo {
    public static void main(String[] args) {
        // Comprueba si se ha introducido al menos un parámetro
        if (args.length > 0) {
            // Si hay parámetros, saluda a la persona usando el primero (args[0])
            System.out.println("Hola " + args[0]);
        } else {
            // Si no se introduce ninguno, saluda a todo el mundo
            System.out.println("Hola mundo");
        }
    }
}