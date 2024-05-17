package br.tec.abrindoportas.model;
 
public class PacienteModel {
	 
	protected String Exame;
	protected String Resultado;
	
	public PacienteModel() {
		super();

	}
	public PacienteModel(String exame, String resultado) {
		super();
		Exame = exame;
		Resultado = resultado;
	}
	public String getExame() {
		return Exame;
	}
	public void setExame(String exame) {
		Exame = exame;
	}
	public String getResultado() {
		return Resultado;
	}
	public void setResultado(String resultado) {
		Resultado = resultado;
	}
	@Override
	public String toString() {
		return "PacienteModel [Exame=" + Exame + ", Resultado=" + Resultado + "]"; 
	
		}
	public void tipoPeople() {
		// TODO Auto-generated method stub
		
	}
	}
	
	
