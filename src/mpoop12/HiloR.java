package mpoop12;

/**
 * Clase para usar la interfaz Runnable
 * @author daniel y carlos
 * @version 1.0
 */
public class HiloR implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteracion "+i+" de "+ Thread.currentThread().getName());
        }
        System.out.println("Termina el "+Thread.currentThread().getName());
    }
    
}
