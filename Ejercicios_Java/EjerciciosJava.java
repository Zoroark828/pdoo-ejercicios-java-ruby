
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
    
    
    
    
    
    
    
    }
}





    