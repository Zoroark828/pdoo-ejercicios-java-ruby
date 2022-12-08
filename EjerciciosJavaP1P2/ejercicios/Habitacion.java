
package ejercicios;

/**
 * Autora: @zoroark828
 * 
 */

public class Habitacion {
    private int numero;
    private int capacidad;
    private Hotel hotel;                                    // Atributo referencia a la clase Hotel
    
    public Habitacion(int numero, int capacidad){
        this.numero = numero;
        this.capacidad = capacidad;
    }
    
    public int getCapacidad(){
        return this.capacidad;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    
    
}
