import java.util.Scanner;

public class bajaProfesor {
    Scanner scanner = new Scanner(System.in);

    public void bajaprofesor() 
    {
        // Lista de alumnos actuales
        String[] Profesor = new String[4];
        Profesor[0] = "Samay";
        Profesor[1] = "Cindy";
        Profesor[2] = "Ethan";

        String[] antiguos = new String[Profesor.length];
        // para guardar los dados de baja
        
        // Rellenar el espacio vacío
        for (int i = 0; i < Profesor.length; i++) 
        {
            if (Profesor[i] == null) {
                System.out.print("Ingrese su nombre por favor: ");
                Profesor[i] = scanner.nextLine();
                break; // solo rellenamos un hueco
            }
        }

        System.out.println("profesores actuales:");
        for (int i = 0; i < Profesor.length; i++) 
        {
            if (Profesor[i] != null) {
                System.out.println("- " + Profesor[i]);
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
        System.out.print("Ingrese el nombre del profesor a dar de baja: ");
        String nombre = scanner.nextLine();
        

        boolean encontrado = false;

        // Buscar el profesor y darlo de baja
        for (int i = 0; i < Profesor.length; i++) 
        {
            if (Profesor[i] != null && Profesor[i].equalsIgnoreCase(nombre)) 
            {
                antiguos[i] = Profesor[i]; // mover al historial
                
                Profesor[i] = null;        // eliminar del array principal
                encontrado = true;
                System.out.println(nombre + " fue dado de baja.");
                break;
            }
        }

        if (!encontrado) 
        {
            System.out.println("Profesor no encontrado.");
        }

        // Mostrar resultado final
        System.out.println("Profesores actuales:");
        for (int i = 0; i < Profesor.length; i++) 
        {
            if (Profesor[i] != null) 
            {
                System.out.println("- " + Profesor[i]);
            }
        }

        System.out.println("Antiguos Profesores:");
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
