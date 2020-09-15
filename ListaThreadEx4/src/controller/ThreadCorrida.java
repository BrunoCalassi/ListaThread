/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Random;

/**
 *
 * @author bruno
 */
public class ThreadCorrida extends Thread {
    private boolean chegada =false;
    private int sp;
    public ThreadCorrida(int sp) {
        this.sp=sp;
    }
    
    @Override
    public void run() {
        corrida();
    }
    public void corrida(){
        int sp1=0,sp2=0,sp3=0,sp4=0,sp5=0;
        Random rng= new Random();
        for(int i=0;i<=10;i++){
           switch(sp){
        case 0:int rand=rng.nextInt(5)+1;
                sp1=sp1+rand;
                i=sp1;
                System.out.println(getId()+" pulou " + rand);
                break;
        case 1: rand=rng.nextInt(5)+1;
                sp2=sp2+rand;
                i=sp2;
                System.out.println(getId()+" pulou " + rand );
                 break;
        case 2: rand=rng.nextInt(5)+1;
                sp3=sp3+rand;
                i=sp3;
                System.out.println(getId()+" pulou " + rand);
                 break;
        case 3: rand=rng.nextInt(5)+1;
                sp4=sp4+rand;
                i=sp4;
                System.out.println(getId()+" pulou " + rand);
                break;
        case 4: rand=rng.nextInt(5)+1;
                sp5=sp5+rand;
                i=sp5;
                System.out.println(getId()+" pulou " + rand);
                break;
        }
        
        }
        if(sp1>=10||sp2>=10||sp3>=10||sp4>=10||sp5>=10){
            podium(sp1,sp2,sp3,sp4,sp5);
        } 
    }

        public void podium(int sp1,int sp2 ,int sp3,int sp4, int sp5){
            System.out.println("sapo 1 " + sp1);
            System.out.println("sapo 2 " + sp2);
            System.out.println("sapo 3 " + sp3);
            System.out.println("sapo 4 " + sp4);
            System.out.println("sapo 5 " + sp5);
        }
}      
    

    
    

