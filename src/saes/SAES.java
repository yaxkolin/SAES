/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Randy
 */

public class SAES {
    public static void main(String[] args) {
        
        GestionEscolar a = new GestionEscolar("2CV2");
         
        Alumno a1 = a.darDeAltaAlumno("Alan", 2015051234);
        Alumno a2 = a.darDeAltaAlumno("Osvaldo", 2015040579);  
        Alumno a3 = a.darDeAltaAlumno("Aarón", 2015080571);
        Alumno a4 = a.darDeAltaAlumno("Aldo", 2015284021);
        Alumno a5 = a.darDeAltaAlumno("Peniche", 2015083954);
        Alumno a6 = a.darDeAltaAlumno("Oscar", 2015090314);
        Alumno a7 = a.darDeAltaAlumno("Luis", 2015843691);
        Alumno a8 = a.darDeAltaAlumno("Manuel", 2015080579);
        Alumno a9 = a.darDeAltaAlumno("Israel", 2015148745);
        Alumno a10= a.darDeAltaAlumno("Randy", 2015110798);
        
        Profesor p1 = a.darDeAltaProfesor("Yaxkin", 11); 
        Profesor p2 = a.darDeAltaProfesor("Crispin", 21); 
        Profesor p3 = a.darDeAltaProfesor("Santiago", 31); 
        Profesor p4 = a.darDeAltaProfesor("Martha Patricia", 41); 
        Profesor p5 = a.darDeAltaProfesor("Edmundo", 51); 
        Profesor p6 = a.darDeAltaProfesor("Ricardo Felipe", 61); 
        Profesor p7 = a.darDeAltaProfesor("Jorge", 71); 
        Profesor p8 = a.darDeAltaProfesor("Susana", 81); 
        Profesor p9 = a.darDeAltaProfesor("LILIAN", 91); 
        Profesor p10 = a.darDeAltaProfesor("Adriana", 10); 
        
        Clase c1 = a.darDeAltaClase(30, "2CV2");
        Clase c2 = a.darDeAltaClase(20, "1CM1");
        Clase c3 = a.darDeAltaClase(30, "1CM9");
        Clase c4 = a.darDeAltaClase(40, "1CM9");
        Clase c5 = a.darDeAltaClase(50, "1CM12");
        Clase c6 = a.darDeAltaClase(30, "1CM3");
        Clase c7 = a.darDeAltaClase(20, "1CV9");
        Clase c8 = a.darDeAltaClase(30, "1CM1");
        Clase c9 = a.darDeAltaClase(40, "1CM1");
        Clase c10 = a.darDeAltaClase(50, "1CM2");
        
        UnidadAprendizaje u1 = a.darDeAltaUnidad("Programacion Orientada a Objetos", 1);
        UnidadAprendizaje u2 = a.darDeAltaUnidad("Física", 2);
        UnidadAprendizaje u3 = a.darDeAltaUnidad("Estructuras de Datos", 3);
        UnidadAprendizaje u4 = a.darDeAltaUnidad("Cálculo", 4);
        UnidadAprendizaje u5 = a.darDeAltaUnidad("Análisis fundamental de Circuitos", 5);
        UnidadAprendizaje u6 = a.darDeAltaUnidad("Teoría Computacional", 6);
        UnidadAprendizaje u7 = a.darDeAltaUnidad("Ecuaciones Diferenciales", 7);
        UnidadAprendizaje u8 = a.darDeAltaUnidad("Matemáticas Discretas", 8);
        UnidadAprendizaje u9 = a.darDeAltaUnidad("Ingeniería, Ética y Sociedad", 9);
        UnidadAprendizaje u10 = a.darDeAltaUnidad("Comunicación Oral y Escrita", 10);
        a1.inscribirClase(c1);
        a1.inscribirClase(c2);
        a1.inscribirClase(c3);
        a1.inscribirClase(c4);
        a1.inscribirClase(c5);
        a2.inscribirClase(c1);
        a3.inscribirClase(c2);
        a2.inscribirClase(c3);
        a2.inscribirClase(c4);
        a2.inscribirClase(c5);
        a2.inscribirClase(c2);
        
        a3.inscribirClase(c1);
        a3.inscribirClase(c4);
        a3.inscribirClase(c6);
        a3.inscribirClase(c7);
        a3.inscribirClase(c8);
        a3.inscribirClase(c9);
        a3.inscribirClase(c10);
        
        a4.inscribirClase(c4);
        a4.inscribirClase(c5);
        a4.inscribirClase(c6);
        a4.inscribirClase(c7);
        a4.inscribirClase(c8);
        a4.inscribirClase(c9);
        a4.inscribirClase(c10);
        
        a5.inscribirClase(c5);
        a5.inscribirClase(c4);
        a5.inscribirClase(c3);
        a5.inscribirClase(c2);
        a5.inscribirClase(c1);
        
        a6.inscribirClase(c6);
        a6.inscribirClase(c7);
        a6.inscribirClase(c8);
        a6.inscribirClase(c9);
        a6.inscribirClase(c10);
        
        a7.inscribirClase(c7);
        a7.inscribirClase(c6);
        a7.inscribirClase(c5);
        a7.inscribirClase(c4);
        a7.inscribirClase(c3);
        a7.inscribirClase(c2);
        a7.inscribirClase(c1);
        
        a8.inscribirClase(c8);
        a8.inscribirClase(c9);
        a8.inscribirClase(c10);
        a8.inscribirClase(c6);
        a8.inscribirClase(c4);
        
        
        a9.inscribirClase(c9);
        a9.inscribirClase(c8);
        a9.inscribirClase(c7);
        a9.inscribirClase(c6);
        a9.inscribirClase(c5);
        a9.inscribirClase(c4);
        a9.inscribirClase(c3);
        a9.inscribirClase(c2);
        a9.inscribirClase(c1);
        
        a10.inscribirClase(c10);
        a10.inscribirClase(c9);
        a10.inscribirClase(c8);
        a10.inscribirClase(c7);
        a10.inscribirClase(c6);
        a10.inscribirClase(c5);
        a10.inscribirClase(c4);
        a10.inscribirClase(c3);
        a10.inscribirClase(c2);
        a10.inscribirClase(c1);
        
        
        c1.asignarProfesor(p1);
        c2.asignarProfesor(p2);
        c3.asignarProfesor(p3);
        c4.asignarProfesor(p4);
        c5.asignarProfesor(p5);
        c6.asignarProfesor(p6);
        c7.asignarProfesor(p7);
        c8.asignarProfesor(p8);
        c9.asignarProfesor(p9);
        c10.asignarProfesor(p10);
        
        c1.setUnidadAprendizaje(u1);
        c1.setUnidadAprendizaje(u2);
        c1.setUnidadAprendizaje(u3);
        c1.setUnidadAprendizaje(u4);
        c1.setUnidadAprendizaje(u5);
        c1.setUnidadAprendizaje(u6);
        c1.setUnidadAprendizaje(u7);
        c1.setUnidadAprendizaje(u8);
        c1.setUnidadAprendizaje(u9);
        c1.setUnidadAprendizaje(u10);
        
        String botones[]={"Profesor","Estudiante","Salir"};
        boolean salir=true;
        int Opc = JOptionPane.showOptionDialog(null, "", "MENU", JOptionPane.OK_OPTION, JOptionPane.NO_OPTION,null,botones,"default");
        
        do{
            switch(Opc+1){
                
                case 1:
                    
                        
                    
                    JFrame frame = new JFrame("Input Dialog Example");
                    String respuesta1;
                    int x, ind=0;
                    int i= a.getProfesores().length;
                    String Pro[]=new String[i];
                    
                    for(int j=0;j<i;j++){
                        Pro[j]=(a.getProfesores()[j]).getNombre();
                    }
                    
                    respuesta1= (String) JOptionPane.showInputDialog(null, "Selecciona un profesor","Profesores", JOptionPane.DEFAULT_OPTION, null, Pro, Pro[0]);
                    
                    for(x=0;x<a.getProfesores().length;x++){
                        if(respuesta1.equals(a.getProfesor(x).getNombre()))
                            ind=x;
                    } 
                    Profesor prof = new Profesor(a.getProfesor(ind).getNombre(),a.getProfesor(ind).getNumeroTrab());
                        JFrame prof_evaluado=new JFrame();
      
      JButton regresar=new JButton("Regresar");
      
      String evs=new String();
      Clase [] C_Prof=prof.getClases();
      //Obteniendo las evaluaciones del profesor  
      evs="Grupo\tUnidad de Aprendizaje\tPromedio\tEvaluados/Inscritos";
      if(prof.getClases()!=null)
      for(int l=0;l<prof.getClases().length;l++)
       evs+=""+C_Prof[l].getId()+"\t"+C_Prof[l].getUnidadAprendizaje().getNombre()+"\t"+C_Prof[l].calcularPromedio()+"\t"+C_Prof[l].getNumEvaluaciones()+"/"+C_Prof[l].getAlumnosInscritos().length+"\n\n";
     
      JTextArea evaluaciones = new JTextArea(evs);
      JScrollPane jsp = new JScrollPane(evaluaciones); 
       //Modificando el scroll
       jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       jsp.setBounds(25, 25, 620, 360);
      //Modificando el textArea
      evaluaciones.setEditable(false);
      evaluaciones.setLineWrap(true);
      evaluaciones.setWrapStyleWord(true);      
      //Modificando el boton
      regresar.setBounds(25, 400, 100, 50);
      //Modificando el JFrame
      prof_evaluado.setSize(680,500);
      prof_evaluado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      prof_evaluado.setLayout(null);
      prof_evaluado.setLocationRelativeTo(null);
      prof_evaluado.setTitle(""+prof.getNombre()+"~Evaluaciones");
      prof_evaluado.add(jsp);
      prof_evaluado.add(regresar);
      prof_evaluado.setVisible(true);
      //Configurando el boton
      regresar.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              prof_evaluado.dispose();
          }
      });
                   
                    salir=true;
                    break;
                    
                case 2:
                    
                     //String Alumno = (String) JOptionPane.showInputDialog(frame2,"Elija el alumno","Alumnos",JOptionPane.QUESTION_MESSAGE,null,alum,alum[0]);
                    
                    String respuesta;
                    int x1, ind1=0;
                    int i1= a.getAlumnos().length;
                    String Alu[]=new String[i1];
                    
                    for(int j=0;j<i1;j++){
                        Alu[j]=(a.getAlumnos()[j]).getNombre();
                    }
                    
                    respuesta= (String) JOptionPane.showInputDialog(null, "Selecciona un alumno","Alumnos", JOptionPane.DEFAULT_OPTION, null, Alu, Alu[0]);
                    for(x1=0;x1<a.getAlumnos().length;x1++){
                        if(respuesta.equals(Alu[x1]))
                            ind1=x1;   
                        break;
                    }
                    String Saux="";
                    boolean x3=true;
                    Alumno seleccion = a.getAlumnos()[ind1];
                    Clase[] ClasesAlumno = seleccion.getClases();
                    int o=0;
                    try{
                        do{

                            for(int i2=0; i2<ClasesAlumno.length; i2++){       
                                if(ClasesAlumno[i2].tieneEvaluacion(seleccion)!=true){
                                    int j = i2++;
                                    Saux += j+". "+seleccion+" "+seleccion.getClases()[i2].getProfesor()+" "+seleccion.getClases()[i2].getUnidadAprendizaje()+"\n";
                                }           
                            }
                            if(Saux.length()>2){

                                JOptionPane.showMessageDialog(null,Saux);
                                String fe = JOptionPane.showInputDialog("Ingrese el numero de la clase que desea evaluar o ingrese 15 para salir\n"+Saux);
                                int b = Integer.parseInt(fe);
                                o=b;
                                if(o!=15){
                                    b--;
                                    JOptionPane.showInputDialog("Ingrese la calificacion para la clase"+seleccion.getClases()[b]);
                                    int c = Integer.parseInt(fe);
                                    seleccion.getClases()[b].setEvaluacion(seleccion, (byte) c);
                                    x3 = true;
                                }
                            }

                            else
                                JOptionPane.showMessageDialog(null,"El alumno tiene todas las evaluaciones");
                                x3 = false;
                                

                        }while(x3!=false || o!=15);
                        
                    }

                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
                    }
                    salir=true;
                    break;
                    
                case 3:
                    salir=false;
                    break;
            }
        }while(salir);
    }
}
    
    
 
