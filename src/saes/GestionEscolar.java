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
    return (Alumno[]) alumnos.toArray();
      
  }

  public Profesor [] getProfesores() {
     
      return (Profesor[]) maestros.toArray();
  }

  public Alumno darDeAltaAlumno(String N, int B) {
  return null;
  }

  public Profesor darDeAltaProfesor(String N, int NT) {
  return null;
  }

  public Clase darDeAltaClase(int C, String ID) {
      Clase clase1=new Clase(C,ID);
      clases.add(clase1);
      return clase1;
  }

  public UnidadAprendizaje darDeAltaUnidad(String n, int ID) {
  return null;
  }

  public GestionEscolar(String ID) {
  }

}