
public class SpiralMatrix {
	
	public static void main(String args[]){
		SpiralMatrix sm = new SpiralMatrix();
		int[][] matrix={{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}};
						
		sm.printSpiral(matrix);
	}

	private void printSpiral(int[][] matrix){
		int size = matrix.length;
		//System.out.println(size);
		if(size == 0)
			return;
		int top = 0;
		int down = size - 1;
		int left = 0;
		int right = matrix[0].length - 1;
		
		while(true){
			for(int i=left; i <= right; i++){
				System.out.print(matrix[top][i] + " ");
			}
			top++;
			if(top > down || left > right) break;
			for(int j=top; j<= down ;j++ ){
				System.out.print(matrix[j][right] + " ");
			}
			right--;
			if(top > down || left > right) break;
			
			 for(int k = right; k >= left; k--){ 
				 System.out.print(matrix[down][k] + " ");
			 }
	         down--;
	         if(top > down || left > right) break;
	         
	         for(int l = down; l >= top; l--){ 
	        	 System.out.print(matrix[l][left] + " ");
	         }
	         left++;
	         if(top > down || left > right) break;
		}
				
		
	}
}
