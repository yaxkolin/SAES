package saes;

import static java.lang.reflect.Array.get;
import java.util.Vector;

public class Clase {

  private String id;
  
  private int cupo;

  private int indice;

  private int numdeEvaluaciones;

    private GestionEscolar gestion;
    private Profesor maestro;
    private UnidadAprendizaje materia;
    private Alumno [] alumnos;
    private Evaluacion []  evaluaciones;

  public boolean estaInscrito(Alumno A) {
      for(int i=0;i<indice;i++){
          if(alumnos [i].getBoleta() ==A.getBoleta()){
              return true;
          }
          else 
              return false;
      }
  return false;
  }

  public boolean setEvaluacion(Alumno A, byte C) {
         
      int aux=0;
          if(tieneEvaluacion(A)){
           return false;
          }
          else{
              for(int i=0; i<indice;i++)
                  {
                      if(A.getBoleta()==alumnos[i].getBoleta()){
                          
                          aux=i;
                          
                         
                           break;
                      }
              }
              evaluaciones[aux]=new Evaluacion(A.getBoleta(),C,"Evaluo: ");
          }
  
  return false;
  }

  public Alumno [] getAlumnosInscritos() {
    return null;
  }

  public String getId() {
  return null;
  }

  public void asignarProfesor(Profesor P) {
  }

  public boolean inscribirAlumno(Alumno A) {
  return false;
  }

  public UnidadAprendizaje getUnidadAprendizaje() {
  return null;
  }

  public Profesor getProfesor() {
  return null;
  }

  public boolean tieneEvaluacion(Alumno A) {
  return false;
  }

  public float calcularPromedio() {
  return 0.0F;
  }

  public int getNumEvaluaciones() {
  return 0;
  }

  public Clase(int C, String ID) {
  }

  public void setUnidadAprendizaje(UnidadAprendizaje U) {
  }

}