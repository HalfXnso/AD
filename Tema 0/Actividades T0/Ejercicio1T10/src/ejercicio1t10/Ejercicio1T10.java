package ejercicio1t10;

import java.util.Scanner;

public class Ejercicio1T10 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce el nombre: ");
        String nombre = tec.nextLine();
        System.out.println("Introduce el sueldo: ");
        double sueldo = tec.nextDouble();
        tec.nextLine();
        System.out.println("Introduce la categoría laboral (1)(2)(3)(4): ");
        int catLab = tec.nextInt();
        tec.nextLine();
        System.out.println("Introduce la población: ");
        String poblacion = tec.nextLine();

        if (poblacion.equals("Valencia")) {
            sueldo += sueldo * 0.20;
        }
        System.out.println("El empleado " + nombre + " con categoria Laboral " + catLab
                + " de " + poblacion + " cobra " + sueldo);

    }

}
