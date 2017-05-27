/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author juanma
 */
public class Main {
    
    
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
    
        es.submit(new CountRunable(20, "A"));
        es.submit(new CountRunable(20, "B"));
        es.submit(new CountRunable(20, "C"));
        
        es.shutdown();
    }
    
}
