import java.util.*;
public class Floyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int k=0;k<n;++k) {
			for(int i=0;i<n;++i) {
				for(int j=0;j<n;++j) {
					arr[i][j]=Math.min(arr[i][j],arr[i][k]+arr[k][j]);
				}
			}
		}
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				System.out.print( arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
