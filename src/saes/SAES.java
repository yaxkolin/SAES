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
public static Alumno MenuP(Alumno P[]){
   
    String respuesta;
    int x, ind=0;
    int i= P.length;
     String Alu[]=new String[i];
    for(int j=0;j<=i;j++){
    Alu[j]=(P[j]).getNombre();
    }
    respuesta= (String) JOptionPane.showInputDialog(null, "Selecciona un profesor","Profesores", JOptionPane.DEFAULT_OPTION, null, Alu, Alu[0]);
    for(x=0;x<=P.length;x++){
    if(respuesta==P[x].getNombre())
        ind=x;
       
    
    } return P[ind];
}

    public static void main(String[] args) {
        
        GestionEscolar a = new GestionEscolar("2CV2");
        
        Alumno a1 = new Alumno(a.darDeAltaAlumno("Alan", 2015051234));
        Alumno a2 = new Alumno(a.darDeAltaAlumno("Osvaldo", 2015040579));  
        Alumno a3 = new Alumno(a.darDeAltaAlumno("Aarón", 2015080571));
        Alumno a4 = new Alumno (a.darDeAltaAlumno("Aldo", 2015284021));
        Alumno a5 = new Alumno(a.darDeAltaAlumno("Peniche", 2015083954));
        Alumno a6 = new Alumno(a.darDeAltaAlumno("Oscar", 2015090314));
        Alumno a7 = new Alumno(a.darDeAltaAlumno("Luis", 2015843691));
        Alumno a8 = new Alumno(a.darDeAltaAlumno("Manuel", 2015080579));
        Alumno a9 = new Alumno(a.darDeAltaAlumno("Israel", 2015148745));
        Alumno a10= new Alumno(a.darDeAltaAlumno("Randy", 2015110798));
        
        Profesor p1 = new Profesor(a.darDeAltaProfesor("Yaxkin", 11)); 
        Profesor p2 = new Profesor(a.darDeAltaProfesor("Crispin", 21)); 
        Profesor p3 = new Profesor(a.darDeAltaProfesor("Santiago", 31)); 
        Profesor p4 = new Profesor(a.darDeAltaProfesor("Martha Patricia", 41)); 
        Profesor p5 = new Profesor(a.darDeAltaProfesor("Edmundo", 51)); 
        Profesor p6 = new Profesor(a.darDeAltaProfesor("Ricardo Felipe", 61)); 
        Profesor p7 = new Profesor(a.darDeAltaProfesor("Jorge", 71)); 
        Profesor p8 = new Profesor(a.darDeAltaProfesor("Susana", 81)); 
        Profesor p9= new Profesor(a.darDeAltaProfesor("LILIAN", 91)); 
        Profesor p10 = new Profesor(a.darDeAltaProfesor("Adriana", 10)); 
        
        Clase c1 = new Clase(a.darDeAltaClase(30, "2CV2"));
        Clase c2 = new Clase(a.darDeAltaClase(20, "1CM1"));
        Clase c3 = new Clase(a.darDeAltaClase(30, "1CM9"));
        Clase c4 = new Clase(a.darDeAltaClase(40, "1CM9"));
        Clase c5 = new Clase(a.darDeAltaClase(50, "1CM12"));
        Clase c6 = new Clase(a.darDeAltaClase(30, "1CM3"));
        Clase c7 = new Clase(a.darDeAltaClase(20, "1CV9"));
        Clase c8 = new Clase(a.darDeAltaClase(30, "1CM1"));
        Clase c9 = new Clase(a.darDeAltaClase(40, "1CM1"));
        Clase c10 = new Clase(a.darDeAltaClase(50, "1CM2"));
        
        UnidadAprendizaje u = new UnidadAprendizaje(a.darDeAltaUnidad("Programacion Orientada a Objetos", 1));
        UnidadAprendizaje u = new UnidadAprendizaje(a.darDeAltaUnidad("Física", 2));
        UnidadAprendizaje u = new UnidadAprendizaje(a.darDeAltaUnidad("Estructuras de Datos", 3));
        UnidadAprendizaje u = new UnidadAprendizaje(a.darDeAltaUnidad("Cálculo", 4));
        UnidadAprendizaje u = new UnidadAprendizaje(a.darDeAltaUnidad("Análisis fundamental de Circuitos", 5));
        UnidadAprendizaje u = new UnidadAprendizaje(a.darDeAltaUnidad("Teoría Computacional", 6));
        UnidadAprendizaje u = new UnidadAprendizaje(a.darDeAltaUnidad("Ecuaciones Diferenciales", 7));
        UnidadAprendizaje u = new UnidadAprendizaje(a.darDeAltaUnidad("Matemáticas Discretas", 8));
        UnidadAprendizaje u = new UnidadAprendizaje(a.darDeAltaUnidad("Ingeniería, Ética y Sociedad", 9));
        UnidadAprendizaje u = new UnidadAprendizaje(a.darDeAltaUnidad("Comunicación Oral y Escrita", 10));
        
         p1.asignarClase(c1);
        p2.asignarClase(c2);
        p3.asignarClase(c3);
        p4.asignarClase(c4);
        p5.asignarClase(c5);
        p6.asignarClase(c6);
        p7.asignarClase(c7);
        p8.asignarClase(c8);
        p9.asignarClase(c9);
        p10.asignarClase(c10);
        
        a1.inscribirClase(c1);
        a2.inscribirClase(c2);
        a3.inscribirClase(c3);
        a4.inscribirClase(c4);
        a5.inscribirClase(c5);
        a6.inscribirClase(c6);
        a7.inscribirClase(c7);
        a8.inscribirClase(c8);
        a9.inscribirClase(c9);
        a10.inscribirClase(c10);
        
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
        
        //Alumno [] alum = a.getAlumnos();
        //Profesor [] profes = a.getProfesores();
        String botones[]={"Profesor","Estudiante","Salir"};
        int Opc = JOptionPane.showOptionDialog(null, "", "MENU", JOptionPane.OK_OPTION, JOptionPane.NO_OPTION,null,botones,"default");
        
        if(Opc==0){
            JFrame frame = new JFrame("Input Dialog Example");
            //String Profesor = (String) JOptionPane.showInputDialog(frame,"Elija el profesor","Profesores",JOptionPane.QUESTION_MESSAGE,null,profes,profes[0]);
            menuP();
        }else if(Opc==1){
            JFrame frame2 = new JFrame("Input Dialog Example");
            //String Alumno = (String) JOptionPane.showInputDialog(frame2,"Elija el alumno","Alumnos",JOptionPane.QUESTION_MESSAGE,null,alum,alum[0]);
            menuSinCalificaciones(menuA());
        }

    }
    
    
        
public static void MenuP_ev(Profesor prof){


      //Declaracion de objetos para la ventana de las evaluaciones al profesor
      JFrame prof_evaluado=new JFrame();
      
      JButton regresar=new JButton("Regresar");
      
      String evs=new String();
      Clase [] C_Prof=prof.getClases();
      //Obteniendo las evaluaciones del profesor  
      evs="Grupo\tUnidad de Aprendizaje\tPromedio\tEvaluados/Inscritos";
      if(prof.getClases()!=null)
      for(int i=0;i<prof.getClases().length;i++)
       evs+=""+C_Prof[i].getId()+"\t"+C_Prof[i].getUnidadAprendizaje().getNombre()+"\t"+C_Prof[i].calcularPromedio()+"\t"+C_Prof[i].getNumEvaluaciones()+"/"+C_Prof[i].getAlumnosInscritos().length+"\n\n";
     
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

}

}

public static Alumno MenuA(Alumno A[]){
   
    String respuesta;
    int x, ind=0;
    int i= A.length;
     String Alu[]=new String[i];
    for(int j=0;j<=i;j++){
    Alu[j]=(A[j]).getNombre();
    }
    respuesta= (String) JOptionPane.showInputDialog(null, "Selecciona un alumno","Alumnos", JOptionPane.DEFAULT_OPTION, null, Alu, Alu[0]);
    for(x=0;x<=A.length;x++){
    if(respuesta==A[x].getNombre())
        ind=x;
       
    
    } return A[ind];

        }

public static String clasesSinCalificaciones(Alumno a){
        String Saux="";
        boolean x=true;
        Clase[] ClasesAlumno = a.getClases();
        
        for(int i=0; i<ClasesAlumno.length; i++){       
            if(ClasesAlumno[i].tieneEvaluacion(a)!=true){
                int j = i++;
                Saux += j+". "+a+" "+a.getClase(i).getProfesor()+" "+a.getClase(i).getUnidadAprendizaje()+"\n";
            }           
        }
        
        return Saux;
        
    }
    
    public static void menuSinCalificaciones(Alumno a){
        String Saux;
        boolean x;
        try{
            do{

                Saux = clasesSinCalificaciones(a);

                if(Saux.length()>2){

                    JOptionPane.showMessageDialog(null,Saux);
                    String fe = JOptionPane.showInputDialog("Ingrese el numero de la clase que desea evaluar \n"+Saux);
                    int b = Integer.parseInt(fe);
                    b--;

                    JOptionPane.showInputDialog("Ingrese la calificacion para la clase"+a.getClase(b));
                    int c = Integer.parseInt(fe);
                    a.getClase(b).setEvaluacion(a, (byte) c);
                    x = true;
                }

                else
                    JOptionPane.showMessageDialog(null,"El alumno tiene todas las evaluaciones");
                    x = false;

            }while(x!=false);
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
        }
    }

