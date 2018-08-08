package MatriculaEstudiantes;

import java.util.Objects;

public class Materias {
    String nombre;

    public Materias(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        
        return  nombre;
    }

  
    @Override
    public boolean equals(Object obj) {
       
        final Materias otrasMaterias = (Materias) obj;
   
        
        return false;
    }
    
    
    
    
}
