
package ejercicios;

import java.util.ArrayList;

/**
 *  Autora: @zoroark828
 *          ¿Tengo que inicializar un director en el constructor? Sí, se inicializan TODOS los atributos
 *          Un objeto como director, ya que no es un arraylist, se inicializa como null.
 * 
 * 
 */

public class Hotel {
    private static int NUM_HOTELES = 0;    
    private String nombre, ciudad;
    private int estrellas;
    private Director director;                          // Atributo que hace referencia a la clase Director
    private ArrayList<Reserva> reservas;                // Array que hace referencia a Reservas
    private ArrayList<Empleado> empleados;              // Array que hace referencia a Empleado
    private ArrayList<Habitacion> habitaciones;         // Array que hace referencia a Habitacion
    
    public Hotel(String n, String c, int e){
        nombre = n;
        ciudad = c;
        estrellas = e;
        director = null;
        reservas = new ArrayList();
        empleados = new ArrayList();
        habitaciones = new ArrayList();
        
        NUM_HOTELES++;
    }
    
    public static int getNUM_HOTELES(){
        return NUM_HOTELES;
    }
    
    public void setDirector(Director d){
        director = d;        
    }
    
    public Director getDirector(){
        return director;
    }
    
    public void addReserva(Cliente c, String FE, String FS){
        Reserva reserva = new Reserva(FE, FS, c, this);
        
        reservas.add(reserva);                       // Añadimos la reserva al array de Hotel
        c.addReserva(reserva);                      // Añadimos la reserva tambien al array de Cliente        
    }
    
    public ArrayList<Reserva> getReservas(){
        return reservas;        
    }
    
    public ArrayList<Empleado> getEmpleados(){
        return empleados;
    }
    
    public boolean addEmpleado(Empleado empleado){
        // Devuelve false si el empleado ya trabaja en el numero maximo de hoteles permitido (2 MAX)
        this.empleados.add(empleado);
        return true;
        
        /*
        Con addEmpleado y addTrabajo ocurre lo mismo que con addReserva. El metodo que debemos usar para crear un empleado
        nuevo es el de la clase Empleado, que crea un trabajo nuevo en su array hoteles, y un empleado en la clase Hotel, utilizando
        este metodo addEmpleado
        */
    }
    
    public void addHabitacion(int numero, int capacidad){
        this.habitaciones.add(new Habitacion(numero,capacidad));
    }
    
    
    public int buscarHabitacionCapacidad(int capacidad){
        // Devuelve el número de la primera habitación donde caben, al menos, el número de personas pasado
        // por parámetro, o -1 si ninguna cumple el criterio
        int habitacionEncontrada = -1;
        
        for(Habitacion i: this.habitaciones){
        int capacidadActual = i.getCapacidad();
        if(capacidadActual >= capacidad){
            habitacionEncontrada = i.getNumero();
            break;                                          // Si encontramos la habitacion que queriamos, salimos del for
        }        
        }
    
        return habitacionEncontrada;
    }
    
    
    
    
    
    
}