package fluxo;

import java.util.Map;

import campos.TodosCampos;
import controle.Saida;
import utilitarios.InterfaceRicardo;

public abstract class Criar  implements InterfaceRicardo{

	public static void iniciar() {
		for(Map.Entry<Enum<utilitarios.Formulario>, Map<Integer, String>> map : TodosCampos.formulario().entrySet()) {
			Saida.mostrarMap(map.getValue());
		}
		
	}
}
