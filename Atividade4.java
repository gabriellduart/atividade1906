package ExMat;

public class Atividade4 {

	public static void main(String[] args) {
		int a[][] = new int [3][3];
		int b[][] = new int [3][3];
		int c[][] = new int [3][3];

		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				a[i][i] = (int)Math.round(Math.random()*100);
				b[i][i] = (int)Math.round(Math.random()*100);
				c[i][j]=b [i][j]*a[i][j];
			}
		}System.out.println("Matriz A");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("["+a[i][j]+"]");

			}
			System.out.println("\n-------------");

			System.out.println("Matriz B");
			for( i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					System.out.print("["+b[i][j]+"]");
				}
				System.out.println("\n-------------");

				System.out.println("Matriz C");
				for( i=0; i<3; i++) {
					for(int j=0; j<3; j++) {
						System.out.print("["+c[i][j]+"]");
					}
					System.out.println("\n-------------");
				}
}}}}