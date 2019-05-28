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
  return null;
  }

  public Profesor getProfesor() {
  return null;
  }

  public boolean tieneEvaluacion(Alumno A) {
      int aux=0;
      boolean bandera=false;
      for(int i=0;i<alumnos.length;i++){
          if(A.getNombre().equals(alumnos[i].getNombre())){
              if(evaluaciones[i]!=null){
                  bandera=true;
              }else{
                  bandera=false;
              }
              break;
          }
      }
      
  return bandera;
  }

  public float calcularPromedio() {
  return 0.0F;
  }

  public int getNumEvaluaciones() {
      return numdeEvaluaciones;
  }

  public Clase(int C, String ID) {
      cupo=C;
      id=ID;
      numdeEvaluaciones=0;
      indice=0;
      alumnos=new Alumno[C];
      evaluaciones=new Evaluacion[C];
  }

  public void setUnidadAprendizaje(UnidadAprendizaje U) {
  }

}