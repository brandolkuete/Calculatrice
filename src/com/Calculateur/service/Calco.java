package com.Calculateur.service;

import com.Calculateur.domaine.Nombre;

/**
 * @author Brandol
 *Cette classe contient tous les savoir-faire de mon apllication
 */

public class Calco {
		
		/**
		 * @param a
		 * @param b
		 * @return
		 * Cette méthode permet d'additionner deux nombres passés en paramètres
		 */
		public int addition(int a,int b) {
			int resultat;
			
			resultat=a+b;
			return resultat;
		}
	
		/**
		 * @param nombre
		 * Mise en oeuvre de la surchage de methode addition(), celle-ci prendra un seul parametre
		 * @return
		 */
		public int addition(Nombre nombre) {
			int resultat;
			
			resultat=nombre.getNbre1()+nombre.getNbre2();
			return resultat;
		}
		
		/**
		 * @param a
		 * @param b
		 * Cette methode permet de faire la soustraction de deux entiers entrés en parametres
		 * @return
		 */
		public int soustraction(int a,int b) {
			int resultat;
			
			resultat=a-b;
			return resultat;
		}
		
		/**
		 * @param nombre
		 * Mise en oeuvre de la surchage de methode soustraction(), celle-ci prendra un seul parametre
		 * @return
		 */
		public int soustraction(Nombre nombre) {
			int resultat;
			
			resultat=nombre.getNbre1()-nombre.getNbre2();
			return resultat;
		}
		
		/**
		 * @param a
		 * @param b
		 * Cette methode permet de faire le produit de deux entiers entrés en parametres
		 * @return
		 */
		public int produit(int a,int b) {
			int resultat;
			
			resultat=a*b;
			return resultat;
		}
		
		
		/**
		 * @param nombre
		 * Mise en oeuvre de la surchage de methode produit(), celle-ci prendra un seul parametre
		 * @return
		 */
		public int produit(Nombre nombre) {
			int resultat;
			
			resultat=nombre.getNbre1()*nombre.getNbre2();
			return resultat;
		}
		
		/**
		 * @param a
		 * @param b
		 * Cette methode fait la division de deux entiers entrés en parametres
		 * @return
		 */
		public int division(int a,int b) {
			int resultat;
			
			resultat=a/b;
			return resultat;
		}
		
		
		/**
		 * @param nombre
		 * Mise en oeuvre de la surchage de methode division(), celle-ci prendra un seul parametre
		 * @return
		 */
		public int division(Nombre nombre) {
			int resultat;
			
			resultat=nombre.getNbre1()/nombre.getNbre2();
			return resultat;
		}


}
