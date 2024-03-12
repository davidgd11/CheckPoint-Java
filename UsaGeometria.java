package br.com.fiap;

import java.util.Scanner;

public class UsaGeometria {

	public static void main(String[] args) {
		
		Geometria geo = new Geometria();
		
		int escolha = 0;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("\n Faça sua escolha: "
					+ "\n(1) Calcular área do quadrado."
					+ "\n(2) Calcular a área do retângulo."
					+ "\n(3) Calcular a área do triângulo."
					+ "\n(4) Calcular a área do circulo.");
			escolha = scan.nextInt();
			
			if (escolha == 1) {
				System.out.println("Digite o valor do lado do quadrado: ");
				geo.setBase(scan.nextFloat());
				geo.calcularAreaQuadrado();
			} else if (escolha == 2) {
				System.out.println("Digite o valor da base e da altura do retângulo: ");
				geo.setBase(scan.nextFloat());
				geo.setAltura(scan.nextFloat());
				geo.calcularAreaRetangulo(); 
			} else if (escolha == 3) {
				System.out.println("Digite o valor da base e da altura do triângulo: ");
				geo.setBase(scan.nextFloat());
				geo.setAltura(scan.nextFloat());
				geo.calcularAreaTriangulo(); 
			} else if (escolha == 4) {
				System.out.println("Digite o valor do raio do circulo: ");
				geo.setRaio(scan.nextDouble());
				geo.calcularAreaCirculo();
			} else {
				System.out.println("Opção incorreta.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		}
		
	}

