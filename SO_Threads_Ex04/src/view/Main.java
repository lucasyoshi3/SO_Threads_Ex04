package view;
import controller.ThreadsSapos;
import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
		for(int i=1;i<=5;i++) {
			Thread threadsSapos=new ThreadsSapos(i);
			threadsSapos.start();
		}
	}
}
