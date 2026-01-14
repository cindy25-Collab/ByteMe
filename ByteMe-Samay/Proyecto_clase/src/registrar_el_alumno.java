import java.util.Scanner;
import java.util.ArrayList;

public class registrar_el_alumno 
{
    private ArrayList<String> datosAlumno = new ArrayList<>();

    public String getNombre() 
    {
        return datosAlumno.get(0);
    }

    public String getEdad() 
    {
        return datosAlumno.get(1);
    }

    public String getNivelIdioma() 
    {
        return datosAlumno.get(2);
    }

    public String getInformacionExtra() 
    {
        return datosAlumno.get(3);
    }

    public String getContraseña() 
    {
        return datosAlumno.get(4);
    }

    public void setNombre(String nombre) 
    {
        datosAlumno.set(0, nombre);
    }

    public void setEdad(String edad) 
    {
        datosAlumno.set(1, edad);
    }

    public void setNivelIdioma(String nivel) 
    {
        datosAlumno.set(2, nivel);
    }

    public void setInformacionExtra(String info) 
    {
        datosAlumno.set(3, info);
    }

    public void setContraseña(String contraseña) 
    {
        datosAlumno.set(4, contraseña);
    }

    public void registrar_alumno() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu nombre y apellido: ");
        datosAlumno.add(sc.nextLine()); // posición 0

        System.out.print("Escribe tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        datosAlumno.add(String.valueOf(edad)); // posición 1

        // Validamos edad
        while (edad < 16 || edad > 25) 
        {
            System.out.println("La edad no es válida \n"
            		+ "introduce una edad valida (entre 16 y 24)");
            edad = sc.nextInt();
            sc.nextLine(); // limpiar buffer
            datosAlumno.set(1, String.valueOf(edad));
        }

        System.out.print("Introduce nivel de idioma: ");
        datosAlumno.add(sc.nextLine()); // posición 2

        System.out.print("Si tienes más información relevante, indícala: ");
        datosAlumno.add(sc.nextLine()); // posición 3

        // Dejamos la posición 4 (contraseña) vacía de momento
        datosAlumno.add(""); // posición 4

        System.out.println("El alumno ha sido registrado correctamente (sin contraseña por ahora). \n"
        		+ "Resumen del registro: \n"
        		+ "Nombre: " + getNombre() + "\n"
        		+ "Edad: " + getEdad() + "\n"
        		+ "Nivel de idioma: " + getNivelIdioma() + "\n"
        		+ "Información relevante: " + getInformacionExtra());
        
        // Introducir contraseña
        System.out.print(" Ahora Introduce una contraseña: ");
        datosAlumno.set(4, sc.nextLine());

        boolean contraseñaCorrecta = false;
	    
	    while(!contraseñaCorrecta)
	    {
            if (getContraseña() == null || getContraseña().equals("")) 
            {
                System.out.println(" El alumno aún no tiene una contraseña asignada.");
                System.out.print("Por favor introduce una contraseña: ");
                setContraseña(sc.nextLine());
            } 
            else 
            {
                System.out.println("La contraseña del alumno ha sido registrada correctamente.");
                contraseñaCorrecta = true;
            }
	    }
	    sc.close();
    }
}

