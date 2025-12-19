import java.util.Scanner;
import java.util.ArrayList;

public class Registro_curso {

    public void registro() {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Qué rol cumples en el centro? \n"
                + "1. Docente. \n"
                + "2. Alumno.\n ");
        int r = sc.nextInt();
        sc.nextLine();

        switch (r) {
            case 1:
                // ArrayList para guardar los datos del docente
                // [0]nombre, [1]primer apellido, [2]segundo apellido, [3]DNI,
                // [4]fecha nacimiento, [5]género, [6]correo, [7]dirección,
                // [8]puerta, [9]código identificación, [10]idioma especialización, [11]nivel
                ArrayList<String> docente = new ArrayList<>();
                // ArrayList para números del docente
                // [0]teléfono, [1]portal, [2]piso, [3]código postal
                ArrayList<Integer> numerosDocente = new ArrayList<>();

                System.out.println("Nombre del docente: ");
                docente.add(sc.nextLine());

                System.out.println("Primer apellido: ");
                docente.add(sc.nextLine());

                System.out.println("Segundo apellido: ");
                docente.add(sc.nextLine());

                System.out.println("DNI/NIE: ");
                docente.add(sc.nextLine());

                System.out.println("Fecha de nacimiento: ");
                docente.add(sc.nextLine());

                System.out.println("Género (H/M): ");
                docente.add(sc.nextLine());

                System.out.println("Dirección de correo electrónico: ");
                docente.add(sc.nextLine());

                System.out.println("Número de teléfono: ");
                numerosDocente.add(sc.nextInt());
                sc.nextLine();

                System.out.println("Dirección de domicilio: ");
                docente.add(sc.nextLine());

                System.out.println("Portal: ");
                numerosDocente.add(sc.nextInt());

                System.out.println("Piso: ");
                numerosDocente.add(sc.nextInt());
                sc.nextLine();

                System.out.println("Puerta: ");
                docente.add(sc.nextLine());

                System.out.println("Código postal: ");
                numerosDocente.add(sc.nextInt());
                sc.nextLine();

                System.out.println("Ingresa tu código de identificación: ");
                docente.add(sc.nextLine());

                System.out.println("¿Cuál es tu idioma de especialización? ");
                docente.add(sc.nextLine());

                System.out.println("¿Qué nivel de " + docente.get(10) + " tienes asignado?");
                docente.add(sc.nextLine());

                System.out.println(" ");
                System.out.print("Su documentación personal es: \n"
                        + "Nombre completo: " + docente.get(1) + " " + docente.get(2) + " " + docente.get(0) + "\n"
                        + "DNI/NIE: " + docente.get(3) + "\n"
                        + "Fecha de nacimiento: " + docente.get(4) + "\n"
                        + "Género (H/M): " + docente.get(5) + "\n"
                        + "Dirección de correo electrónico: " + docente.get(6) + "\n"
                        + "Número de teléfono: " + numerosDocente.get(0) + "\n"
                        + "Dirección de domicilio: " + docente.get(7) + "\n"
                        + "Portal: " + numerosDocente.get(1) + "\n"
                        + "Piso: " + numerosDocente.get(2) + "\n"
                        + "Puerta: " + docente.get(8) + "\n"
                        + "Código Postal: " + numerosDocente.get(3) + "\n"
                        + "Código de identificación: " + docente.get(9) + "\n"
                        + "Idioma de especialización: " + docente.get(10) + "\n"
                        + "Nivel de " + docente.get(10) + " asignado: " + docente.get(11) + "\n"
                        + "¡Hasta Pronto!");
                break;

            case 2:
                // ArrayList para guardar los datos del alumno
                // [0]nombre, [1]primer apellido, [2]segundo apellido, [3]DNI,
                // [4]fecha nacimiento, [5]género, [6]correo, [7]dirección,
                // [8]puerta, [9]idioma nativo, [10]nivel de estudio
                ArrayList<String> alumno = new ArrayList<>();
                // ArrayList para números del alumno
                // [0]teléfono, [1]portal, [2]piso, [3]código postal
                ArrayList<Integer> numerosAlumno = new ArrayList<>();

                System.out.println("Nombre del alumno: ");
                alumno.add(sc.nextLine());

                System.out.println("Primer apellido: ");
                alumno.add(sc.nextLine());

                System.out.println("Segundo apellido: ");
                alumno.add(sc.nextLine());

                System.out.println("DNI/NIE: ");
                alumno.add(sc.nextLine());

                System.out.println("Fecha de nacimiento: ");
                alumno.add(sc.nextLine());

                System.out.println("Género (H/M): ");
                alumno.add(sc.nextLine());

                System.out.println("Dirección de correo electrónico: ");
                alumno.add(sc.nextLine());

                System.out.println("Número de teléfono: ");
                numerosAlumno.add(sc.nextInt());
                sc.nextLine();

                System.out.println("Dirección de domicilio: ");
                alumno.add(sc.nextLine());

                System.out.println("Portal: ");
                numerosAlumno.add(sc.nextInt());

                System.out.println("Piso: ");
                numerosAlumno.add(sc.nextInt());
                sc.nextLine();

                System.out.println("Puerta: ");
                alumno.add(sc.nextLine());

                System.out.println("Código postal: ");
                numerosAlumno.add(sc.nextInt());
                sc.nextLine();

                System.out.println("¿Cuál es tu idioma nativo? ");
                alumno.add(sc.nextLine());

                System.out.println("¿Qué nivel estudiarás? ");
                alumno.add(sc.nextLine());

                System.out.println(" ");
                System.out.print("Su documentación personal es: \n"
                        + "Nombre completo: " + alumno.get(1) + " " + alumno.get(2) + " " + alumno.get(0) + "\n"
                        + "DNI/NIE: " + alumno.get(3) + "\n"
                        + "Fecha de nacimiento: " + alumno.get(4) + "\n"
                        + "Género (H/M): " + alumno.get(5) + "\n"
                        + "Dirección de correo electrónico: " + alumno.get(6) + "\n"
                        + "Número de teléfono: " + numerosAlumno.get(0) + "\n"
                        + "Dirección de domicilio: " + alumno.get(7) + "\n"
                        + "Portal: " + numerosAlumno.get(1) + "\n"
                        + "Piso: " + numerosAlumno.get(2) + "\n"
                        + "Puerta: " + alumno.get(8) + "\n"
                        + "Código Postal: " + numerosAlumno.get(3) + "\n"
                        + "Idioma nativo: " + alumno.get(9) + "\n"
                        + "Nivel de estudio: " + alumno.get(10) + "\n"
                        + "¡Hasta Pronto!\n");
                break;

            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}
