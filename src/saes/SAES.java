/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saes;

/**
 *
 * @author flore
 */
public class SAES {

    /**
     * @param args the command line arguments
     */
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

    }
    
}
