package shastri.swaroop.youtube.amazon;

//youtube.com/watch?v=IdZlsG6P17w
//Amazon Coding Interview Question - Rotate Image
public final class FlipNxNMetrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int metrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		int metrix[][] = { { 1, 2, 3, 4 }, {  5, 6,7,8 }, { 9,10,11,12 },{13,14,15,16} };

		showMetrix(metrix);

		// Steps:
		// 1. Transpose metrix
		// 2. Swap rows
		metrix = rotateImage(metrix);
		showMetrix(metrix);

		metrix = flipImate(metrix);

		/*
		 * for(int i=0; i<metrix.length; i++){ for(int j=i; j<metrix.length; j++){ int
		 * tmp = metrix[i][j]; metrix[i][j] = metrix[j][i]; metrix[j][i] =tmp; } }
		 */
		showMetrix(metrix);

	}

	private static void showMetrix(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

	}

	private static int[][] rotateImage(int metrix[][]){
	for(int i=0; i<metrix.length; i++){
		for(int j=i; j<metrix.length; j++){
				int tmp = metrix[i][j];
				metrix[i][j] = metrix[j][i];
				metrix[j][i] =tmp;
		}
	}
	return metrix;
	
	}
	
	private static int[][] flipImate(int metrix[][]){
		for(int i=0; i<metrix.length; i++){
			for(int j=0; j<metrix.length/2; j++){
				int tmp = metrix[i][j]; 
				metrix[i][j] = metrix[i][metrix.length-1-j];
				metrix[i][metrix.length-1-j] = tmp;
			}
			}
		return metrix;
	}
}