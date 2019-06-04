package saes;

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
  return false;
  }

  public boolean setEvaluacion(Alumno A, byte C) {
  return false;
  }

  public Alumno [] getAlumnosInscritos() {
    return null;
  }

  public String getId() {
  return id;
  }

  public void asignarProfesor(Profesor P) {
  }

  public boolean inscribirAlumno(Alumno A)
  {
      if(!(estaInscrito(A)) && indice<cupo)
	  {
		  alumnos[indice++]=A;
                
		  return true;
	  }
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