package br.com.fiap;

public class Geometria {

		private float base, altura;
		private double raio;
		
		public float getBase() {
			return base;
		}
		
		public void setBase(float base) {
			try {
				if (base >= 0.0f && base <= 100.0f ) {
					this.base = base;
				} else {
					throw new Exception ("Base fora do limite. (0 até 100)");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		
		public float getAltura() {
			return altura;
		}
		
		public void setAltura(float altura) {
			try {
				if (altura >= 0.0f && altura <= 100.0f ) {
					this.altura = altura;
				} else {
					throw new Exception ("Altura fora do limite. (0 até 100)");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public double getRaio() {
			return raio;
		}
		public void setRaio(double raio) {
			try {
				if (raio >= 0.0f && raio <= 100.0f ) {
					this.raio = raio;
				} else {
					throw new Exception ("Raio fora do limite. (0 até 100)");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void calcularAreaQuadrado(float base) {
			setBase(base);
			float areaQuad = (getBase() * getBase());
			System.out.println("Base: " + getBase());
			System.out.println("A área do quadrado é: " + areaQuad);
		}
		
		public void calcularAreaRetangulo(float base, float altura) {
			float areaRet = (getBase() * getAltura());
			System.out.println("Base: " + getBase());
			System.out.println("Altura: " + getAltura());
			System.out.println("A área do retângulo é: " + areaRet);
		}
		
		public void calcularAreaTriangulo(float base, float altura) {
			float areaTri = ((getBase() * getAltura())/2 );
			System.out.println("Base: " + getBase());
			System.out.println("Altura: " + getAltura());
			System.out.println("A área do triângulo é: " + areaTri);
		}
		
		public void calcularAreaCirculo(double raio) {
			final double PI = 3.1416;
			setRaio(raio);
			double areaCir = (PI * (getRaio() * getRaio()));
			System.out.println("Raio: " + getRaio());
			System.out.println("A área do circulo é: " + areaCir);
		}
		
	}

