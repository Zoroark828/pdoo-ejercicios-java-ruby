
package ejercicios;

import java.util.ArrayList;

/**
 * Autora: @zoroark828
 * 
 */

public class MainEjercicios {
    public static void main(String[] args){
        /* 1. REUTILIZACIÓN
        Cuando las funcionalidades de un método de la clase hija son exactamente iguales que
        funcionalidades de ese método en la clase padre, la herencia nos permite usar directamente
        el método del padre.
        
        Crea un nuevo proyecto EjerciciosJavaP4, y un paquete ejercicios donde estará el programa
        principal. Crea una clase Casilla, que solo tenga un atributo privado “nombre”, un
        constructor que inicialice el nombre de la Casilla con el argumento pasado y un método de
        paquete recibeJugador sin argumentos, que solo imprima por pantalla una frase indicando
        que ha recibido un jugador y devuelva true. Crea otra clase CasillaCalle que herede de
        Casilla y que además tenga otro atributo privado de tipo entero “numCasas”. Asegúrate de
        crear el constructor.
        
        Crea un programa principal, dentro de él crea un objeto casilla y un objeto casillaCalle y que
        ambos llamen al método recibeJugador. Observa que la casillaCalle utiliza el método de la
        clase padre. ¿Por qué?
        */
        Casilla casilla = new Casilla("Casilla");
        CasillaCalle calle = new CasillaCalle("Calle",2);
        
        //casilla.recibeJugador();
        //calle.recibeJugador();
        /*
        calle utiliza el metodo de la clase padre porque no hemos redefinido recibeJugador() en CasillaCalle,
        así que usa el metodo tal y como lo heredó
        */
        
        
        
        
        
        /*
        2. REDEFINICION COMPLETA
        Cuando las funcionalidades de un método de la clase padre y de la clase hija son 
        completamente distintas y no se puede reutilizar código se usa la redefinición completa del
        método. Ahora comenta el método recibeJugador de la clase casillaCalle, y vuelve a
        escribirlo, de manera que no reutilice el código de la clase padre. En este caso sacará por
        pantalla “Soy una casilla calle y he recibido un jugador”, y devolverá true. Ejecuta el
        programa principal, y comprueba que la salida por pantalla es la esperada. ¿Qué método
        recibeJugador ha ejecutado el objeto de CasillaCalle, el de su clase, o el de la clase padre? 
        */        
        //casilla.recibeJugador();
        //calle.recibeJugador();
        /*
        Ahora calle.recibeJugador() imprime Soy una casilla calle y he recibido un jugador, porque
        hemos redefinido el metodo en la subclase.
        */
        
        
        
        
        
        
        /*
        3. REDEFINICION PARCIAL
        Cuando las funcionalidades de un método de la clase hija comparte todas las
        funcionalidades de la clase padre y alguna más, se redefine el método parcialmente para
        reutilizar código del padre y añadirle algo más.
        
        Ahora reescribe el método recibeJugador de la clase casillaCalle del ejercicio anterior, de
        manera que reutilice el código del padre y, si el método del padre devuelve true, además
        escriba por pantalla “y además soy una casilla calle” y devuelva true, en caso contrario
        devolverá false. Pon un comentario arriba de este método que ponga “//reutilizando código
        del padre”. Ejecuta el programa principal, y comprueba que la salida por pantalla es la
        esperada. ¿Qué método recibeJugador ha ejecutado el objeto de CasillaCalle, el de su clase,
        o el de la clase padre? 
        */
        //casilla.recibeJugador();
        //calle.recibeJugador();
        /*
        calle ha ejecutado el metodo recibeJugador() de su clase, porque nuevamente, lo hemos redefinido. Dentro
        de este metodo usaba el de la clase padre.
        */
        
        
        
        
        
        
        /*
        4. METODOS PROPIOS Y CASTING
        Ahora crea un método nuevo en CasillaCalle que se llame construirCasa, que simplemente
        añada una casa al atributo numCasas e imprima por pantalla el numero de casas que tiene.
        
        En el programa principal haz que el objeto casilla intente llamar al método construirCasa, y
        verás que te da un error sintáctico. Luego intenta que el objeto CasillaCalle llame al método
        construirCasa y comprueba que puedes ejecutarlo y que la salida es la esperada.
        */
        
        //casilla.construirCasa();      // Da error, el metodo es de su clase hija, no de ella.
        calle.construirCasa();          // No da error, porque el metodo le pertenece
        System.out.println("\n");
        
        /*
        En el programa principal crea un arrayList llamado tablero con las dos casillas que tienes
        (una de tipo Casilla y una de tipo CasillaCalle). Piensa de qué tipo tienes que crear los
        objetos del array. Ahora intenta llamar al método construirCasa con cada uno de los
        elementos del array. Por ejemplo, el código tablero.get(0).construirCasa(), ¿qué errores te
        da? ¿se puede construir una casa en una casilla de tipo Casilla? ¿Y en una casilla de tipo
        CasillaCalle? ¿cómo solucionar el error de compilación para construir una casa en una
        casillaCalle?*/
        ArrayList<Casilla> tablero = new ArrayList();           // ArrayList Casilla porque las calles tambien serán casillas
        tablero.add(casilla);
        tablero.add(calle);
        
        //tablero.get(0).construirCasa();       // Error, el metodo no es de la clase casilla
        //tablero.get(1).construirCasa();
        // Error, aunque este elemento del array es del tipo CasillaCalle, como el array es del tipo Calle, no nos deja construir una casa.
        
        // Lo que si nos dejaría es usar el metodo recibeJugador en ambas
        tablero.get(0).recibeJugador();
        tablero.get(1).recibeJugador();
        // Esto se debe a que si declaramos un objeto Casilla obj = new CasillaCalle("Ejemplo",3), este podrá
        // acceder solamente a los metodos sobreescritos de la clase hija, y no a los propios.
        
        System.out.println("\n");
        
        // Volviendo al metodo construir casa, para poder hacerlo tenemos que usar un CASTING:
        ((CasillaCalle) tablero.get(1)).construirCasa();
        
        System.out.println("\n\n");
        
        /*
        Crea un objeto casilla1 de tipo CasillaCalle y una variable casilla2 de tipo Casilla y asígnale el valor casilla1. 
        Luego llama al método recibeJugador desde casilla1 y casilla2. ¿Qué ha pasado? ¿Qué método ejecuta cada
        una? ¿el del padre o el del hijo? ¿por qué?
        Luego llama al método construirCasa desde ambas ¿Qué ocurre? ¿necesitas hacer algún
        casting? ¿Cuántas casas tienes al final? ¿por qué?
        */
        
        CasillaCalle casilla1 = new CasillaCalle ("Casilla 1",0);
        Casilla casilla2 = casilla1;    // casilla2 apunta a casilla1
        
        casilla1.recibeJugador();
        casilla2.recibeJugador();
        // Ambas ejecutan el metodo de la clase hija, porque casilla2 apunta tambien a casilla1
        
        System.out.println("\n");
        
        casilla1.construirCasa();
        ((CasillaCalle) casilla2).construirCasa();
        // En este caso si hay que usar casting con la segunda, porque la clase Casilla no tiene el metodo construirCasa
        // y casilla2 es de tipo casilla apuntando a un objeto CasillaCalle. Es la misma situacion que con el tablero.
        // Además, como apuntan al mismo objeto, al ejecutar dos veces construirCasa, estamos construyendo dos casas. Por eso tiene esa salida.
        
        
        
        
        
        
        
        
        
    }
}
