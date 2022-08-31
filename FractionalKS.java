import java.util.*;
public class FractionalKS {
	static int profit[];
	static int weight[];
	static double ratio[];
	static int capacity;
	static int soln[];
	
	
	void knapsack() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("ENter Number Of Elements");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		profit=new int[n];
		weight=new int[n];
		ratio=new double[n];
		System.out.println("Enter Capacity");
		capacity=sc.nextInt();
		for (int i = 0; i < n; i++) {
			 weight[i] = sc.nextInt();
			 }
			 System.out.println("Enter Profits of Items");
			 for (int i = 0; i < n; i++) {
			 profit[i] = sc.nextInt();
			 }
			 for (int i = 0; i < n; i++) {
				 ratio[i] = profit[i]/weight[i];
				 }
			 for (int i = 0; i < n; i++)   
			 {  
			 for (int j = i + 1; j < n; j++)   
			 {  
			 double tmp = 0;  
			 if (ratio[i] < ratio[j])   
			 {  
			 tmp = ratio[i];  
			 ratio[i] = ratio[j];  
			 ratio[j] = tmp;  
			 }  
			 }  
			 //prints the sorted element of the array  
			 System.out.println(ratio[i]);  
			 }  
		
		
	
	}

}
