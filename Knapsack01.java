import java.util.Scanner;

class Knapsack01 {
   

      static void fill(int n,int weight[],int profit[], int capacity)
      {
        int[][] K = new int[n + 1][capacity + 1];

        for (int i = 0; i <= n; i++) 
        {
            for (int j = 0; j <= capacity; j++)
            {
                if (i == 0 || j == 0) 
                {
                    K[i][j] = 0;
                } 
                else if (j -weight[i-1]<0)
                {
                    K[i][j] = K[i - 1][j];
                } 
                else if(j-weight[i-1]>=0)
                {
                    K[i][j] = Math.max(K[i - 1][j], profit[i-1] + K[i - 1][j - weight[i-1]]);
                }
            }
        }
        System.out.println("Maximum Profit: " + (K[n][capacity]));

        System.out.print("Items Considered: ");

        int i = n, j = capacity;

        while (i > 0 && j > 0)
        {
            if (K[i][j] != K[i - 1][j]) 
            {
                System.out.print(i + " ");
                j -= weight[i - 1];
            }
            i -= 1;
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
    	int n,i,capacity;
    	 Scanner scanner = new Scanner(System.in);

         System.out.println("Enter Number of Items");
         n = scanner.nextInt();
        int weight[] = new int[n];
        int profit[] = new int[n];

         System.out.println("Enter Weights of Items");
         for (i = 0; i < n; i++) 
         {
              weight[i] = scanner.nextInt();
         }

         System.out.println("Enter Profits of Items");
         for ( i = 0; i < n; i++) 
         {
             profit[i] = scanner.nextInt();
         }

         System.out.println("Enter Capacity of Knapsack");
         capacity = scanner.nextInt();
    	
      
        fill(n,weight,profit,capacity);
    }
}
