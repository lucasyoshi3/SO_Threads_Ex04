package controller;
import java.util.*;

public class ThreadsSapos extends Thread {
	private String sapo;
	private static String []colocacao=new String[5];
	static int i=-1;
	
	public ThreadsSapos(int i) {
		switch(i) {
			case 1: sapo="Roberto";break;
			case 2: sapo="Luiz";break;
			case 3: sapo="Edson";break;
			case 4: sapo="Evandro";break;
			case 5: sapo="Marcio";break;
		}
	}
	
	public void run() {
		corrida();
		i++;
		colocacao[i]=sapo;
		if(i==4) {
			System.out.println("=========================================================");
			System.out.println("Resultado da corrida de sapos");
			System.out.println("---------------------------------------------------------");
			for(i=0;i<=4;i++) {
				System.out.println("Nome do sapo: "+colocacao[i]+";"+(i+1)+" Colocacao: ");
			}
			System.out.println("=========================================================");
		}
	}
	
	private void corrida() {
		int distancia=0;
		int salto;
		Random random=new Random();
		while(distancia<10) {
			salto=random.nextInt(3);
			distancia=distancia+salto;
			System.out.println((sapo)+" saltou "+salto+"m: "+distancia+"m");
			try {
				sleep((int)Math.random()*9000+1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		
	}
	
}
