
package ejercicios;

/**
 * Autora: @zoroark828
 * 
 */

public class CasillaCalle extends Casilla {
    private int numCasas;
    
    CasillaCalle (String nombre, int numCasas){
        super (nombre);
        this.numCasas = numCasas;
    }
    
    // Ejercicio 2. Redefinicion completa del metodo recibeJugador()
    // Es COMPLETA porque hemos redefinido TODO el metodo y no se parece al de la clase padre
    /*boolean recibeJugador(){
        System.out.println("Soy una casilla calle y he recibido un jugador");
        return true;
    }
    */
    
    // Ejercicio 3. Redefinicion parcial del metodo recibeJugador()
    // Es PARCIAL porque redefinimos un metodo de la clase padre reutilizando su codigo y además añadiendo
    // algunas lineas nuevas
    @Override
    boolean recibeJugador(){
        if (super.recibeJugador()){
            System.out.println("y ademas es una casilla calle");
            return true;
        }
        else
            return false;
    }
    
    // Ejercicio 4. Añadimos el siguiente metodo en esta clase. Es un metodo propio de la clase hija
    void construirCasa(){
       this.numCasas++;
       System.out.println("Esta casilla tiene " +this.numCasas + " casas.");
    }
    
    
    
    
    
    
    
}