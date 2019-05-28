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
  return null;
  }

  public void asignarProfesor(Profesor P) {
  }

  public boolean inscribirAlumno(Alumno A) {
  return false;
  }

  public UnidadAprendizaje getUnidadAprendizaje() {
  return materia;
  }

  public Profesor getProfesor() {
  return maestro;
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
      materia = U;
  }

}