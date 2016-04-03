import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    private String[] nombres;
    private ArrayList<Alumno> listaAlumnos;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        nombres = new String[5];
        listaAlumnos = new ArrayList<>();
        nombres[0] = "Victor";
        nombres[1] = "Pepe";
        nombres[2] = "David";
        nombres[3] = "Maria";
        nombres[4] = "Claudia";
        generaAlum(nombres.length);
        Collections.shuffle(listaAlumnos);
        for(Alumno lista: listaAlumnos){
            lista.imprimeDatos();
        }
    }

    /**
     * Metodo que general 5 alumnos con edades, y notas aleatorios
     */
    public void generaAlum(int alumnos)
    {
        Random rnd = new Random();
        for(int a = 0; a < alumnos; a++)
        {
            String nombre = nombres[a];
            int edad = rnd.nextInt(10) + 18;
            Alumno alum = new Alumno(nombre, edad);
            int numNotas = rnd.nextInt(6) + 2;
            for(int i = 0; i < numNotas; i++)
            {
                alum.añadirNota(rnd.nextInt(11));
            }
            listaAlumnos.add(alum);
        }
    }
}