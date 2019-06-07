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
     
    Alumno [] Alum=new Alumno [alumnos.toArray().length];  
    for(int i=0;i< alumnos.toArray().length; i++ )
         Alum[i]=(Alumno)alumnos.toArray()[i];
    return Alum;
  }

  public Profesor [] getProfesores() {
     Profesor [] profs=new Profesor [maestros.toArray().length];  
    for(int i=0;i< maestros.toArray().length; i++ )
         profs[i]=(Profesor)maestros.toArray()[i];
    return profs;
  }

  public Profesor getProfesor (int NT)
  {
      Profesor profe=null;
      for (int i=0; i< maestros.size()-1; i++)
      {
          if (((Profesor) maestros.get(i)).getNumeroTrab() == NT)
          {
              profe = (Profesor) maestros.get(i);
              break;
          }
      }
      return profe;
  }
 
  public UnidadAprendizaje getUnidadAprendizaje (int ID)
  {
      UnidadAprendizaje unidad=null;
      for (int i=0; i< unidades.size()-1; i++)
      {
          if (((UnidadAprendizaje) unidades.get(i)).getID() == ID)
          {
              unidad = (UnidadAprendizaje) unidades.get(i);
              break;
          }
      }
      return unidad;
  }
  
  
  public Alumno darDeAltaAlumno(String N, int B) {
    Alumno juan=new Alumno(N,B);
    alumnos.add(juan);
  return juan;
  }

  public Profesor darDeAltaProfesor(String N, int NT) {
      Profesor profesor1 = new Profesor(N,NT);
      maestros.add(profesor1);
      return profesor1;
  }

  public Clase darDeAltaClase(int C, String ID) {
      Clase clase1=new Clase(C,ID);
      clases.add(clase1);
      return clase1;
  }

  public UnidadAprendizaje darDeAltaUnidad(String n, int ID) {
      
      UnidadAprendizaje UA = new UnidadAprendizaje(n,ID);
      
      unidades.add(UA);
      
      return UA;
  }

  public GestionEscolar(String ID) {
      this.id= ID;
      alumnos = new Vector();
      maestros = new Vector();
      clases = new Vector();
      unidades = new Vector();
  }

}
