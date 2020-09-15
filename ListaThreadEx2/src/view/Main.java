/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.Threadid;
/**
 *
 * @author bruno
 */
public class Main {
    public static void main(String[] args) {
        for(int op=0;op<5;op++ ){
            //Threadid threadId =new   Threadid(idThread);
            Thread tid =new  Threadid(op);
            tid.start();
        }
    }
}
