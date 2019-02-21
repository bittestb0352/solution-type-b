package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		int gop = 0;
		int Max = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++) 
			{
				gop = arr[i] * arr[j];
						if(gop > Max) {
							Max = gop;
						}
			}
		}
		
		//
		// 코드를 완성 하십시오.
		//
		
	}
}
