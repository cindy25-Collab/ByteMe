import java.util.Scanner;

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
                // Array para guardar los datos del docente
                // [0]nombre, [1]primer apellido, [2]segundo apellido, [3]DNI,
                // [4]fecha nacimiento, [5]género, [6]correo, [7]dirección,
                // [8]puerta, [9]código identificación, [10]idioma especialización, [11]nivel
                String[] docente = new String[12];
                int[] numerosDocente = new int[4]; // [0]teléfono, [1]portal, [2]piso, [3]código postal

                System.out.println("Nombre del docente: ");
                docente[0] = sc.nextLine();

                System.out.println("Primer apellido: ");
                docente[1] = sc.nextLine();

                System.out.println("Segundo apellido: ");
                docente[2] = sc.nextLine();

                System.out.println("DNI/NIE: ");
                docente[3] = sc.nextLine();

                System.out.println("Fecha de nacimiento: ");
                docente[4] = sc.nextLine();

                System.out.println("Género (H/M): ");
                docente[5] = sc.nextLine();

                System.out.println("Dirección de correo electrónico: ");
                docente[6] = sc.nextLine();

                System.out.println("Número de teléfono: ");
                numerosDocente[0] = sc.nextInt();
                sc.nextLine();

                System.out.println("Dirección de domicilio: ");
                docente[7] = sc.nextLine();

                System.out.println("Portal: ");
                numerosDocente[1] = sc.nextInt();

                System.out.println("Piso: ");
                numerosDocente[2] = sc.nextInt();
                sc.nextLine();

                System.out.println("Puerta: ");
                docente[8] = sc.nextLine();

                System.out.println("Código postal: ");
                numerosDocente[3] = sc.nextInt();
                sc.nextLine();

                System.out.println("Ingresa tu código de identificación: ");
                docente[9] = sc.nextLine();

                System.out.println("¿Cuál es tu idioma de especialización? ");
                docente[10] = sc.nextLine();

                System.out.println("¿Qué nivel de " + docente[10] + " tienes asignado?");
                docente[11] = sc.nextLine();

                System.out.println(" ");
                System.out.print("Su documentación personal es: \n"
                        + "Nombre completo: " + docente[1] + " " + docente[2] + " " + docente[0] + "\n"
                        + "DNI/NIE: " + docente[3] + "\n"
                        + "Fecha de nacimiento: " + docente[4] + "\n"
                        + "Género (H/M): " + docente[5] + "\n"
                        + "Dirección de correo electrónico: " + docente[6] + "\n"
                        + "Número de teléfono: " + numerosDocente[0] + "\n"
                        + "Dirección de domicilio: " + docente[7] + "\n"
                        + "Portal: " + numerosDocente[1] + "\n"
                        + "Piso: " + numerosDocente[2] + "\n"
                        + "Puerta: " + docente[8] + "\n"
                        + "Código Postal: " + numerosDocente[3] + "\n"
                        + "Código de identificación: " + docente[9] + "\n"
                        + "Idioma de especialización: " + docente[10] + "\n"
                        + "Nivel de " + docente[10] + " asignado: " + docente[11] + "\n"
                        + "¡Hasta Pronto!");
                break;

            case 2:
                // Array para guardar los datos del alumno
                // [0]nombre, [1]primer apellido, [2]segundo apellido, [3]DNI,
                // [4]fecha nacimiento, [5]género, [6]correo, [7]dirección,
                // [8]puerta, [9]idioma nativo, [10]nivel de estudio
                String[] alumno = new String[11];
                int[] numerosAlumno = new int[4]; // [0]teléfono, [1]portal, [2]piso, [3]código postal

                System.out.println("Nombre del alumno: ");
                alumno[0] = sc.nextLine();

                System.out.println("Primer apellido: ");
                alumno[1] = sc.nextLine();

                System.out.println("Segundo apellido: ");
                alumno[2] = sc.nextLine();

                System.out.println("DNI/NIE: ");
                alumno[3] = sc.nextLine();

                System.out.println("Fecha de nacimiento: ");
                alumno[4] = sc.nextLine();

                System.out.println("Género (H/M): ");
                alumno[5] = sc.nextLine();

                System.out.println("Dirección de correo electrónico: ");
                alumno[6] = sc.nextLine();

                System.out.println("Número de teléfono: ");
                numerosAlumno[0] = sc.nextInt();
                sc.nextLine();

                System.out.println("Dirección de domicilio: ");
                alumno[7] = sc.nextLine();

                System.out.println("Portal: ");
                numerosAlumno[1] = sc.nextInt();

                System.out.println("Piso: ");
                numerosAlumno[2] = sc.nextInt();
                sc.nextLine();

                System.out.println("Puerta: ");
                alumno[8] = sc.nextLine();

                System.out.println("Código postal: ");
                numerosAlumno[3] = sc.nextInt();
                sc.nextLine();

                System.out.println("¿Cuál es tu idioma nativo? ");
                alumno[9] = sc.nextLine();

                System.out.println("¿Qué nivel estudiarás? ");
                alumno[10] = sc.nextLine();

                System.out.println(" ");
                System.out.print("Su documentación personal es: \n"
                        + "Nombre completo: " + alumno[1] + " " + alumno[2] + " " + alumno[0] + "\n"
                        + "DNI/NIE: " + alumno[3] + "\n"
                        + "Fecha de nacimiento: " + alumno[4] + "\n"
                        + "Género (H/M): " + alumno[5] + "\n"
                        + "Dirección de correo electrónico: " + alumno[6] + "\n"
                        + "Número de teléfono: " + numerosAlumno[0] + "\n"
                        + "Dirección de domicilio: " + alumno[7] + "\n"
                        + "Portal: " + numerosAlumno[1] + "\n"
                        + "Piso: " + numerosAlumno[2] + "\n"
                        + "Puerta: " + alumno[8] + "\n"
                        + "Código Postal: " + numerosAlumno[3] + "\n"
                        + "Idioma nativo: " + alumno[9] + "\n"
                        + "Nivel de estudio: " + alumno[10] + "\n"
                        + "¡Hasta Pronto!\n");
                break;

            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}

