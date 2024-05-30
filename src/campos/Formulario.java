package campos;

import java.util.Map;


public class Formulario{
	
	private String nome;
	private Map<String, Map<Enum<utilitarios.Formulario>, Map<Integer, String>>> formularioCampos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Map<String, Map<Enum<utilitarios.Formulario>, Map<Integer, String>>> getCampos() {
		return formularioCampos;
	}
	public void setCampos(Map<Enum<utilitarios.Formulario>, Map<Integer, String>> mapFormulario) {
		this.formularioCampos.put(this.nome, mapFormulario);
	}
	
	
}
