package mpoop12;

/**
 * Clase para usar los ThreadGroup
 * @author daniel y carlos 
 * @version 1.0
 */
public class HiloAgrupado extends Thread {
    
    public HiloAgrupado(ThreadGroup group,String name) {
        super(group,name);
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteracion "+i+" de "+getName());
        }
        System.out.println("Ha terminalo el hilo"+getName());
    }
    
}
