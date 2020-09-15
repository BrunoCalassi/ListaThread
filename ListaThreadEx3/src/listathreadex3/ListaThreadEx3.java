/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listathreadex3;

import controller.TreadSoma;
import java.util.Random;

/**
 *
 * @author bruno
 */
public class ListaThreadEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rng= new Random();
        int matriz[][]=new int[3][5];
        int v[]=new int[5];
        for(int l=0;l<=2;l++){
            for(int c=0;c<5;c++){
                int rand=rng.nextInt(100);
                matriz[l][c]=rand;
                if (l==0){
                    for( c=0;c<5;c++){
                        v[l]+=matriz[0][c];
                    }   
                    
                }if (l==1){
                    for( c=0;c<5;c++){
                        v[l]+=matriz[1][c];
                    } 
                   
                }if (l==2){
                    for( c=0;c<5;c++){
                        v[l]+=matriz[2][c];
                    } 
                    
                }
                
            }
            Thread tSoma =new  TreadSoma(v,l);
            tSoma.start();
        }
    }
    
}
