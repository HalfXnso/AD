/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodetenerhilo;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class EjemploDetenerHilo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hilo[]misHilos = new Hilo[3];
        for (int i = 0; i < misHilos.length; i++) {
            misHilos[i] = new Hilo();
            misHilos[i].start();
        }

    }

}

class Hilo extends Thread {

    @Override
    public void run() {
        double probabilidad;
        for (int i = 0; i < 10; i++) {
            if (!isInterrupted()) {
                System.out.println("Hilo: "+ this.getName()+" - "+i);
                probabilidad = Math.random();
                if(probabilidad< 0.30){
                    System.out.println("Hilo: "+this.getName()+" detenido");
                    interrupt();
                }
            }
            
        }

    }

}
