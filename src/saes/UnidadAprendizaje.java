package saes;

public class UnidadAprendizaje {

  private String nombre;
  private int id;
  private GestionEscolar gestion;
  
  public String getNombre() {
  return nombre;
  }

  public void setNombre(String N) {
      nombre = new String(N);
  }

  public int getID() {
      return id;
  }

  public void setID(int ID) {
      id = ID;
  }

  public UnidadAprendizaje(String N, int ID) {
      nombre = new String(N);
      id = ID;
  }

}