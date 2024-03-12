//Nome: David Guilherme Barchin Denunci RM: 98603
//Nome: Manoella Herrerias Waideman RM: 98906

package br.com.fiap;

public class Geometria {

	private float base, altura;
	private double raio;
	
	public float getBase() {
		return base;
	}
	
	public void setBase(float base) {
		try {
			if (base >= 0.0 && base <= 100.0 ) {
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
			if (altura >= 0.0 && altura <= 100.0 ) {
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
			if (raio >= 0.0 && raio <= 100.0 ) {
				this.raio = raio;
			} else {
				throw new Exception ("Raio fora do limite. (0 até 100)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void calcularAreaQuadrado() {
		float areaQuad;
		areaQuad = (base * base);
		System.out.println("A área do quadrado é: " + areaQuad);
	}
	
	public void calcularAreaRetangulo() {
		double areaRet;
		areaRet = (base * altura);
		System.out.println("A área do retângulo é: " + areaRet);
	}
	
	public void calcularAreaTriangulo() {
		double areaTri;
		areaTri = ((base * altura)/2 );
		System.out.println("A área do triângulo é: " + areaTri);
	}
	
	public void calcularAreaCirculo() {
		double PI = 3.14, areaCir = 0.00;
		areaCir = (PI * (raio * raio));
		System.out.println("A área do circulo é: " + areaCir);
	}
	
}
