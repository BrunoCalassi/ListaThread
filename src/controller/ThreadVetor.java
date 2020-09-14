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
public class ThreadVetor extends Thread {
        private int n,op;

    public ThreadVetor(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        calc(); 
    }
    private void calc() {
        Random rng= new Random();
        int vetor[]=new int[1000];
        if(op ==1){
            double tempoInicial1 = System.nanoTime(); 
		for(int n: vetor) {
                    int rand =rng.nextInt(100);
                    vetor[n]=rand;
		}
             double tempoFinal1 = System.nanoTime();
		double tempoTotal1= tempoFinal1-tempoInicial1;
		tempoTotal1=tempoTotal1/Math.pow(10, 9);
		System.out.println("Tempo for each " + tempoTotal1+ "s.");   
        }else{
            double tempoInicial = System.nanoTime();  
           for(int i = 0 ; i < vetor.length; i++){
                int rand =rng.nextInt(100);
                    vetor[i]=rand;
        }
		double tempoFinal = System.nanoTime();
		double tempoTotal= tempoFinal-tempoInicial;
		tempoTotal=tempoTotal/Math.pow(10, 9);
		System.out.println("Tempo for " + tempoTotal+ "s.");
        } 
        }
    }
        

