
package MatriculaEstudiantes;

import java.util.Objects;

public class Estudiantes {
    public static boolean verificar = false;
    String nombre;
    String apellido;
   
    public Estudiantes(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        
    }

    /*public static boolean isVerificar() {
        return verificar;
    }

    public static void setVerificar(boolean verificar) {
        Estudiantes.verificar = verificar;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

  
    

    @Override
    public boolean equals(Object obj) {
       
        final Estudiantes otroEstudiante = (Estudiantes) obj;
 
       return false;
    }
    
    
    @Override
    public String toString() {
        return  nombre + " " + apellido + " " ;
    }

    
    
}
