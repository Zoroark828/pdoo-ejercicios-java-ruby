
package ejercicios;

import java.util.ArrayList;

/**
 * Autora: @zoroark828
 *
 */     

public class Empleado {
    private String nombre;
    //Hotel[] hoteles;                        // Array de referencia a la clase Hotel
    private ArrayList<Hotel> hoteles;
    
    public Empleado(String nombre){
        this.nombre = nombre;
        this.hoteles = new ArrayList();                // Se inicializa asi????
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public boolean addTrabajo (Hotel hotel){
        // Será false si el empleado ya trabaja en el num max de hoteles permitidos (2 es el MAX)        
        if (hoteles.size() < 2){
            hoteles.add(hotel);
            hotel.addEmpleado(this);
            return true;
        } 
        else
            return false;
        
    }
    
    
    
    
    
    
    
    
    
}
