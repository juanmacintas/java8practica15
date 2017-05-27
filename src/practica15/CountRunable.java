/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica15;

/**
 *
 * @author juanma
 */
public class CountRunable implements Runnable {
    
    final int count;
    final String threadName;
    
    public CountRunable(int count, String name) {
        this.count = count;
        this.threadName = name;
    }
    
    @Override
    public void run(){
        // TODO code application logic here
        for(int i = 1; i<=count; i++) {
            System.out.printf("Threat: %s %d%n",threadName,i);
        }
    }
    
}
