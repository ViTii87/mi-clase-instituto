
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private static final int NOTA_MINIMA = 5;
    private static int numAlumnosClase = 1;
    
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

    /**
     * Metodo que añadira una nota al alumno
     */
    public void añadirNota(int nota){
        listaNotas.add(nota);
    }
    
    /**
     * Metodo que calcula la media del alumno
     */
    public float calculaMedia(){
        int totalNotas = 0;
        int numNotas = listaNotas.size();
        for(int i = 0; i < numNotas; i++){
            totalNotas += listaNotas.get(i);
        }
        if(numNotas == 0){
            numNotas = 1;
        }
        return (float)totalNotas/numNotas;
    }
    
    /**
     * Metodo que nos devolvera true si el alumnos ha aprobado
     */
    public boolean estaAprobado(){
        return calculaMedia() >= NOTA_MINIMA;
    }
    
    /**
     * Metodo que imprimira por pantalla los datos del alumno.
     */
    public void imprimeDatos(){
        System.out.printf( "Nombre: " + nombre + "\nEdad: " + edad + "\nNumero de Clase: " + numClase 
        + "\nNotas: ");
        if(listaNotas.size() != 0){
            for(int i = 0; i < listaNotas.size(); i++){
                System.out.printf(listaNotas.get(i) + "  ");
            }
        }
        else{
            System.out.printf("Ninguna");
        }
        System.out.printf("\nNotaMedia: " + calculaMedia() + "\nAprobado: " + estaAprobado());
    }
}
