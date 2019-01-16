package w1d2_partA;

import java.util.List;

public class PartA {

	public static void main(String[] args) {
		Mapper m = new Mapper();
		List<Pair<String, Integer>> m_output = m.map("./input/testDataForW1D1.txt");
		System.out.println("Mapper output:");
		System.out.println("===========================");
		m_output.forEach(p -> System.out.println("(" + p.getKey() + ", " + p.getValue() + ")"));
		System.out.println("===========================");
		System.out.println("\nReducer Input");
		System.out.println("===============");
		Reducer r = new Reducer();
		List<Pair<String, Integer>> r_output = r.reduce(m_output);	
		System.out.println("\nReducer output:");
		System.out.println("===========================");
		r_output.forEach(p -> System.out.println("(" + p.getKey() + ", " + p.getValue() + ")"));
	}

}
