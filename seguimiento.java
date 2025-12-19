import java.util.Scanner;
public class seguimiento 
{
	//estamos concluyendo con el seguimiento del alumno que ha tendio o esta teniendo a lo largo del curso
	
 public void seguimiento1 ()
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Si ya estás matriculado, puedes informarte de tus faltas y demas aqui :D \n"
			+ "\n"
			+ "Introduce nombre y apellidos del alumno");

	String alumno= sc.nextLine();
	
	System.out.println("Ha asistido " + alumno + " a clase?");
	String asistencia = sc.nextLine();
	
	System.out.println("¿Ha participado el alumno en las actividades?");
	String participacion = sc.nextLine();
	
    String actividades = "No participó en actividades";

	
	if (participacion.equalsIgnoreCase("si")) {
		System.out.println("¿En que actividades ha participado el alumno?");
		actividades = sc.nextLine();
	} 
	
	System.out.println("¿Cual ha sido el rendimiento del alumno en la evaluacion?");
	String rendimiento = sc.nextLine();
	
	System.out.println("El seguimiento del alumno ha sido realizado \n"
			+ "Alumno: " + alumno + "\n"
					+ "\n"
					+ "Alumno: " + alumno + "\n"
							+ "Asistencia: " + asistencia + "\n"
									+ "Participacion: " + participacion + "\n"
											+ "Actividades: " + actividades + "\n"
													+ "Rendimiento: " + rendimiento);
	sc.close();
}
}
