package saes;

import java.util.Vector;
 
public class Alumno {
 
  private String nombre;

  private int boleta;

  private GestionEscolar gestion;
    /**
   * 
   * @element-type Clase
   */
  private Vector  clases;

  public String getNombre() {
    return nombre;
  }

  public int getBoleta() {
    return boleta;
  }

  public Clase [] getClases() {
    Clase [] materias=new Clase [clases.toArray().length];  
    for(int i=0;i< clases.toArray().length; i++ )
         materias[i]=(Clase)clases.toArray()[i];
    return materias;
  }

  public void inscribirClase(Clase C) {
      clases.addElement(C);
  }

  public Alumno(String N, int B) {
      nombre=N;
      boleta=B;
      clases=new Vector ();
  }
  
}

  