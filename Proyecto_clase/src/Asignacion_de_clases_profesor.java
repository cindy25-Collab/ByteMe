import java.util.Random;
import java.util.ArrayList;
public class Asignacion_de_clases_profesor 

{
	//el programa esta listo para enviarlo a git hub
	
	public void clase (registrar_profesor profesor)
	{
		
        String maestria2 = profesor.getMaestria2();
        String maestria3 = profesor.getMaestria3();
        String maestria4 = profesor.getMaestria4();

        ArrayList<String> textos = new ArrayList<>();

        textos.add("CURSO DE EUSKERA DE NIVEL PRINCIPIANTE con apoyo de " 
                   + maestria2 + maestria3 + maestria4);

        textos.add("CURSO DE EUSKERA DE NIVEL INTERMEDIO" 
                   + maestria2 + maestria3 + maestria4);

        textos.add("CURSO DE EUSKERA DE NIVEL AVANZADO con apoyo de " 
                   + maestria2 + maestria3 + maestria4);

        Random rand = new Random();
        int azar = rand.nextInt(textos.size()); // 0 1 2

        System.out.println("Usted impartira clases en el: " + textos.get(azar));
    }
}
