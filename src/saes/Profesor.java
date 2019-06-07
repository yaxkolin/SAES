package saes;

import java.util.Vector;

public class Profesor {

  private String nombre;

  private int numeroTrab;

  private GestionEscolar gestion;
    /**
   * 
   * @element-type Clase
   */
  private Vector  clases;

  public String getNombre() {
    String a=nombre;
  return a;
  }

  public int getNumeroTrab() {
    int a=numeroTrab;
    return a;
  }

  public Clase [] getClases() {
   Clase [] materias=new Clase [clases.toArray().length];  
    for(int i=0;i< clases.toArray().length; i++ )
         materias[i]=(Clase)clases.toArray()[i];
    return materias;
  }

  public void asignarClase(Clase C) {
    clases.addElement(C);
  }

  public Profesor(String N, int NT) {
    nombre=N;
    numeroTrab=NT;
    clases=new Vector();
  }

}