import java.util.Scanner;

public class registrar_el_alumno 
{

    // Array para guardar la información del alumno
    // [0] = nombre, [1] = edad, [2] = nivelIdioma, [3] = información extra, [4] = contraseña
    String[] datosAlumno = new String[5];

    public void registrar_alumno() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu nombre y apellido: ");
        datosAlumno[0] = sc.nextLine();

        //String.valueOf(edad) convierte un entero (int) en una cadena (String) para poder almacenarlo en el array de texto.
        System.out.print("Escribe tu edad: ");
        int edad = sc.nextInt();
        datosAlumno[1] = String.valueOf(edad);

        // Validamos edad
        while (edad < 16 || edad > 25) 
        {
            System.out.println("La edad no es válida \n"
            		+ "introduce una edad valida (entre 16 y 24");
            edad = sc.nextInt();
        }

        System.out.print("Introduce nivel de idioma: ");
        datosAlumno[2] = sc.nextLine();

        System.out.print("Si tienes más información relevante, indícala: ");
        datosAlumno[3] = sc.nextLine();

        // Dejamos la posición 4 (contraseña) vacía de momento
        datosAlumno[4] = "";

        System.out.println("El alumno ha sido registrado correctamente (sin contraseña por ahora). \n"
        		+ "Resumen del registro: \n"
        		+ "Nombre: " + datosAlumno[0] + "\n"
        				+ "Edad: " + datosAlumno[1] + "\n"
        						+ "Nivel de idioma: " + datosAlumno[2] + "\n"
        								+ "Información relevante: " + datosAlumno[3]);
        
        //Aqui lo que hacemos es lo siguiente: 
        //hacemos eque el usuario introduzca una contraseña.
        //Siempre y cuando esa contraseña este con algun valor, aunque sea minimo
        //se tomara como valida, sin embargo, si acaso esta vacia, se le pedira que la vuelva a introducir.
        System.out.print(" Ahora Introduce una contraseña: ");
        datosAlumno[4] = sc.nextLine();

        boolean contraseñaCorrecta = false;
	    
	    while(!contraseñaCorrecta)
	    {
         if (datosAlumno[4] == null || datosAlumno[4].equals("")) 
        {
            System.out.println(" El alumno aún no tiene una contraseña asignada.");
        } 
         else 
        {
            System.out.println("La contraseña del alumno ha sido registrada correctamente.");
            contraseñaCorrecta = true;
        }
         System.out.println("Por favor, introduce una contraseña");
         datosAlumno[4] = sc.nextLine();
	    }
    }

}
