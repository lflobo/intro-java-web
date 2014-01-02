package pt.lobo.java.intro.exercise.ex02;

import java.util.Collection;
import java.util.List;

public interface Math {

	/**
	 * Cria uma lista de inteiros contendo os números no intervalo especificado.
	 * @param from Primeiro número na série
	 * @param to Último número na série
	 * @return A lista contendo os números especificados
	 */
	public List<Integer> range(int from, int to);
	
	/**
	 * Devolve o valor médio da amostra fornecida.
	 * @param sample A amostra de números para calcular a média.
	 * @return A média
	 */
	public float average(Collection<Integer> sample);
	
}
