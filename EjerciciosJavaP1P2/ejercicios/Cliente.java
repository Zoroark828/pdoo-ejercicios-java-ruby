
package ejercicios;

import java.util.ArrayList;

/**
 *  Autora: @zoroark828
 * 
 */

public class Cliente {
    private String dni;
    private String nombre;
    private ArrayList<Reserva> reservas;                // Array que hace referencia a la clase Reservas
    
    public Cliente(String d, String n){
        dni = d;
        nombre = n;
        
        reservas = new ArrayList();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void addReserva(Reserva r){
        this.reservas.add(r);  
        
        /*
        Esto es correcto, ya que este metodo se utiliza en el metodo addReserva de la clase Hotel
        para añadirle al array reservas de esta clase la nueva reserva
        Este metodo NO debe añadirle a hotel la reserva, ya que cuando queramos hacer una reserva,
        deberemos usar el addReserva de Hotel y no el de Cliente
        
        Al escribir codigo tenemos que hacer que cada clase se encargue de sus tareas y no hacer
        2 clases que hagan lo mismo
        
        Además, este metodo debe existir porque otras clases no deberian añadir directamente atributos
        a otras clases si no es a traves de uno de sus metodos
        */
    }
    
    public ArrayList<Reserva> getReservas(){
        return reservas;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
