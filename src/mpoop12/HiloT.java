
package mpoop12;

/**
 * Clase para usar el Thread
 * @author daniel y carlos
 * @version 1.0
 */
public class HiloT extends Thread{

    public HiloT(String name) {
        super(name);
    }
  
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Interacion "+i+" de"+getName());
        }
        System.out.println("Termina el hilo "+getName());
    }
    
}
