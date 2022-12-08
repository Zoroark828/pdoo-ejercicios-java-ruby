package ejercicios;

/**
 * Autora: @zoroark828
 * 
 * 
 */

public class Parcela {
      static private final float FACTORALQUILERCALLE = 1.0f,
                                 FACTORALQUILERCASA = 1.0f,
                                 FACTORALQUILERHOTEL = 4.0f;
      
      private String nombre;  
      private float precioCompra, precioEdificar, precioBaseAlquiler;
      private int numCasas, numHoteles;
      
      
      public Parcela (String n, float pc, float pe, float pba){         // Constructor de Parcela
          nombre=n;
          precioCompra=pc;
          precioEdificar=pe;
          precioBaseAlquiler=pba;         
          numCasas=0;
          numHoteles=0;          
      }
      
      public String getNombre(){
          return nombre;
      }
                  
      public float getPrecioCompra(){
          return precioCompra;
      }
      
      public float getPrecioEdificar(){
        return precioEdificar;  
      }
                  
      public int getNumCasas(){
          return numCasas;
      }
      
      public int getNumHoteles(){
          return numHoteles;
      }

      public float getPrecioAlquilerCompleto(){
          float precioAlquiler;          
          precioAlquiler = precioBaseAlquiler * (FACTORALQUILERCALLE + numCasas * FACTORALQUILERCASA + numHoteles * FACTORALQUILERHOTEL);          
          return precioAlquiler;
      }      
      
      public boolean construirCasa(){
          numCasas++;          
          return true;
      }
      
      public boolean construirHotel(){          
          numHoteles++;          
          return true;
      }
            
      public boolean igualdadIdentidad (Parcela otraParcela){          
          return this == otraParcela;
      }
      
      public boolean igualdadEstado (Parcela otraParcela){
          return this.nombre.equals(otraParcela.nombre) &&
                  this.precioCompra == otraParcela.precioCompra &&
                  this.precioEdificar == otraParcela.precioEdificar &&
                  this.numCasas == otraParcela.numCasas &&
                  this.numHoteles == otraParcela.numHoteles &&
                  this.precioBaseAlquiler == otraParcela.precioBaseAlquiler;                 
      }
      
      
      
      
      
      
      
      
      
      
      
}      
      
      
      
      
      
      
      
      
      
   