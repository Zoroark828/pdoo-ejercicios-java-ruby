
package ejercicios;

/**
 *  Autora: @zoroark828
 *
 */

public class Reserva {
    private String fechaEntrada;
    private String fechaSalida;
    private Cliente cliente;                        // Atributo que hace referencia a la clase Cliente
    private Hotel hotel;                            // Atributo que hace referencia a Hotel
    
    public Reserva(String FE, String FS, Cliente c, Hotel h){
        fechaEntrada = FE;
        fechaSalida = FS;
        cliente = c;
        hotel = h;
    }
    
    public String getFechaEntrada(){
        return fechaEntrada;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    
    
}
