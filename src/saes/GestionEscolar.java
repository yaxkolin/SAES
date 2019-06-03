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
  return null;
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
  
  public Alumno getAlumno(int B){
    Alumno Alumno1 = null;
    Vector Alum = alumnos;
    for(int j = 0; j < Alum.size(); j++){
      Alumno1 = (Alumno) Alum.get(j);
      if(Alumno1.getBoleta() == B){
          break;
      }
    }
      return Alumno1;
  }
  
  public Clase getClase(String ID){
      Clase Clase1 = null;
      Vector clas = clases;
      for(int j = 0; j < clas.size(); j++){
      Clase1 = (Clase) clas.get(j);
      if(Clase1.getId().equals(ID)){
          break;
      }
    }
      return Clase1;
  }
}