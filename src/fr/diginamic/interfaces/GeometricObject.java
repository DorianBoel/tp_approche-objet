/**
 * 
 */
package fr.diginamic.interfaces;

/** Liste les méthodes obligatoires que doit posséder un objet géométrique
 * @author DIGINAMIC
 */
public interface GeometricObject {
	
	/** Retourne le périmètre d'une forme géométrique
	 * @return double
	 */
	double perimeter();
	
	
	/** Retourne la surface d'une forme géométrique
	 * @return double
	 */
	double area();
	
	/** Affiche les attributs de la forme géométrique dans la console
	 * @return void
	 */
	void displayInfo();
	
}
