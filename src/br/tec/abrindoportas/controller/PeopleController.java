package br.tec.abrindoportas.controller;

import javax.swing.JOptionPane;

import br.tec.abrindoportas.model.PeopleModel;

public class PeopleController { 

	public void CreatPerson() {

		PeopleModel peopleModel = new PeopleModel();

		peopleModel.setFistname(JOptionPane.showInputDialog(null, "Digite o primeiro nome: "));
		peopleModel.setLasteName(JOptionPane.showInputDialog(null, "Digite o ultimo nome: "));
		peopleModel.setCpf(JOptionPane.showInputDialog(null, "Digite o CPF: "));
		peopleModel.setEndereco(JOptionPane.showInputDialog(null, "Digite o Indereço: "));
		peopleModel.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua Idade: ")));
		peopleModel.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu Salario")));
		
     	JOptionPane.showMessageDialog(null, peopleModel);
//
//       System.out.println(peopleModel.toString());
//
//       System.out.println("Nome: " + peopleModel.getFistname() 
//		+ "\nSobre Nome : " + peopleModel.getLasteName()
//		+ "\nCPF: " + peopleModel.getCpf()
//		+ "\nEndereco: " + peopleModel.getEndereco()
//		+ "\nIdade: " + peopleModel.getIdade()
//		+ "\nSlario: " +peopleModel.getSalario());
		
	}

	public void CreatePerson() {
		// TODO Auto-generated method stub
		
	}

}
