package mpoop12;

/**
 * Esta es la clase Principal para probar todas las actividades borrar los comentarios para cada actividad
 * @author daniel y carlos
 * @version 1.0
 * 
 */
public class MPOOP12 {
 
    public static void main(String[] args) {
        
       /* Primera actividad con el uso de Thread
        
        HiloT hilo1= new HiloT("Primer hilo");
        hilo1.start();
        new HiloT("Segundo hilo").start();
        System.out.println("Termina hilo principal");
        
        */
        
        /* Segunda actividad con el uso de Runnable
       
        new Thread(new HiloR(), "Primer Hilo").start();
        new Thread(new HiloR(), "Segundo Hilo").start();
        System.out.println("Termina el hilo principal");
        */
        
        /* Tercera activdad con el uso de ThreadGroup
        ThreadGroup grupoHilos= new ThreadGroup("Grupo de hilos");
        Thread hilo1= new HiloAgrupado(grupoHilos, "Hilo 1");
        Thread hilo2= new HiloAgrupado(grupoHilos, "Hilo 2");
        Thread hilo3= new HiloAgrupado(grupoHilos, "Hilo 3");
        Thread hilo4= new HiloAgrupado(grupoHilos, "Hilo 4");
        Thread hilo5= new HiloAgrupado(grupoHilos, "Hilo 5");
        */
        
        /* Cuarta Actividad haciendo prioridades con los hilos
        
        System.out.println("Priorodad del grupo = "+grupoHilos.getMaxPriority());
        hilo3.setPriority(Thread.MAX_PRIORITY);
        grupoHilos.setMaxPriority(Thread.NORM_PRIORITY);
         
        System.out.println("Priorodad del grupo = "+grupoHilos.getMaxPriority());
        System.out.println("Prioridad del Thread 1="+hilo1.getPriority());
        System.out.println("Prioridad del Thread 2="+hilo2.getPriority());
        System.out.println("Prioridad del Thread 3="+hilo3.getPriority());
        System.out.println("Prioridad del Thread 4="+hilo4.getPriority());
        System.out.println("Prioridad del Thread 5="+hilo5.getPriority());
        */
        
       
        /* Haciendo iniciar los hilos para la actividad 3 y 4 
         //LLamando uno por uno los objetos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        */
        
        /* Uso del metodo para la actividad 3  
        listaHilos(grupoHilos);
        */
        
        new Cuenta("Acceso 1").start();
        new Cuenta("Acceso 2").start();
        new Cuenta("Extraer 1").extraerDinero(50);
        new Cuenta("Deposito 1").depositarDinero(100);
        new Cuenta("Deposito 2").depositarDinero(100);
        new Cuenta("Extraer 2").extraerDinero(50);
        
        System.out.println("Termina el hilo principal");
    }
    
    
    private static void listaHilos(ThreadGroup grupoHilos){
        
        System.out.println("Entrando a lista");
        int numHilos;
        Thread[] ListaDeHilos;
        try{
        numHilos= grupoHilos.activeCount();
        ListaDeHilos= new Thread[numHilos];
        grupoHilos.enumerate(ListaDeHilos);
        
        System.out.println("Hilos Activos = "+numHilos);
        
        for (int i = 0; i < numHilos; i++) {
            System.out.println("Hilos activos en posicion "+i+" = "+ListaDeHilos[i].getName());
        }
        }catch(NullPointerException npe){
            System.out.println("Todos los hilos terminaron antes de tiempo");
        
        }
    }
}
