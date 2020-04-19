package matrix;


public class SpiralTraversal {

	public static void main(String[] args) {

		int arr[][] = {
				{26,27,28,29,30},
				{31,32,33,34,35},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};

		spiralMatrix(arr, 5, 5);

	}
	private static void spiralMatrix(int[][] arr, int r, int c) {
		int top= 0;
		int bottom = r-1;
		int left=0;
		int right =c-1;

		while(top<=bottom && left<=right) {
			//Printing left to right
			for(int i =left;i<=right;i++) {
				System.out.print(arr[top][i]+" ");

			}
			top++;
			//printing top to bottom
			for(int i=top;i<=bottom;i++) {
				System.out.print(arr[i][right]+" ");

			}
			right--;
			//check in case of one row left, printing right to left
			if(top<=bottom) {
				for(int i =right;i>=left;i--) {
					System.out.print(arr[bottom][i]+" ");

				}
				bottom--;
			}
			//check in case of one colomn left, printing bottom to top
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					System.out.print(arr[i][left]+" ");
				}
				left++;
			}
		}
	}

}
