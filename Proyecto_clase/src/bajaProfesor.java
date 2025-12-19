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

        // Rellenar el espacio
        if (Profesor.size() < 4) 
        {
            System.out.print("Ingrese su nombre por favor: ");
            Profesor.add(scanner.nextLine());
        }

        System.out.println("Profesores actuales:");
        for (int i = 0; i < Profesor.size(); i++) 
        {
            System.out.println("- " + Profesor.get(i));
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

            // Pedimos el nombre del profesor que se dará de baja
            System.out.print("Ingrese el nombre del profesor a dar de baja: ");
            String nombre = scanner.nextLine();

            boolean encontrado = false;

            // Buscar el profesor y darlo de baja
            for (int i = 0; i < Profesor.size(); i++) 
            {
                if (Profesor.get(i).equalsIgnoreCase(nombre)) 
                {
                    antiguos.add(Profesor.get(i)); // mover al historial
                    Profesor.remove(i);             // eliminar de la lista
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

            System.out.println("Antiguos profesores:");
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
