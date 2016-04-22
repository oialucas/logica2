package br.unifor.cct.cc.logica.pratica;

/**
 * 
 * @author Everton Guimaraes
 *
 */
public class Main {

	public static void main(String[] args) {
		//Q01
		int [] matriculas = new int [1020, 1042, 1112, 1132, 1152, 1201, 1213, 1232, 1256, 1271];
		String [] nomes = new String [Ailton, Marlos, Rebeca, Marco, Jane, Pedro, Raquel, Paulo, Vitor, Mara];
		doubles [][] notas = {{7.5 8.9 6.5}, {8.2 7.3 9.4} , {10.0 9.6 7.1} , 
							 {6.8 7.5 8.1} , {8.8 7.4 9.2} , {8.3 7.9 9.0} ,
							 {7.2 8.7 9.8} , {8.3 7.7 8.9} , {7.8 7.7 8.5}, {8.0 7.0 9.0}};
		

	}
	
	//Q02 e Q03
	ImprimirTabular (matriculas, nomes, notas);
	}

	static void ImprimirTabular (int []matriculas, String []nomes, double [][] notas ){
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("%d  %s\t", matriculas[i], nomes[i]);
			for (int j = 0; j < 3; j++) {
				System.out.printf(" %4.1f", notas[i][j]);
				
			}
			System.out.println();
		}
	}

}
