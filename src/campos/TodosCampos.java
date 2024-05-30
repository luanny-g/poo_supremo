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
		mapa.put(1, "teste1");
		mapa.put(2, "teste2");

		return mapa;
	}
	public static Map <Integer, String> cursos() {
		Map<Integer, String> mapa = new LinkedHashMap<>();
		mapa.put(1, "teste1");
		mapa.put(2, "teste2");

		return mapa;
	}
	public static Map <Integer, String> areaExtensaoVinculada() {
		Map<Integer, String> mapa = new LinkedHashMap<>();
		mapa.put(1, "teste1");
		mapa.put(2, "teste2");

		return mapa;
	}
	public static Map <Enum<utilitarios.Formulario>, Map<Integer, String>> formulario() {
		Map <Enum<Formulario>, Map<Integer, String>> mapa = new LinkedHashMap<>();
		mapa.put(Formulario.MODALIDADE, modalidade());
		mapa.put(Formulario.EVENTOS, eventos());
		mapa.put(Formulario.CURSOS, cursos());
		mapa.put(Formulario.AREA_DE_EXTENSAO_VINCULADA, areaExtensaoVinculada());

		return mapa;
	}}
