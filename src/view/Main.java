/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ThreadVetor;

/**
 *
 * @author bruno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      for(int op=1;op<=2;op++ ){
            Thread tCalc =new   ThreadVetor(op);
            tCalc.start();
        }
    }
    
}
