import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu_principal 
{

	//Esto de aqui tiene que ser un public void para que este conectado con todo al final con registro.
	public void menu_principal()
	
	{
		// aqui estamos llamando a los archivos para poder usarlos en este main (dicho formalmente, 
		//Instanciamos las clases correspondientes para poder utilizar sus métodos y funcionalidades en este programa principal.)
		bajaAlumno bajaAlumno = new bajaAlumno();
		bajaProfesor bajaProfesor = new bajaProfesor();
		Inscripcion_alumno inscripcion_alumno = new Inscripcion_alumno();
		registrar_profesor registrar_profesor = new registrar_profesor();
		seguimiento seguimiento1= new seguimiento();
		
		Scanner scanner = new Scanner (System.in);
		
		int opciones = 0;
		    
		
	    System.out.println("1- Inscribirse a nuestro curso (profesor o alumno) \n"
	    		+ "2- seguimineto del alumno \n"
	    		+ "3- Mas informacion \n"
	    		+ "4. Coste de los cursos \n"
	    		+ "5- Reseñas \n"
	    		+ "6- dar de BAJA \n"
	    		+ "7- Si desea terminar \n"
	    		+ "Recuerde que debe introducir una de las opciones dadas");
	    
	    
	    //El siguiente codigo a comentar es uno importante. Su principal funcion es
	    //captar cuando el usuario ha medito un valor diferente al asignado a la variable
	    //que deberia de meter en pirncipio. En ese caso, se le soltara un aviso y se le pedira
	    //que vuelva a meter el valor correcto.
	    
	    boolean entradaCorrecta = false;
	    
	    while(!entradaCorrecta)
	    {
	    	try
	    	{
	    		opciones = scanner.nextInt();
	    		entradaCorrecta = true;
	    	}
	    	catch (InputMismatchException e)
	    	{
	    		System.out.println("Por favor, introdusca uno de los valores dados");
	    		scanner.nextLine();
	    	}
	    }
	    
	    
	    //Gracias a este while nos encargamos de que el usuario introduzca una de las opciones dadas
	    //con esto, nos aseguramos que se entre en el bucle si o si
	    
	    while (opciones <1 || opciones > 7)
	    {
	    	System.out.println("Por favor, introduzca una de las opciones dadas.");
	    	opciones = scanner.nextInt();
	    }
	 
	    //Este while nos ayuda a permanecer en un bucle siempre y cuando introduzcamos un valor que este
	    //dentro del intervalo pedido por nosotros 
	    
 while (opciones >0 && opciones <7)
 {
	 
	 //Este switch es el corazon de este programa, gracias a este podemos conectar todas las demas clases
	 //a su vez, dentro de estas mismas clases instancian otras clases y asi usan sus metodos y funcionalidades
	 //ES COMO EL EFECTO DOMINO!!!
	 
	    switch (opciones)
	    {
	    case 1:
	    	scanner.nextLine();
	    	System.out.println("Usted aplica para -alumno- o -profesor-?");
	    	
	    	String respuesta = scanner.nextLine();
	    	
	    	if (respuesta.equalsIgnoreCase("alumno"))
	    	{
	    		inscripcion_alumno.decision();
	    	}
	    	else if (respuesta.equalsIgnoreCase("profesor"))
	    	{
	    		registrar_profesor.profesor();
	    	}
	    	
	    	break;
	    case 2:
	    	
	    	seguimiento1.seguimiento1();
	    	break;
	    	
	    case 3:
	    	
	    	System.out.println("En esta prestigiosa academia se imparte, como idioma principal, el Euskera \n"
	    			+ "Sin embargo, eso no quita que nuestro gran profesorado no tenga mas titulos ademas de este \n"
	    			+ "esto quiere decir, que independientemente de tu idioma de origen, puede haber un profesor \n"
	    			+ "que te pueda ayudar entendiendote y enseñandote al mismo tiempo \n"
	    			+ "No lo pienses mas, APUNTATE!!!");
	    	
	    	break;
	    case 4:
	    	System.out.println("El coste de los cursos varian dependiendo del nivel en el que te encuentres, por ejemplo: \n"
	    			+ "NIVEL PRINCIPIANTE: 100$ el mes por dos clases de hora y media a la semana \n"
	    			+ "NIVEL INTERMEDIO: 120$ el mes por dos clases de hora y media a la semana \n"
	    			+ "NIVEL AVANZADO: 150$ el mes por dos clases de hora y media a la semana");

	    	break;
	    case 5:
	    	
	    	System.out.println("Lucía G \n"
	    			+ "Los profesores explican muy bien. Me ayudaron a mejorar en poco tiempo. \n"
	    			+ "Carlos M \n"
	    			+ "Buen ambiente y clases dinámicas. Muy recomendable. \n"
	    			+ "Andrea R \n"
	    			+ "El curso fue claro y completo. Volvería a apuntarme sin duda. \n"
	    			+ "Javier T. \n"
	    			+ "Horarios flexibles y atención personalizada. Una gran experiencia. \n"
	    			+ "Sofía D \n"
	    			+ "Me encantó la metodología. Aprendí más de lo que esperaba.");
	  
	    	break;
	    
	    case 6:
	    	System.out.println("Que funcion cumple usted? \n"
	    			+ "1 alumno \n"
	    			+ "2 profesor");
	    	int funcion = scanner.nextInt();
	    	while (funcion <1 || funcion > 2)
	    	{
	    		System.out.println("Vuelva a intentarlo");
	    		funcion = scanner.nextInt();
	    	}
	    	 if (funcion == 1)
	    	 {
	    		 bajaAlumno.bajaalumno();
	    	 }
	    	 else if (funcion == 2)
	    	 {
	    		 bajaProfesor.bajaprofesor();
	    	 }
	    	break;
	    }
	   
	    
	 //Tras estar en uno de los casos del switch, se sale directamente y gracias al while, tenemos la oportunidad
	    //de volver a entrar en otra opcion
	    
	    System.out.println("1- Inscribirse a nuestro curso (profesor o alumno) \n"
	    		+ "2- seguimineto del alumno \n"
	    		+ "3- Mas informacion \n"
	    		+ "4. Coste de los cursos \n"
	    		+ "5- Reseñas \n"
	    		+ "6- Si desea terminar \n"
	    		+ "Recuerde que debe introducir una de las opciones dadas");
	    
	    entradaCorrecta = false;
	    
	    while(!entradaCorrecta)
	    {
	    	try
	    	{
	    		opciones = scanner.nextInt();
	    		entradaCorrecta = true;
	    	}
	    	catch (InputMismatchException e)
	    	{
	    		System.out.println("Por favor, introdusca uno de los valores dados");
	    		scanner.nextLine();
	    	}
	    }
	    
   }
 System.out.println("Muchas gracias por visitarnos, vuelva pronto :D");
 scanner.close();
  }

}
