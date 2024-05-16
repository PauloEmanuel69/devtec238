package br.tec.abrindoportas.principal;

import br.tec.abrindoportas.controller.Funcoes;
import br.tec.abrindoportas.controller.PeopleController;
import br.tec.abrindoportas.model.PeopleModel;

public class principal { 

	public static void main(String[] args) { 
		
		PeopleController peopleController = new PeopleController();
			peopleController.CreatePerson(); { 
		
		PeopleModel peopleModel = new PeopleModel();
		peopleModel.toString();
		peopleController.CreatePerson();
		
		Funcoes func = new Funcoes();
		func.escolha();
		
		//atividade func1 = new atividade();
		//func1.atividade();
		
		//VideoLocadora func2 = new VideoLocadora();
		//func2.locar(); 
		
	
	}  
}}