package fr.diginamic.sets;


import java.util.Arrays;
import java.util.HashSet;
//import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		
		Set<Double> doubleSet = new HashSet<>(
			Arrays.asList(
				1.5,
				8.25,
				-7.32,
				13.3,
				-12.45,
				48.5,
				0.01
			)
		);
		
		System.out.println("Tous les éléments du set: ");
		for (double d : doubleSet) {
			System.out.println(" " + d);
		}
		System.out.println();
		
		double maxInSet = Double.NEGATIVE_INFINITY;
		for (double d: doubleSet) {
			if (d > maxInSet) {
				maxInSet = d;
			}
		}
		System.out.println("Élément du set le plus grand: " + maxInSet);
		System.out.println("");
		
		double minInSet = Double.POSITIVE_INFINITY;
		for (double d: doubleSet) {
			if (d < minInSet) {
				minInSet = d;
			}
		}
		
		if (doubleSet.remove(minInSet)) {
			System.out.println("Élément du set le plus petit supprimé: " + minInSet);
			System.out.println("");			
		};
		
		System.out.println("Tous les éléments du set: ");
		for (double d : doubleSet) {
			System.out.println(" " + d);
		}
		System.out.println();
		
	}
	
}
