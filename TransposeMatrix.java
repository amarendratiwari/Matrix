package matrix;

public class TransposeMatrix {

	public static void main(String[] args) {

		int arr[][] = {
				{26,27,28,29,30},
				{31,32,33,34,35},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};

		printTransposeMatrix(arr, 5, 5);

	}

	private static void printTransposeMatrix(int[][] arr, int r, int c) {

		for(int i=0; i<r;i++) {
			for(int j=i+1;j<c;j++) {
				int temp = arr[i][j];	
				arr[i][j]= arr[j][i];
				arr[j][i] = temp;
			}
		}

		for(int i=0; i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}

