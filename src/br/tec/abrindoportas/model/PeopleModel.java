package br.tec.abrindoportas.model;

public class PeopleModel {

	String fistname;
    String lasteName;
    String cpf;
	int idade;
	String endereco;
	double salario;
	
	public PeopleModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PeopleModel(String fistname, String lasteName, String cpf, int idade, String endereco, double salario) {
		super();
		this.fistname = fistname;
		this.lasteName = lasteName;
		this.cpf = cpf;
		this.idade = idade;
		this.endereco = endereco; 
		this.salario = salario;
	}

	public String getFistname() {
		return fistname;
	}

	public void setFistname(String fistname) {
		this.fistname = fistname;
	}

	public String getLasteName() {
		return lasteName;
	}

	public void setLasteName(String lasteName) {
		this.lasteName = lasteName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}		
			public double getSalario() {
				return salario; 
			}			
				public void setSalario(double string) {
					this.salario = string; 
		}

				@Override
				public String toString() {
					return "People [fistname=" + fistname + ", lasteName=" + lasteName + ", cpf=" + cpf + ", idade="
							+ idade + ", endereco=" + endereco + ", salario=" + salario + "]";
				}


}
	
	
	
	
	

