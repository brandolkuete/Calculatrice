package com.Calculateur.domaine;

public class Nombre {
	
		private int nbre1;
		private int nbre2;
		
		
		//Constructeur
		public Nombre(int nbre1, int nbre2) {
			super();
			this.nbre1 = nbre1;
			this.nbre2 = nbre2;
		}

		// Gettrers et Setters
		public int getNbre1() {
			return nbre1;
		}

		public void setNbre1(int nbre1) {
			this.nbre1 = nbre1;
		}

		public int getNbre2() {
			return nbre2;
		}

		public void setNbre2(int nbre2) {
			this.nbre2 = nbre2;
		}

		@Override
		public String toString() {
			return "Nombres [nbre1=" + nbre1 + ", nbre2=" + nbre2 + "]";
		}
	}


