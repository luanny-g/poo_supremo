package controle;

import java.util.Map;

public abstract class Saida {
	
	public static <K, V> void mostrarMap(Map<K, V> map) {
		for(Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
	public static void mostrarString(String string) {
		System.out.println(string);
	}
	public static <K, V> void mostrarFormulario(Map<K, V> map) {
		for(Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
	public static <K, V> void mostrarGaveta(Map<K, V> map) {
		for(Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
