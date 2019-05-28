package saes;

public class Evaluacion {

  private int id;

  private byte calificacion;

  private String comentario;

  
  public void setCalif(byte C) {
      calificacion = C;
  }

  public byte getCalif() {
    return calificacion;
  }

  public void setComentario(String Co) {
      comentario = new String(Co);
  }

  public String getComentario() {
    return comentario;
  }

  public int getID() {
    return id;
  }

  public Evaluacion(int ID, byte Ca, String Co) {
      this.id = ID;
      this.calificacion = Ca;
      this.comentario = new String(Co);
  }

}