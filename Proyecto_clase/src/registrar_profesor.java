import java.util.Scanner;

public class registrar_profesor 
{

    // Array que almacenará todos los datos del profesor
    // [0] maestría1, [1] maestría2, [2] maestría3, [3] maestría4, [4] contraseña
    private String[] datosProfesor = new String[5];

    //Explicar esto es un poco mas complejo,pero es lo siguiente:
    //Estamos privatizando las variables para que solo se puedan usar en esta clase (o archivo dicho de manera informal)
    //Si bien es verdad que es un poco contradicotrio, ya que estas mismas se tienen que usar en otra clase,
    //que sean privadas hace que sea mas sencillo llamarlas de alguna forma
    //desconzco si hay mas formas de llamar a una variable, pero esta es la forma mas "sencilla" que se me hubiera ocurrido.
    
    Scanner scanner = new Scanner(System.in);
    private String maestria1 = "";
    private String maestria2 = "";
    private String maestria3 = "";
    private String maestria4 = "";

    public void profesor()
    {

        Asignacion_de_clases_profesor asignacion = new Asignacion_de_clases_profesor();
        Registro_curso registro = new Registro_curso();

        System.out.println("Buenos días, usted ha decidido aplicar para profesor \n"
                + "Antes debemos hacerle una pequeña prueba \n"
                + "¿Tiene una maestría en EUSKERA?");

        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("si")) 
        {
            maestria1 = "euskera";
            System.out.println("Muy bien, continuemos.");

            System.out.println("¿Tiene alguna otra maestría? \n"
                    + "- INGLÉS \n"
                    + "- ESPAÑOL \n"
                    + "- ALGÚN OTRO \n"
                    + "Al terminar escriba -salir-");

            String maestria = scanner.nextLine();

            while (!maestria.equalsIgnoreCase("salir")) 
            {

                if (maestria.equalsIgnoreCase("ingles")) 
                {
                    maestria2 = " inglés";
                }
                if (maestria.equalsIgnoreCase("español")) 
                {
                    maestria3 = " español";
                }
                if (maestria.equalsIgnoreCase("algún otro"))
                {
                    System.out.println("¿Cuál?");
                    maestria = scanner.nextLine();
                    maestria4 = maestria;
                }

                System.out.println("Puede introducir más de una si desea, sino escriba -salir-");
                maestria = scanner.nextLine();
            }

            System.out.println("Usted tiene maestrías en: " + maestria1 + maestria2 + maestria3 + maestria4 + "\n"
                    + "Usted está calificado para el puesto \n"
                    + "Procederemos a asignarle una clase aleatoriamente.");

            asignacion.clase(this);
            // Guardamos la información en el array
            datosProfesor[0] = maestria1;
            datosProfesor[1] = maestria2;
            datosProfesor[2] = maestria3;
            datosProfesor[3] = maestria4;
            datosProfesor[4] = ""; // hueco para la contraseña
            
            System.out.println("Todo correcto, puede registrarse en nuestro centro. \n"
            		+ "pero anntes, nos debe de proporcionar una contraseña de usuario para usted \n"
            		+ "Cree una contraseña: ");
            
            //Aqui lo que hacemos es lo siguiente: 
            //hacemos eque el usuario introduzca una contraseña.
            //Siempre y cuando esa contraseña este con algun valor, aunque sea minimo
            //se tomara como valida, sin embargo, si acaso esta vacia, se le pedira que la vuelva a introducir.
            datosProfesor[4] = scanner.nextLine();
            boolean contraseñaCorrecta = false;
    	    
    	    while(!contraseñaCorrecta)
    	    {
             if (datosProfesor[4] == null || datosProfesor[4].equals("")) 
            {
                System.out.println(" El profesor aún no tiene una contraseña asignada.");
            } 
             else 
            {
                System.out.println("La contraseña del profesor ha sido registrada correctamente. \n"
                		+ "puede continuar.");
                contraseñaCorrecta = true;
            }
             System.out.println("Por favor, introduce una contraseña");
             datosProfesor[4] = scanner.nextLine();
    	    }
    	    
            registro.registro();

            

        } else {
            System.out.println("Disculpe, usted no es apto para nuestra academia");
        }
    }

//Esto nos sirve para poder tomar las variables en otra clase. Muy importante
    public String getMaestria2() 
    {
        return maestria2;
    }

    public String getMaestria3() 
    {
        return maestria3;
    }

    public String getMaestria4() 
    {
        return maestria4;
    }
}
