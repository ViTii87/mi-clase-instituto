
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private static final int NOTA_MINIMA = 5;
    private static int numAlumnosClase = 0;
    
    private String nombre;
    private int edad;
    private int numClase;
    private ArrayListInt listaNotas;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        numClase = numAlumnosClase;
        numAlumnosClase++;
        listaNotas = new ArrayListInt();
    }

    
}
