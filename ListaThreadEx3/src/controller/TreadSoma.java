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
public class TreadSoma extends Thread {
    private  int v[]=new int[5];
    private int l;
    public TreadSoma(int v[],int l) {
        this.l = l;
        this.v=v;
    }

    
    
    
    @Override
    public void run() {
         soma();
    }
    public void soma(){
        int sum=0;
        switch(l){
            case 0:sum=v[l];
                    break;
            case 1:sum=v[l];
                    break;
            case 2:sum=v[l];
                    break;    
        }
       System.out.println("TID#"+ getId() +" --->"+ sum);      
    }
}
