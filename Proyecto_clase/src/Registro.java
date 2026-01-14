import java.util.Scanner;

public class Registro 
{
    public static void main(String[] args) 
    {
    	Administrador Administrador = new Administrador();
    	Menu_principal Menu_principal = new Menu_principal();
    	Scanner scanner = new Scanner (System.in);
    	
       System.out.println("Buenas tardes, usted, en que bando esta? \n"
       		+ "1 administrador \n"
       		+ "2 usuario\n"
       		+ "3 para salir");
       
       int opcion = scanner.nextInt();
       
       while (opcion < 1 || opcion >3)
       {
    	   System.out.println("Por favor, elija una de las opciones dadas :c");
    	   opcion = scanner.nextInt();
       }
      
       while (opcion >0 && opcion < 3)
       {
       switch (opcion)
       {
       case 1:
    	   Administrador.admin();
    	   break;
       case 2: 
    	   Menu_principal.menu_principal();
    	   break;
       }
       System.out.println("Buenas tardes, usted, en que bando esta? \n"
          		+ "1 administrador \n"
          		+ "2 usuario\n"
          		+ "3 para salir");
          
          opcion = scanner.nextInt();
       }
       
       System.out.println("Gracias por todo, vuelva pronto : D");
     scanner.close();
    }
}
