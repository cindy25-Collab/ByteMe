import java.util.Scanner;

public class Administrador 
{
	Scanner scanner = new Scanner (System.in);
	public void admin()
	{
		System.out.println("Usted esta en el menu del ADMINISTRADOR\n"
				+ "Que desea ejecutar? \n"
				+ "1 Crear un nuevo usuario \n"
				+ "2 introducir informacion relevante \n" //creo que esto es lo que entiendo del concepto "leer"
				//q	ue se esta leyendo informacion, es decir, introducciendo mas infrmacion o algo asi.
				+ "3 Actualizar la base de datos \n"
				+ "4 Borrar algun dato o usuario\n"
				+ "5 salir");
		
		//hola mundo
		
		int opciones = scanner.nextInt();
		
		while (opciones < 1 || opciones > 5)
		{
			System.out.println("Introduzca una de las opciones dadas");
			opciones = scanner.nextInt();
		}
	
		while (opciones > 0 && opciones < 5)
		{
		switch (opciones)
		{
		case 1:
			System.out.println("Usted a añadido un nuevo usuario");
			break;
		case 2:
			System.out.println("Usted a añadido nueva informacion");
			break;
		case 3:
			System.out.println("Usted a actualizado la base de datos");
			break;
		case 4:
			System.out.println("Usted a borrado a un usuario");
			break;
		}
		System.out.println("Usted esta en el menu del ADMINISTRADOR\n"
				+ "Que desea ejecutar? \n"
				+ "1 Crear un nuevo usuario \n"
				+ "2 introducir informacion relevante \n" //creo que esto es lo que entiendo del concepto "leer"
				//q	ue se esta leyendo informacion, es decir, introducciendo mas infrmacion o algo asi.
				+ "3 Actualizar la base de datos \n"
				+ "4 Borrar algun dato o usuario\n"
				+ "5 salir");
		
		opciones = scanner.nextInt();
		}
		System.out.println("Gracias, vuelva pronto :D");
	}

}
