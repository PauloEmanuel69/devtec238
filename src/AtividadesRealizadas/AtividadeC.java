package AtividadesRealizadas;

import java.util.Scanner;

public class AtividadeC { 
	public void escolha() {
		 // TODO Auto-generated method stub
		 int months;
		 Scanner read = new Scanner(System.in); 
		 // Loop for de 1 a 12
		    for(months = 1; months <= 12; months++) { 
		    	   switch(months) { 
		    	   case 1:
		    		   System.out.println("janeiro:" + "Que este seja o mês em que você transforma sonhos em metas e desejos em realizações."); 
		           break;  
		           
		    	   case 2:
		                System.out.println("Fevereiro:" + "Que a energia do amor e da dedicação inspire suas jornadas neste mês.");
		           break; 
		                
		    	   case 3:
		    		   System.out.println("Março:"+ "Março é o momento de renovar seus compromissos, encontrar novos caminhos e seguir em frente com determinação.");
		           break;  
		           
		    	   case 4:
		                System.out.println("Abril:" + "Assim como a primavera traz renovação à natureza, que abril traga renovação e crescimento para sua vida."); 
		           break; 
		                
		    	   case 5:
		    		   System.out.println("Maio:"+ "Neste mês de flores, que seus projetos floresçam e seus esforços sejam recompensados.");  
		           break;  
		           
		    	   case 6:
		                System.out.println( "Maio:" + "Neste mês de flores, que seus projetos floresçam e seus esforços sejam recompensados."); 
		           break; 
		                
		    	   case 7:
		    		   System.out.println("Julho:" + "Em julho, lembre-se de que cada desafio é uma oportunidade para crescer e se superar.");		 
		           break;  
		           
		    	   case 8:
		                System.out.println("Agosto:" + "Que agosto traga consigo a coragem e a determinação necessárias para alcançar seus objetivos.");
		                break; 
		                
		    	   case 9:
		    		   System.out.println("Setembro:"+ "Setembro é o momento de colher os frutos do seu trabalho árduo e celebrar suas conquistas."); 
		           break;  
		           
		    	   case 10:
		                System.out.println("Outubro:"+ "Que outubro seja um mês de gratidão, reflexão e novas possibilidades."); 	
		                break; 
		                
		    	   case 11:
		    		   System.out.println("Novembro:" + "Em novembro, mantenha-se focado em seus objetivos e avance com determinação.");
		           break;  
		           
		    	   case 12:
		                System.out.println("Dezembro:"+"Que dezembro traga alegria, paz e realizações, e que o novo ano que se aproxima seja ainda mais promissor."); 
		                break; 
		                
		    	   default: 
				    	System.out.println("Opção escolhida existente"); 
		    	   }
		    }
			}
		}  

		        	
	
	