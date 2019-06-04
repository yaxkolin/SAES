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
    return (Clase[])clases.toArray();
  }

  public void inscribirClase(Clase C) {
      clases.addElement(C);
  }

  public Alumno(String N, int B) {
      nombre=N;
      boleta=B;
  }
  
}

  