
package ejercicios;

/**
 *  Autora: @zoroark828
 * 
 */

public class EjerciciosJava {
    
    public static void main(String[] args) {
    System.out.println("======== PRUEBAS CLASE PARCELA ========");
    
    Parcela parcela1 = new Parcela ("parcela verde", 10, 1,15);
    Parcela parcela2 = new Parcela ("parcela verde", 10, 1,15);
    Parcela parcela3 = new Parcela ("parcela azul", 20, 2,30);
    Parcela parcela4 = parcela1;                        // Así se hacen los "punteros" en Java
  
    System.out.println("\nAtributos recien creados:");    
    System.out.println("Nombre: "+parcela1.getNombre());    
    System.out.println("Precio compra: "+parcela1.getPrecioCompra());      
    System.out.println("Precio edificar: "+parcela1.getPrecioEdificar());    
    System.out.println("Numero casas: "+parcela1.getNumCasas());    
    System.out.println("Numero hoteles: "+parcela1.getNumHoteles());
    System.out.println("Precio alquiler completo: "+parcela1.getPrecioAlquilerCompleto());    

    /*
    PrecioAlquilerCompleto = 15 * (1 + 0 + 0*4) = 15
    */        
    
    System.out.println("\nAhora sumamos 2 casas y 1 hotel");
    
    parcela1.construirCasa();    
    parcela1.construirCasa();    
    parcela1.construirHotel();
        
    System.out.println("\nComprobamos de nuevo los atributos:");
    System.out.println("Nombre: "+parcela1.getNombre());    
    System.out.println("Precio compra: "+parcela1.getPrecioCompra());      
    System.out.println("Precio edificar: "+parcela1.getPrecioEdificar());    
    System.out.println("Numero casas: "+parcela1.getNumCasas());    
    System.out.println("Numero hoteles: "+parcela1.getNumHoteles());
    System.out.println("Precio alquiler completo: "+parcela1.getPrecioAlquilerCompleto());
        
    /*
    PrecioAlquilerCompleto = 15 * (1 + 2 + 1*4) = 105
    */
    
    parcela2.construirCasa();       // Construyo 2 casas y un hotel en la
    parcela2.construirCasa();       // parcela2 para que tenga el mismo estado
    parcela2.construirHotel();      // que parcela 1
    
    
    System.out.println("\n\n======== COMPROBACION ESTADOS ========");    
    System.out.println("\nSon la parcela1 y parcela2 identicas? " +parcela1.igualdadIdentidad(parcela2));    
    System.out.println("Tienen estas dos el mismo estado? " +parcela1.igualdadEstado(parcela2));
    System.out.println("Tienen parcela1 y parcela3 el mismo estado? " +parcela1.igualdadEstado(parcela3));    
    System.out.println("Son parcela1 y parcela4 identicas? " +parcela1.igualdadEstado(parcela4));
    
    
    
    
    
    
    /////////// PRACTICA 2 - SESION 1 ///////////
    /////// PRUEBAS HOTELES, CLIENTES Y RESERVAS ///////
    System.out.println("\n\n======== PRUEBAS HOTELES ========");    
    
    Hotel hotel1 = new Hotel("hotel 1", "Granada",5);
    Hotel hotel2 = new Hotel("hotel 2", "Murcia",4);
    Hotel hotel3 = new Hotel("hotel 3","Malaga",3);
    
    System.out.println("En total hay registrados " +hotel1.getNUM_HOTELES() +" hoteles.");
    
    // Le asociamos un director al Hotel 1 y otro al Hotel 2
        
    hotel1.setDirector(new Director("Pepe Garcia Gamiz", 666666666));
    
    hotel2.setDirector(new Director("Maria Teresa GS", 666666666));
    
    System.out.println("El director del hotel1 es " +hotel1.getDirector().getNombre());    
    
    
    // Creamos dos clientes nuevos        
    Cliente cliente1 = new Cliente("2233223T","Carla Perea Rodriguez");
    Cliente cliente2 = new Cliente("2233223T","Pepa Martinez");
    
    // Añadimos dos reservas al cliente1 utilizando ambas clases para cada una. Añadimos una al cliente2
    // Para añadir reservas lo hacemos desde el hotel, NUNCA desde el cliente
    hotel2.addReserva(cliente1,"Diez de enero","Quince de febrero");
    hotel2.addReserva(cliente1,"Dieciseis de octubre","Quince de diciembre");
    hotel2.addReserva(cliente2,"Dieciseis de octubre","Quince de diciembre");
    
    System.out.println("\n\n==== Informacion conseguida usando la clase cliente: ");
    int vecesCliente1 = 0;
    for(int i = 0; i<cliente1.getReservas().size(); i++){              // for que suma el numero de veces que un cliente ha reservado
        vecesCliente1++;
    }
    System.out.println(cliente1.getReservas().get(0).getCliente().getNombre() +" ha reservado " +vecesCliente1 +" veces.");
        
    System.out.println("\n\n==== Informacion conseguida usando la clase hotel: ");
    for(int i = 0; i<hotel2.getReservas().size(); i++){                // for para ver el nombre de los que reservaron en el Hotel2
        
        System.out.println("Uno de los clientes que reservaron en el hotel2 se llama: "
            +hotel2.getReservas().get(i).getCliente().getNombre());
        
    }
    
    
    
    
        
    
    /////////// PRACTICA 2 - SESION 2 ///////////
    System.out.println("\n\n======== PRUEBAS HOTELES Y EMPLEADOS ========");

    // Creamos un empleado   
    Empleado empleado1 = new Empleado("Manolo Perea Hurtado");
    
    // Le añadimos dos trabajos en hotel1 y hotel2, y uno tercero que no se añadirá porque solo puede trabajar en 2 hoteles a la vez
    System.out.println(empleado1.addTrabajo(hotel1));
    System.out.println(empleado1.addTrabajo(hotel2));
    System.out.println(empleado1.addTrabajo(hotel1));               // false, porque ya trabaja en 2 hoteles
    
    int sumaEmpleadosHotel1 = hotel1.getEmpleados().size();
    System.out.println("El numero de empleados del Hotel1 es: " +sumaEmpleadosHotel1);
    
    
    
    System.out.println("\n\n======== PRUEBAS HOTELES Y HABITACIONES ========");
    
    // Vamos a crear varias habitaciones al hotel1
    hotel1.addHabitacion(1,2);
    hotel1.addHabitacion(2,3);
    hotel1.addHabitacion(3,2);
    hotel1.addHabitacion(4,5);
    hotel1.addHabitacion(5,10);
    
    // Probamos el metodo buscarHabitacionCapacidad con distintos parámetros
    System.out.println("La primera habitacion del hotel1 con capacidad para 2 personas es la num.: " +hotel1.buscarHabitacionCapacidad(2));
    System.out.println("La primera habitacion del hotel1 con capacidad para 3 personas es la num.: " +hotel1.buscarHabitacionCapacidad(3));
    System.out.println("La primera habitacion del hotel1 con capacidad para 4 personas es la num.: " +hotel1.buscarHabitacionCapacidad(4));
    System.out.println("La primera habitacion del hotel1 con capacidad para 10 personas es la num.: " +hotel1.buscarHabitacionCapacidad(10));
    System.out.println("La primera habitacion del hotel1 con capacidad para 11 personas es la num.: " +hotel1.buscarHabitacionCapacidad(11));
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}





    