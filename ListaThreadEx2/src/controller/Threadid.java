/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author bruno
 */
public class Threadid extends Thread{
    private int op;
    public Threadid(int op) {
        this.op=op;
    }

    @Override
    public void run() {
        Id();
    }
    public void Id(){
       int id;
       switch(op){
            case 0:  id = (int) getId();
                    break;
            case 1:  id = (int) getId();
                    break;
            case 2:  id = (int) getId();
                    break;
            case 3:  id = (int) getId();
                    break;  
            case 4: id = (int) getId();
                    break;
        }
          System.out.println("TID#"+ getId());
    }
}
