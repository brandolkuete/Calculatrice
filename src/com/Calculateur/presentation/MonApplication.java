package com.Calculateur.presentation;

import java.util.Scanner;

import com.Calculateur.domaine.Nombre;
import com.Calculateur.service.Calco;

public class MonApplication {

	public static void main(String[] args) {
		
		System.out.println ("Bienvenue dans cette application qui traite l'initiation aux opérations arithmetiques\n");
		
		// Création d'un objet de la classe Scanner
		Scanner sc = new Scanner(System.in);
		Scanner ab = new Scanner(System.in);
		Scanner sco = new Scanner(System.in);
		char reponse ;
		char choix = 'O';
		
		int nombre1;
		int nombre2;
		int somme;
		int difference;
		int produit;
		int quotient;
		
		Calco calculeur= new Calco();
		
		while (choix =='O')
		{
			
		System.out.println("Choisir l'operation: \n");
		System.out.println("taper + pour l'addition");
		System.out.println("taper - pour la soustraction");
		System.out.println("taper * pour la multiplication");
		System.out.println("taper / pour la division");
		
		reponse = sco.nextLine().charAt(0);
		
		switch (reponse)
			{
				  case '+':{
					  
					  System.out.println("Vous avez choisi l'addition \n");
					  
					 System.out.println("donne le premier nombre");
					 nombre1 = sc.nextInt();
					 
					 System.out.println("donne le deuxieme nombre");
					 nombre2 = sc.nextInt();
					 
					 //on appelle ici la méthode addition de la couche service
					 
					 Nombre nombre= new Nombre(nombre1,nombre2);
					 somme= calculeur.addition(nombre);
					 
					 System.out.println(" la somme du premier nombre et du deuxième nombre est : " + somme +"\n"  );
					  
					break;
				  }
				  
				  case '-':{
					  
					System.out.println("Vous avez choisi la soustraction \n");
					  
					System.out.println("donne le premier nombre");
					nombre1 = sc.nextInt();
					
					System.out.println("donne le deuxieme nombre");
					nombre2 = sc.nextInt();
					
					//on appelle ici la méthode soustraction de la couche service
					
					Nombre nombre= new Nombre(nombre1,nombre2);
					 difference= calculeur.soustraction(nombre);
					
					System.out.println(" la difference du premier nombre et du deuxième nombre est : " + difference +"\n" );
					break;
				  }
				  
				  case '*':{
					  
					System.out.println("Vous avez choisi la multiplication \n");
				    System.out.println("donne le premier nombre à multiplier");
					nombre1 = sc.nextInt();
					
					System.out.println("donne le deuxieme nombre à multiplier");
					nombre2 = sc.nextInt();
					
					//on appelle ici la méthode produit de la couche service
					
					Nombre nombre= new Nombre(nombre1,nombre2);
					 produit= calculeur.produit(nombre);
					
					System.out.println(" Le produit de ces deux nombres est : " + produit +"\n" );
					break;
				  }
				  
				case '/':{
					
					System.out.println("Vous avez choisi la division \n");
				    System.out.println("donne le dividende");
					nombre1 = sc.nextInt();
					
					System.out.println("donne le diviseur");  
					nombre2 = sc.nextInt();
					
					//on appelle ici la méthode division de la couche service
					
					Nombre nombre= new Nombre(nombre1,nombre2);
					 quotient= calculeur.division(nombre);
					
					System.out.println(" le quotient est : " + quotient +"\n");
					break;
				  }
			}
	        System.out.println("voulez-vous reessayer?  O/N" );
			choix = ab.nextLine().charAt(0);
	 }
	 
		
		
	    System.out.println("Aurevoir !!!!!");


	}

}
