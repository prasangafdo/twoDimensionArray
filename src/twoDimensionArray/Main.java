package twoDimensionArray;

public class Main {

	public static void main(String[] args) {
		int[][] Array = new int[2][2];
		
	Array[0][0] = 10;
	Array[0][1] = 30;
	Array[1][0] = 70;
	Array[1][1] = 100;
			
	for(int i=0;i<Array.length;i++) {
		for(int j=0;j<Array.length;j++) {
			System.out.println(Array[i][j]);
		}
	}
	}
}
