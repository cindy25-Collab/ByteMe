import java.util.Scanner;

public class bajaAlumno {
    Scanner scanner = new Scanner(System.in);

    public void bajaalumno() 
    {
        // Lista de alumnos actuales
        String[] Alumno = new String[4];
        Alumno[0] = "Samay";
        Alumno[1] = "Cindy";
        Alumno[2] = "Ethan";

        String[] antiguos = new String[Alumno.length];
        // para guardar los dados de baja
        
        // Rellenar el espacio vacío
        for (int i = 0; i < Alumno.length; i++) 
        {
            if (Alumno[i] == null) {
                System.out.print("Ingrese su nombre por favor: ");
                Alumno[i] = scanner.nextLine();
                break; // solo rellenamos un hueco
            }
        }

        System.out.println("Alumnos actuales:");
        for (int i = 0; i < Alumno.length; i++) 
        {
            if (Alumno[i] != null) {
                System.out.println("- " + Alumno[i]);
            }
        }

        System.out.println("¿Estas seguro que quieres darte de baja?\n"
        		+ "1 si\n"
        		+ "2 no");
        int decision = scanner.nextInt();
        
        while (decision <1 || decision > 2)
        {
        	System.out.println("Elije bien");
        	decision = scanner.nextInt();
        }
        
        switch (decision)
        {
        case 1:
        
        	scanner.nextLine();
        // Ahora pedimos el nombre del alumno que se dará de baja
        System.out.print("Ingrese el nombre del alumno a dar de baja: ");
        String nombre = scanner.nextLine();
        

        boolean encontrado = false;

        // Buscar el alumno y darlo de baja
        for (int i = 0; i < Alumno.length; i++) 
        {
            if (Alumno[i] != null && Alumno[i].equalsIgnoreCase(nombre)) 
            {
                antiguos[i] = Alumno[i]; // mover al historial
                
                Alumno[i] = null;        // eliminar del array principal
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
        for (int i = 0; i < Alumno.length; i++) 
        {
            if (Alumno[i] != null) 
            {
                System.out.println("- " + Alumno[i]);
            }
        }

        System.out.println("Antiguos alumnos:");
        for (int i = 0; i < antiguos.length; i++) 
        {
            if (antiguos[i] != null) 
            {
                System.out.println(antiguos[i]);
            }
        }
       break; 
        case 2:
        	System.out.println("Vuelva pronto");
        	break;
    }
    }
}
