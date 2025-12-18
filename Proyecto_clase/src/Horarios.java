import java.util.Scanner;
public class Horarios 
{
	//Este codigo no tiene mucho misterio, estamos asignando un horario al estudiante, o en este vcaso
	//al usuario
	
	public void horario()
	{
	int j, h;
	Scanner sc = new Scanner(System.in);
	System.out.print("Por favor, elige la jornada en la que estudiarás: \n"
			+ "1. Vespertino. \n"
			+ "2. Nocturno. \n");
	j = sc.nextInt();
	
	switch (j)
	{
	case 1:
		System.out.print("Selecciona el horario de tu preferencia: \n"
				+ "1. 13:30 - 15:30 \n"
				+ "2. 15:45 - 17:45 \n");
		h = sc.nextInt();
		switch (h)
		{
		case 1:
			System.out.print("Has seleccionado el horario: 13:30 - 15:30. \n"
					+ "¡Hasta pronto! ^^\\n");
			break;
		case 2:
			System.out.print("Has seleccionado el horario: 15:45 - 17:45. \n"
					+ "¡Hasta pronto! ^^\\n");
			break;
		default:
			System.out.print("El programa ha finalizado. \n"
					+ "¡Hasta pronto! ^^\\n");
			break;
		}
		break;
	case 2:
		System.out.print("Selecciona el horario de tu preferencia: \n"
				+ "1. 18:00 - 20:00 \n"
				+ "2. 20:15 - 21:45 \n");
		h = sc.nextInt();
 	   switch (h)
	   {
	   case 1:
		   System.out.print("Has seleccionado el horario: 18:00 - 20:00. \n"
	               + "¡Hasta pronto! ^^\\n");
		   break;
	   case 2:
		   System.out.print("Has seleccionado el horario: 20:15 - 21:45. \n"
			    	+ "¡Hasta pronto! ^^\n");
		   break;
	   default:
		   System.out.print("El programa ha finalizado. \n"
				   + "¡Hasta pronto! ^^ \n");
		   break;
	   }
 	  break;
 	default:
 		 System.out.print("El programa ha finalizado. \n"
 		 		+ "¡Hasta pronto! ^^ \n");
 		 break;
	}
	
	
}
}

