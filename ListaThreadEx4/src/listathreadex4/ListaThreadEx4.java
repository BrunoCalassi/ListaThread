/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listathreadex4;

import controller.ThreadCorrida;
import java.util.Random;

/**
 *
 * @author bruno
 */
public class ListaThreadEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sp=0;
        for(sp=0;sp<5;sp++){
            Thread tSapo =new ThreadCorrida(sp);
            tSapo.start();
        }
    }
    
}
