import java.util.Scanner;
import java.util.ArrayList;

public class bajaAlumno {
    Scanner scanner = new Scanner(System.in);

    public void bajaalumno() 
    {
        // Lista de alumnos actuales
        ArrayList<String> Alumno = new ArrayList<>();
        Alumno.add("Samay");
        Alumno.add("Cindy");
        Alumno.add("Ethan");

        // Lista de antiguos alumnos (dados de baja)
        ArrayList<String> antiguos = new ArrayList<>();

        // Rellenar el espacio vacío (misma idea que antes)
        if (Alumno.size() < 4) 
        {
            System.out.print("Ingrese su nombre por favor: ");
            Alumno.add(scanner.nextLine());
        }

        System.out.println("Alumnos actuales:");
        for (int i = 0; i < Alumno.size(); i++) 
        {
            System.out.println("- " + Alumno.get(i));
        }

        System.out.println("¿Estas seguro que quieres darte de baja?\n"
                + "1 si\n"
                + "2 no");
        int decision = scanner.nextInt();
        
        while (decision < 1 || decision > 2)
        {
            System.out.println("Elije bien");
            decision = scanner.nextInt();
        }
        
        switch (decision)
        {
        case 1:
            scanner.nextLine();

            // Pedimos el nombre del alumno que se dará de baja
            System.out.print("Ingrese el nombre del alumno a dar de baja: ");
            String nombre = scanner.nextLine();

            boolean encontrado = false;

            // Buscar el alumno y darlo de baja
            for (int i = 0; i < Alumno.size(); i++) 
            {
                if (Alumno.get(i).equalsIgnoreCase(nombre)) 
                {
                    antiguos.add(Alumno.get(i)); // mover al historial
                    Alumno.remove(i);             // eliminar de la lista
                    encontrado = true;
                    System.out.println(nombre + " fue dado de baja.");
                    break;
                }
            }

            if (!encontrado) 
            {
                System.out.println("Alumno no encontrado.");
            }

            // Mostrar resultado final
            System.out.println("Alumnos actuales:");
            for (int i = 0; i < Alumno.size(); i++) 
            {
                System.out.println("- " + Alumno.get(i));
            }

            System.out.println("Antiguos alumnos:");
            for (int i = 0; i < antiguos.size(); i++) 
            {
                System.out.println(antiguos.get(i));
            }
            break;

        case 2:
            System.out.println("Vuelva pronto");
            break;
        }
    }
}

