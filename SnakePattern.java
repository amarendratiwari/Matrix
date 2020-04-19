package matrix;

public class SnakePattern {

	public static void main(String[] args) {
		
		int arr[][] = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};
		printSnakePattern(arr, 5,5);

	}
	
	private static void printSnakePattern(int[][ ]arr, int r, int c) {
		
		for(int i=0; i<r-1; i++) {
			if(i%2==0) {
				for (int k=0;k<c;k++ ) {
					System.out.print(arr[i][k]+" ");
					
				}
				System.out.println();
			}else {
				for(int k=c-1;k>=0;k--) {
					System.out.print(arr[i][k]+" ");
					
				}
				System.out.println();
			}
				
		}
		
		
		/*int i=0;
		while(i<r-1) {
			  
			for (int k=0;k<c;k++ ) {
				System.out.print(arr[i][k]+" ");
				
			}
			i++;
			System.out.println();
			for(int k=c-1;k>=0;k--) {
				System.out.print(arr[i][k]+" ");
				
			}
			i++;
			System.out.println();
				
		}*/
		
	}

}
