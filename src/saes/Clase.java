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
      }
  return false;
  }

  public boolean setEvaluacion(Alumno A, byte C) {
         
      int aux=0;
          if(!estaInscrito(A)||tieneEvaluacion(A))
           return false;
          
              for(int i=0; i<indice;i++)
                  {
                      if(A.getBoleta()==alumnos[i].getBoleta()){
                          
                          aux=i;
                          
                         
                           break;
                      }
              }
              evaluaciones[aux]=new Evaluacion(aux,C,"Evaluo: ");
             numdeEvaluaciones++;
              
              return true;
          
  
 
  }

  public Alumno [] getAlumnosInscritos() {
    Alumno alumnospy[]=new Alumno[indice];
    for(int i=0; i<indice;i++){
        alumnospy[i]=alumnos[i];
    }
    return alumnospy;
  }
   

  public String getId() {
  return id;
  }

  public void asignarProfesor(Profesor P) {
      maestro=P;
      P.asignarClase(this);
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
  return materia;
  }

  public Profesor getProfesor() {
  return maestro;
  }

  public boolean tieneEvaluacion(Alumno A) {
      int aux=0;
      boolean bandera=false;
      for(int i=0;i<indice;i++){
          if(A.getBoleta()==alumnos[i].getBoleta()){
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
      float suma=0.0F;
      if(numdeEvaluaciones>=1){
      for(int i=0; i<indice;i++){
	if(evaluaciones[i]!=null){
            suma+=evaluaciones[i].getCalif();
	}
        }
      return suma/(float)numdeEvaluaciones;
      }
      else{
          return 0.0F;
      }
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
      materia = U;
  }

}