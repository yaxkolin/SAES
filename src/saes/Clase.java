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
    Alumno alumnospy[]=new Alumno[indice];
    for(int i=0; i<indice;i++){
        alumnospy[i]=alumnos[i];
    }
    return alumnospy;
  }
   

  public String getId() {
  return null;
  }

  public void asignarProfesor(Profesor P) {
      maestro=P;
      P.asignarClase(this);
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
      float suma=0;
      float promedio=0; 
      for(int i=0; i<numdeEvaluaciones;i++){
        suma=evaluaciones[i].getCalif();
	if(evaluaciones[i]==null){
		suma=suma+0;
	}else{
            suma+=+suma;
	}
        }
      promedio=suma/(float)numdeEvaluaciones;
      return promedio;
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