package Aula2_view;

import javax.swing.JOptionPane;

import Controller.RedesController;

public class Main {

	 public static void main (String [] args) {
		 
		RedesController Controll = new  RedesController();
		String os = Controll.os();
		System.out.println(os);
		int process = 0;
		
		do{
			process = Integer.parseInt(JOptionPane.showInputDialog(null, ("1 - Exibir Processos \n 2 - Exibir IPv4 \n 3 - Finalizar")));
			
		
		switch (process) {
		case 1: 
			String p = "ipconfig";
		    Controll.readProcess(p);
			   
			break;
		case 2: 
			System.out.println("\n");
			String pingW = "PING -4 -n 10 www.google.com.br";
		    Controll.readTraceRoute(pingW);
			 
	        break;
		case 3: 
			System.out.println("\n Execu��o Finalizada!!");
			break;
		}
		}while (process != 3);
	 }
}
