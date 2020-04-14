package arrays;

public class BubbleShort {

	public static void main(String[] args) {
		
		int a [] = { -1, 9, 0, 3, 6,8, 2,1};
		int n = a.length;
		
		boolean shorted = true;
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(a[j+1] < a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					shorted = false;
				}
			}	

			if(shorted) break;
		}
		
		for(int items : a) {
			System.out.print(items + "  ");
		}
		
		
		

	}

}
