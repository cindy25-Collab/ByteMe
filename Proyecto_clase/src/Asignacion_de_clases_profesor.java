import java.util.Random;

public class Asignacion_de_clases_profesor 
{
	//El siguiente codigo nos ayuda a asiganr de manera aleatoria una clase a un profesor.
	//Para ello usamos las variables que privatizamos en la clase anterior
	
	public void clase (registrar_profesor profesor)
	{
		
        String maestria2 = profesor.getMaestria2();
        String maestria3 = profesor.getMaestria3();
        String maestria4 = profesor.getMaestria4();

        String[] textos = new String[3];
        textos[0] = "CURSO DE EUSKERA DE NIVEL PRINCIPIANTE con apoyo de " + maestria2 + maestria3 + maestria4;
        textos[1] = "CURSO DE EUSKERA DE NIVEL INTERMEDIO"  + maestria2 + maestria3 + maestria4;
        textos[2] = "CURSO DE EUSKERA DE NIVEL AVANZADO con apoyo de "  + maestria2 + maestria3 + maestria4;

        Random rand = new Random();
        int azar = rand.nextInt(3); // 0 1  2

        System.out.println("Usted impartira clases en el: " + textos[azar]);
    }
}

