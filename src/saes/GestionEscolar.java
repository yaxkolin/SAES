package saes;

import java.util.Vector;

public class GestionEscolar {

  private String id;

    /**
   * 
   * @element-type Alumno
   */
  private Vector  alumnos;
    /**
   * 
   * @element-type Profesor
   */
  private Vector  maestros;
    /**
   * 
   * @element-type UnidadAprendizaje
   */
  private Vector  unidades;
    /**
   * 
   * @element-type Clase
   */
  private Vector  clases;

  public Alumno [] getAlumnos() {
    return null;
  }

  public Profesor [] getProfesores() {
     return null;
  }

  public Alumno darDeAltaAlumno(String N, int B) {
    Alumno juan=new Alumno(N,B);
    alumnos.add(juan);
  return juan;
  }

  public Profesor darDeAltaProfesor(String N, int NT) {
  return null;
  }

  public Clase darDeAltaClase(int C, String ID) {
  return null;
  }

  public UnidadAprendizaje darDeAltaUnidad(String n, int ID) {
  return null;
  }

  public GestionEscolar(String ID) {
  }

}