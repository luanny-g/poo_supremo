package campos;

import java.util.LinkedHashMap;
import java.util.Map;

import utilitarios.Formulario;

public abstract class TodosCampos {

	public static Map <Integer, String> crud() {
		Map<Integer, String> mapa = new LinkedHashMap<>();
		mapa.put(0, "Sair");
		mapa.put(1, "Criar");
		mapa.put(2, "Ler");
		mapa.put(3, "Atualizar");
		mapa.put(4, "Deletar");
		
		return mapa;
	}
	public static Map <Integer, String> modalidade() {
		Map<Integer, String> mapa = new LinkedHashMap<>();
		mapa.put(1, "Programa");
		mapa.put(2, "Projeto");
		mapa.put(3, "Núcleo Temático");
		mapa.put(4, "Evento");
		mapa.put(5, "Empresa Junior");
		mapa.put(6, "Liga Acadêmica");
		mapa.put(7, "Prestação de Serviço");
		mapa.put(8, "Curso");
		mapa.put(9, "Outro");
		return mapa;
	}
	public static Map <Integer, String> eventos() {
		Map<Integer, String> mapa = new LinkedHashMap<>();
		mapa.put(1, "Congresso");
		mapa.put(2, "Simpósio");
		mapa.put(3, "Encontro");
		mapa.put(4, "Exposição");
		mapa.put(5, "Conferência");
		mapa.put(6, "Oficina");
		mapa.put(7, "Workshop");
		mapa.put(8, "Festival");
		mapa.put(9, "Seminário");
		mapa.put(10, "Palestra");
		mapa.put(11, "Feira");
		mapa.put(12, "Fórum");
		mapa.put(13, "Mesa Redonda");
		mapa.put(14, "Semana");
		mapa.put(15, "Outro");
		

		return mapa;
	}
	public static Map <Integer, String> cursos() {
		Map<Integer, String> mapa = new LinkedHashMap<>();
		mapa.put(1, "Inicialização");
		mapa.put(2, "Atualização");
		mapa.put(3, "Formação");
		mapa.put(4, "Qualificação/Aperfeiçoamneto");

		return mapa;
	}
	public static Map <Integer, String> areaExtensaoVinculada() {
		Map<Integer, String> mapa = new LinkedHashMap<>();
		mapa.put(1, "Ciências da Terra");
		mapa.put(2, "Ciências da Vida");
		mapa.put(3, "Ciências Humanas e Ciências Sociais Aplicada");
		mapa.put(4, "Engenharias e Ciências ExatasCiências");

		return mapa;
	}
	
	public static Map <Integer, String> linhaDeExtensao() {
		Map<Integer, String> mapa = new LinkedHashMap<>();
		mapa.put(1, "Cultura");
		mapa.put(2, "Saúde");
		mapa.put(3, "Comunicação");
		mapa.put(4, "Meio Ambiente");
		mapa.put(5, "Educação");
		mapa.put(6, "Trabalho");
		mapa.put(7, "Direitos Humanos e Justiça");
		mapa.put(8, "Tecnologia e Produção");

		return mapa;
	}
	
	public static Map <Enum<utilitarios.Formulario>, Map<Integer, String>> formulario() {
		Map <Enum<Formulario>, Map<Integer, String>> mapa = new LinkedHashMap<>();
		mapa.put(Formulario.MODALIDADE, modalidade());
		mapa.put(Formulario.EVENTOS, eventos());
		mapa.put(Formulario.CURSOS, cursos());
		mapa.put(Formulario.AREA_DE_EXTENSAO_VINCULADA, areaExtensaoVinculada());
		mapa.put(Formulario.LINHA_DE_EXTESAO, linhaDeExtensao());
		return mapa;
	}}
