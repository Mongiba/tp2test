package premierexemple;


public class ArraysManager {
	public static int squareSum(int[] n) {
		int sum = 0;
		if(n.length==0)
			return 0;
		for (int i = 0; i < n.length; i++) {
		sum += n[i]*n[i];
		}
		return sum;

		}
}