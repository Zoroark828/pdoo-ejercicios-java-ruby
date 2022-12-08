package modelo;

import java.util.ArrayList;
import java.util.Random;


public class Modelo {
    private static final int PORDEFECTO=4;          // El primer numero será siempre lo que valga esta variable
    private Random generador;
    // Integer es un numero de tipo entero. Es más rapido a la hora de almacenarse y cargarse en la memoria que
    // otros tipos de enteros
    private ArrayList<Integer> coleccion1;
    private ArrayList<Integer> coleccion2;
    
    public Modelo() {
        generador=new Random();
        coleccion1=new ArrayList<>();
        coleccion1.add(PORDEFECTO);
        
        coleccion2=new ArrayList<>();
        coleccion2.add(PORDEFECTO);
        
    }

    public ArrayList<Integer> getColeccion1() {
        return coleccion1;
    }
    
    public ArrayList<Integer> getColeccion2() {
        return coleccion2;
    }
    
    public void añadeElemento1(Integer i) {
        coleccion1.add(i);
    }
    
    public void añadeElemento2(Integer i) {
        coleccion2.add(i);
    }
    
    public void quitaUno() {
        if (coleccion1.size()>0) {
            int pos=generador.nextInt(coleccion1.size());
            coleccion1.remove(pos);
        }
    }
    
}
