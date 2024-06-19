package ExMat;

public class Atividade01 {

	public static void main(String[] args) {
		String matriz[][] = new String [4][4];
		
		for(int i=0; i< 4; i++) {
			for(int j=3; j>=0; j--) {
				if(i+j<=3) {
					matriz[i][j]= "*";
				}
				else {
					matriz[i][j]=" ";
				}
			}
		}
	}

}
