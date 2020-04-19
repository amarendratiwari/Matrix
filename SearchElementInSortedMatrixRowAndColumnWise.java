package matrix;

public class SearchElementInSortedMatrixRowAndColumnWise {

	public static void main(String[] args) {
		
		int arr[][] = {
				{10,20,30,40,50},
				{11,21,31,41,51},
				{14,25,36,43,56},
				{17,27,38,47,59},
				{19,28,39,49,60}
		};
		int element =37;
		searchElement(arr, 5,5, element);
	}
	private static void searchElement(int[][] arr, int r, int c, int elem) {
		//Search from bottom-left corner or top-right corner
		//Return nothing if element is less than top-left corner and bottom-right corner

		if(elem< arr[0][0] || elem >arr[r-1][c-1]) {
			System.out.println("Element not found");
			return;
		}
		
		int row= 0; int col=c-1;
		while (row<r && col>=0) {
			if(elem == arr[row][col]) {
				System.out.println("Found at index "+ row+" "+ col);
				break;
			}else if(elem<arr[row][col]) {
				col--;
			}else {
				row++;
			}
		}
		System.out.println("Not found");
	}

}
