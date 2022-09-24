
package ejerciciofibonacci;

/**
 *
 * @author Juan Antonio Domínguez Rosales
 * Fecha_Elab: 23/09/2022
 * Recuperación 1 
 */
public class EjercicioFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Colocaremos un SOUT para que nos proyecte lo que se esta realizando
        EjercicioFibonacci sucesion = new EjercicioFibonacci();
        //Se realizara la llamada al metodo colocando un parametro para que
        //se detenga
        System.out.println("La sucesión de Fibonacci recursivo de 10 es: " + sucesion.sumaRecursiva(10));

    }
    //Primero se creara nuestro metodo recursivo
    //donde n es el numero por el que querramos saber su sucesión
    public int sumaRecursiva (int n){
        //Crearemos nuestro caso base usando la siguiente formula
        //n = n-1 + n-2
        // Utilizaremos el operador lógico "||" que quiere decir "or" si uno o ambos casos
        // base son verdaderos nos arrojara un true y si ambos casos son falsos nos devolvera
        //false y esto nos servira para cubrir los casos base
        //indicandole si "n-1" va a ser igual a 1 o "n-2" va a ser igual a 0
        //para que pueda iniciarse la suma recursiva
        if (n==1 || n==2){
            //Colocamos un return con valor a 1 ya que nuestro primer digito inicia con 0 y
            //0 vale a 1
            return 1;
        }else{
            return sumaRecursiva(n-1) + sumaRecursiva(n-2);
            //En esta parte nos va a regresar primero el dato que queremos conocer su sucesion
            //y si colocamos "1" la operacion va a tomar a "n" como 1 valor y sumaRecursiva(n-1)
            //lo tomara ya que es el primer valor como lo indica n-1 mientras que n-2 se toma en cuenta
            //el "0" ya que no contiene otro dato y se hace la operación n + n que seria 1 + 0 
        }
    }
}
