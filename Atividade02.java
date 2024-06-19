package ExMat;

public class Atividade02 {

	public static void main(String[] args) {
		char m [][] = {
				{'a','b','c','d','e'},
				{'f','g','h','i','j'},
				{'k','l','m','n','o'},
				{'p','q','r','s','t'},
		};
		System.out.println("Matriz A");
		for(char [] Letra:m) {
			for(char coluna:Letra) {
				System.out.print(coluna+"\t");
			}System.out.println(" ");
		}
		int nm [][]= {
				{19,25,100,99},
				{10,7,25,14},
				{35,2,47,74},
		};
		System.out.println("Matriz B");
		for(int [] Numeros:nm) {
			for(int coluna:Numeros) {
				System.out.print(coluna+"\t");
			}System.out.println(" ");
		}
		double n2 [][]= {
				{1.9,2.5,10.0},
				{1.0,7.8,2.5},
				{3.5,2.2,4.7},
		};
		System.out.println("Matriz c");
		for(double [] Numero:n2) {
			for(double coluna:Numero) {
				System.out.print(coluna+"\t");
			}System.out.println(" ");
		}

	}
}
