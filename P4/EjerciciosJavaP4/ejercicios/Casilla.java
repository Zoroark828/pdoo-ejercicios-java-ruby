
package ejercicios;

/**
 * Autora: @zoroark828
 * 
 */

public class Casilla {
    private String nombre;
    
    Casilla (String nombre){
        this.nombre = nombre;
    }
    
    boolean recibeJugador (){
        System.out.println("La casilla " +this.nombre +" ha recibido a un jugador");
        return true;
    }
    
    
    
}
