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

  public Profesor getProfesor (int NT)
  {
      Profesor profe=null;
      Vector profesores = maestros;
      for (int i=0; i< profesores.size(); i++)
      {
          profe = (Profesor) profesores.get(i);
          if (profe.getNumeroTrab() == NT)
          {
              break;
          }
      }
      return profe;
  }
 
  public UnidadAprendizaje getUnidadAprendizaje (int ID)
  {
      UnidadAprendizaje unidad=null;
      Vector materias = unidades;
      for (int i=0; i< materias.size(); i++)
      {
          unidad = (UnidadAprendizaje) materias.get(i);
          if (unidad.getID() == ID)
          {
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