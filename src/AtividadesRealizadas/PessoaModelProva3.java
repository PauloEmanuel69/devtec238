package AtividadesRealizadas;

public class PessoaModelProva3 { 
	String Name;
	String CPF;
	String Endereco;
	public PessoaModelProva3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PessoaModelProva3(String name, String cPF, String endereco) {
		super();
		Name = name;
		CPF = cPF;
		Endereco = endereco;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	@Override
	public String toString() {
		return "PessoaModelProva3 [Name=" + Name + ", CPF=" + CPF + ", Endereco=" + Endereco + "]";
	} 
	
	
	

}
