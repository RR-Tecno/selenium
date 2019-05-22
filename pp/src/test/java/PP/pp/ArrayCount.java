package PP.pp;

public class ArrayCount {

	public static void main(String[] args) {
	
		int a[]= {1,3,9,7,6};
		int b[]= {3,9,6,5,2};
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					
				int	sum=a[i]+b[i];
					//System.out.print(a[i]+b[j]);
				System.out.print(sum);
				}
			}
		}

	}

}