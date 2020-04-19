package matrix;

public class MatrixBoundaryTraversal {

	public static void main(String[] args) {

		int arr[][] = {
				{26,27,28,29,30},
				{31,32,33,34,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		printBoundayOfMatrix(arr, 5,5);

	}

	private static void printBoundayOfMatrix(int[][] arr, int r,int c) {



		if(r==1) {
			//When matrix have only 1 row
			for(int i =0;i<c;i++) {
				System.out.println(arr[0][c]);
			}
		}else if(c==1) {
			//When matrix have only 1 column	

			for(int i =0;i<c;i++) {
				System.out.println(arr[0][c]);
			}
		}else {
			for(int i=0;i<c;i++)
				System.out.print(arr[0][i]+" ");

			for(int i=1;i<r;i++)
				System.out.print(arr[i][c-1]+" ");

			for(int i=c-2;i>=0;i--)
				System.out.print(arr[r-1][i]+" ");

			for(int i=r-2;i>0;i--)
				System.out.print(arr[i][0]+" ");
		}
	}

}
