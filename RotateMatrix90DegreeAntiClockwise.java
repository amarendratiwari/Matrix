package matrix;

public class RotateMatrix90DegreeAntiClockwise {

	public static void main(String[] args) {

		int arr[][] = {
				{26,27,28,29,30},
				{31,32,33,34,35},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};

		rotate90DegreeAntiClockwise(arr, 5, 5);

	}
	private static void rotate90DegreeAntiClockwise(int[][] arr, int r, int c) {
		//Doing transpose below
		for(int i=0;i<r;i++) {
			for(int j=i+1;j<c;j++) {
				int temp= arr[i][j];
				arr[i][j]= arr[j][i];
				arr[j][i]= temp;
			}
		}
		//Doing reverse of rows here
		for(int  i =0;i<c;i++) {
			int start=0; 
			int end =r-1;
			while(start<end) {
				int temp = arr[start][i];
				arr[start][i]=  arr[end][i];
				arr[end][i]=temp;
				start++;
				end--;
			}
		}

		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
