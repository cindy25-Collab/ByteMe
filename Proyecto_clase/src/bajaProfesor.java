import java.util.Scanner;
import java.util.ArrayList;

public class bajaProfesor {
    Scanner scanner = new Scanner(System.in);

    public void bajaprofesor() 
    {
        // Lista de profesores actuales
        ArrayList<String> Profesor = new ArrayList<>();
        Profesor.add("Samay");
        Profesor.add("Cindy");
        Profesor.add("Ethan");

        // Lista de antiguos profesores (dados de baja)
        ArrayList<String> antiguos = new ArrayList<>();

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

        // Aqui mostramos el resultado final
        System.out.println("Profesores actuales:");
        for (int i = 0; i < Profesor.size(); i++) 
        {
            System.out.println("- " + Profesor.get(i));
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
