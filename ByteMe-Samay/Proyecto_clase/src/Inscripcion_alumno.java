import java.util.Scanner;

public class Inscripcion_alumno 
{
	Scanner scanner = new Scanner (System.in);
	
//En este codido estamos haciendo una pequeña prubea al estudante(usuario) para
	//poder ver su nivel en el idioma del euskera
	//y a su vez saber cual es su idioma materno
	
	public void decision()
	{
		Horarios horarios = new Horarios();
		registrar_el_alumno registrar_el_alumno = new registrar_el_alumno();
		
		System.out.println("Antes de seguir, nos encantaría saber a que horario le gustaría formar parte");
		
		horarios.horario();
		
		String idioma = "";
		String nivel_euskera = "";
		String respuesta = "";
		
		System.out.println("Muy bien, Cual es su idioma nativo? \n"
				+ "- INGLES \n"
				+ "- ESPAÑOL \n"
				+ "- EUSKERA \n"
				+ "- ALGUN OTRO");
				
		String decision = scanner.nextLine();
		
		if (decision.equalsIgnoreCase("ingles")||decision.equalsIgnoreCase("español") )
		{
			idioma = decision;
			
			System.out.println("Bien, su idioma nativo es " + idioma);
			
			System.out.println("Ahora le haremos una pequeña prueba paa saber su nivel de Euskera \n"
					+ "Por favor, responda las siguientes preguntas \n"
					+ "Esta palabra esta en euskera? \n"
					+ "-BAI");
			
			boolean entradaCorrecta = false;
			
			while (!entradaCorrecta) 
			{
				respuesta = scanner.nextLine();
		            
				if (respuesta.matches("[a-zA-Z]+")) 
				{
				    entradaCorrecta = true;
				} 
				else 
				{
				    System.out.println("por favor, responda la pregunta correctamente");
				}
		    }
			
			if (respuesta.equalsIgnoreCase("si"))
			{
				System.out.println("usted tiene nivel intermedio de Euskera");
				nivel_euskera = "intermedio";
				
				System.out.println("siguiente pregunta \n"
						+ "Que significa esta palabra? \n"
						+ "-EZ");
				
				entradaCorrecta = false;
				
				while (!entradaCorrecta) 
				{
					respuesta = scanner.nextLine();
			            
					if (respuesta.matches("[a-zA-Z]+")) 
					{
					    entradaCorrecta = true;
					} 
					else 
					{
					    System.out.println("por favor, responda la pregunta correctamente");
					}
			    }
				
				if (respuesta.equalsIgnoreCase("no"))
				{
					nivel_euskera = "avanzado";
					System.out.println("Su idioma nativo es " + idioma + " y su nivel de euskera es " + nivel_euskera);
				}
				else
				{
					System.out.println("Su idioma nativo es " + idioma + " y su nivel de euskera es " + nivel_euskera);
				}
			}
			else 
			{
				nivel_euskera = "principiante";
				System.out.println("Su idioma nativo es " + idioma + " y su nivel de euskera es " + nivel_euskera);
			}
		}
		else if (decision.equalsIgnoreCase("euskera"))
		{
			idioma = decision;
			
			nivel_euskera = "avanzado";
			
			System.out.println("Bien, su idioma nativo es " + idioma + "\n"
					+ "Le pondremos en la clase avanzada de Euskera \n "
					+ "Usted es nativo de " + idioma + " y su nivel de euskera es " + nivel_euskera);
			
			nivel_euskera = "avanzado";
		}
		else if (decision.equalsIgnoreCase("algun otro"))
		{
			System.out.println("cual?");
			
			decision = scanner.nextLine();
			
			idioma = decision;
			
			System.out.println("Bien, su idioma nativo es " + idioma);
			
			System.out.println("Ahora le haremos una pequeña prueba paa saber su nivel de Euskera \n"
					+ "Por favor, responda las siguientes preguntas \n"
					+ "Esta palabra esta en euskera? \n"
					+ "-BAI");
			
			boolean entradaCorrecta = false;
			
			while (!entradaCorrecta) 
			{
				respuesta = scanner.nextLine();
		            
				if (respuesta.matches("[a-zA-Z]+")) 
				{
				    entradaCorrecta = true;
				} 
				else 
				{
				    System.out.println("por favor, responda la pregunta correctamente");
				}
		    }
			
			if (respuesta.equalsIgnoreCase("si"))
			{
				System.out.println("usted tiene nivel intermedio de Euskera");
				nivel_euskera = "intermedio";
				
				System.out.println("siguiente pregunta \n"
						+ "Que significa esta palabra? \n"
						+ "-EZ");
				
				entradaCorrecta = false;
				
				while (!entradaCorrecta) 
				{
					respuesta = scanner.nextLine();
			            
					if (respuesta.matches("[a-zA-Z]+")) 
					{
					    entradaCorrecta = true;
					} 
					else 
					{
					    System.out.println("por favor, responda la pregunta correctamente");
					}
			    }
				
				if (respuesta.equalsIgnoreCase("no"))
				{
					System.out.println("usted tiene nivel avanzado de Euskera");
					nivel_euskera = "avanzado";
					System.out.println("Su idioma nativo es " + idioma + " y su nivel de euskera es " + nivel_euskera);
				}
				else
				{
					System.out.println("Su nivel de euskera es " + nivel_euskera + " y Su idioma nativo es " + idioma);
				}
			}
			else 
			{
				nivel_euskera = "principiante";
				System.out.println("Su idioma nativo es " + idioma + " y su nivel de euskera es " + nivel_euskera+"\n");
			}
			
		}
		
		System.out.println("Enseguida le tomamos los datos para registrarse");
		registrar_el_alumno.registrar_alumno();
	}

}
