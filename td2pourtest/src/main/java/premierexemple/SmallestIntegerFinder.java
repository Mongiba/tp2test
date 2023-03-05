package premierexemple;


public class SmallestIntegerFinder {
	public static int findSmallestInt(int[] args) {
		if(args.length==0)
			return 0;
		int min = args[0];
		for(int i = 1; i < args.length; i++){
		if(min > args[i])
			min = args[i];
		}
		if(args.length==0)
			return 0;
		return min;
		}
}
