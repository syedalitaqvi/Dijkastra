import java.util.*;

import utilities.Dij;
public class Dijskstra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=5;
		int [][] graph = new int [n][n];
		int inf=999;

		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<n;i++){
		
			for(int j=0;j<n;j++){
					graph[i][j]=sc.nextInt();
					if(graph[i][j]<=0)
						graph[i][j]=inf;
			}
		}
		sc.close();
		
		for(int i=0;i<n;i++)
			Dij.dijk(graph,n,i);
		for(int j=0;j<n;j++){
			for(int i=0;i<n;i++)
				System.out.print(graph[j][i]+"  ");
			System.out.println("");
		}
		
	}	
}
/*Input
0 3 0 1 0
3 0 2 0 0
0 2 0 2 4
1 2 0 0 3
0 0 4 3 0

*/