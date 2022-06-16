package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSetObjects {

	public static void main(String[] args) {
		
		Set<Country> countrySet = new HashSet<>(
			Arrays.asList(
				new Country("USA", 334_805_000, 59_495),
				new Country("France", 65_585_000, 43_551),
				new Country("Allemagne", 83_884_000, 50_206),
				new Country("UK", 68_498_000, 43_620),
				new Country("Italie", 60_263_000, 37_970),
				new Country("Japon", 125_585_000, 42_659),
				new Country("Chine", 1_448_471_000, 16_624),
				new Country("Russie", 145_806_000, 24_789),
				new Country("Inde", 1_406_632_000, 6_571)
			)
		);
		
		int highestGdpCapita = (int) Double.NEGATIVE_INFINITY;
		Country highestGdpCapitaCountry = null;
		for (Country country: countrySet) {
			if (country.getGdpCapita() > highestGdpCapita) {
				highestGdpCapita = country.getGdpCapita();
				highestGdpCapitaCountry = country;
			}
		}
		if (highestGdpCapitaCountry != null) {			
			System.out.println("Pays du set ayant le PIB/habitant le plus grand: " + highestGdpCapitaCountry.getName() + " (" + highestGdpCapitaCountry.getGdpCapita() + ")");
		}
		System.out.println();
		
		long highestTotalGdp = (long) Double.NEGATIVE_INFINITY;
		Country highestTotalGdpCountry = null;
		for (Country country: countrySet) {
			if (country.getTotalGdp() > highestTotalGdp) {
				highestTotalGdp = country.getTotalGdp();
				highestTotalGdpCountry = country;
			}
		}
		if (highestTotalGdpCountry != null) {			
			System.out.println("Pays du set ayant le PIB total le plus grand: " + highestTotalGdpCountry.getName() + " (" + highestTotalGdpCountry.getTotalGdp() + ")");
		}
		System.out.println();
		
		long lowestTotalGdp = (long) Double.POSITIVE_INFINITY;
		Country lowestTotalGdpCountry = null;
		for (Country country: countrySet) {
			if (country.getTotalGdp() < lowestTotalGdp) {
				lowestTotalGdp = country.getTotalGdp();
				lowestTotalGdpCountry = country;
			}
		}
		if (lowestTotalGdpCountry != null) {
			lowestTotalGdpCountry.setName(lowestTotalGdpCountry.getName().toUpperCase());
			System.out.println("On met le nom du pays du set ayant le PIB total le plus petit en majuscules: " + lowestTotalGdpCountry.getName() + " (" + lowestTotalGdpCountry.getTotalGdp() + ")");
		}
		
		countrySet.remove(lowestTotalGdpCountry);
		System.out.println(" On supprime cet élément");
		System.out.println();
		
		System.out.println("Tous les éléments du set: ");
		for (Country country : countrySet) {
			country.displayInfo();
		}
		System.out.println();
	}
	
}
