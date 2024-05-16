package br.tec.abrindoportas.controller;

import java.util.Scanner;

public class funçoes{		
		//função ira ler um inteiro e mostrar o dia da semana
		public void escolha() {
			int dayweenked = 0;
			Scanner read = new Scanner(System.in); 
			
		    while(dayweenked != 0) { 
		    System.out.println("Dentro do enquanto");
			System.out.println("Digite o dia da semana");
		    System.out.println("1 = Domingo, \n 2 = Segunda,\n 0 = Sair"); 
		    dayweenked = read.nextInt();
		    
		    //Esta estrutura serve para escolher uma opção. Retorna dia da semana
			switch (dayweenked){ 
			case 1 : { 
		    	System.out.println("Domingo"); 
		   	break; 
		   	
		    }	
		    case 2: { 
		    	System.out.println("Segunda"); 
		    	break; 
		    }
		    case 3: { 
		    	System.out.println("Terça"); 
		    	break;
		    }	
		    case 4: { 
		    
		    	System.out.println("Quarta"); 
		    	break;
		    }	
		    case 5: {  
		    
		    	System.out.println("Quinta");  
		    	break;
		    }	
		    case 6: { 
		    	
		    	System.out.println("Sexta"); 
		    	break;
		    }	
		    case 7: { 
		    	
		    	System.out.println("Sabado"); 
		    	break;
		    }	
		    default: { 
		    	System.out.println("Opção escolhida existente"); 
		    }	
			}
		    }
		}
	     }
		     	
		    
		    