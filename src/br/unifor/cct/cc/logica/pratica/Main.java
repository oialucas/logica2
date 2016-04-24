package br.unifor.cct.cc.logica.pratica;

import java.util.Scanner;

/**
 * 
 * @author Everton Guimaraes
 *
 */
public class atividadepratica {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  String[] matriculas = { "1020", "1042", "1112", "1132", "1152", "1201", "1213", "1232", "1256", "1271" };
  String[] nomes = { "Ailton", "Marlos", "Rebeca", "Marco", "Jane", "Pedro", "Raquel", "Paulo", "Vitor", "Mara" };
  double[][] notas = { { 7.5, 8.9, 6.5 }, { 8.2, 7.3, 9.4 }, { 10.0, 9.6, 7.1 }, { 6.8, 7.5, 8.1 },
    { 8.8, 7.4, 9.2 }, { 8.3, 7.9, 9.0 }, { 7.2, 8.7, 9.8 }, { 8.3, 7.7, 8.9 }, { 7.8, 7.7, 8.5 },
    { 8.0, 7.0, 9.0 } };

  double[] todasAsMedias = MediaAlunos(notas);
  ImprimirTabular(matriculas, nomes, notas, todasAsMedias);
  NomesEMedias(nomes, todasAsMedias);

  Boolean validacaoMatriculaDigitada = false;
  String matriculaDigitada = "";
  
  String buscarmatricula;
  System.out.print("Informe uma matricula a ser conferida: ");
  buscarmatricula = sc.next();
  
   
  
  
  
  do {
   System.out.println("Digite uma matrícula: ");
   matriculaDigitada = sc.nextLine();
   Boolean fazerValidacao = isInt(matriculaDigitada);
   if (fazerValidacao == true) {
    validacaoMatriculaDigitada = true;
   }
  } while (validacaoMatriculaDigitada == false);

  BuscarMatricula(matriculas, matriculaDigitada);
  conferirmatricula (matriculas, buscarmatricula, todasAsMedias, nomes);
 }


	
	 
	 
 
 
 static void ImprimirTabular(String[] matriculas, String[] nomes, double[][] notas, double[] todasAsMedias) {
  for (int i = 0; i < notas.length; i++) {
   System.out.printf("%s  %s\t", matriculas[i], nomes[i]);
   for (int j = 0; j < 3; j++) {
    System.out.printf(" %4.1f", notas[i][j]);
   }

   for (int k = 0; k < 1; k++) {
    System.out.printf(" %4.1f", todasAsMedias[i]);
   }

   System.out.println();
  }
  System.out.println(" ");
 }
 
 
 
 static double[] MediaAlunos(double[][] notas) {
  double[] media = new double[10];
  for (int i = 0; i < media.length; i++) {
   media[i] = (notas[i][0] + notas[i][1] + notas[i][2]) / 3;
   // System.out.println(media[i]);
  }
  // System.out.println("A média dos alunos é: " + media);
  return media;
 }

 static void NomesEMedias(String[] nomes, double[] todasAsMedias) {
  for (int i = 0; i < nomes.length; i++) {
   System.out.printf(" %s\t ", nomes[i]);
   for (int k = 0; k < 1; k++) {
    System.out.printf(" %4.1f \n", todasAsMedias[i]);
   }
  }
  System.out.println();
 }

 public static boolean BuscarMatricula(String[] matriculas, String matriculaDigitada) {

  // Boolean validacaoMatriculaDigitada = isInt(matriculaDigitada);

  // if (validacaoMatriculaDigitada == true) {
  for (int i = 0; i < matriculas.length; i++) {
   if (matriculas[i] == matriculaDigitada) {
    System.out.println("Matrícula está contida no índice" + " " + i);
    return true;
   } else {
    System.out.println("Matricula não está contida no índice" + " " + i);
   }
  }
  // }
  return false;
 }

 public static boolean isInt(String v) {
  /* Verifica se um numero é inteiro ou não */
  try {
   Integer.parseInt(v);
   // System.out.println("É inteiro");
   return true;
  } catch (Exception e) {
   System.out.println("Matrícula não válida!");
   return false;
  }
 }

 
 public static int conferirmatricula (String [] matriculas, String buscarmatricula, double [] media, String [] nomes){
	 int indiceencontrado = 0; 
	 for (int i = 0; i < matriculas.length; i++) {
		if (buscarmatricula == matriculas[i]){
			indiceencontrado = i ;
			System.out.printf("%s\t %4.1f\t %s", nomes[i], media [i], matriculas[i]);
		}else{
			indiceencontrado = -1;
		}
	}
	return indiceencontrado;

 
 }
}
