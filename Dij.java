package utilities;

public class Dij {

	/**
	 * @param args
	 */
	public static void dijk(int graph[][],int n,int src) {
		// TODO Auto-generated method stub

		int[] distance=new int[5];
		int v=0;
		int inf=999;
		
		int[] visited=new int[n];
		for(int i=0;i<n;i++)
			visited[i]=0;
		for(int l=0;l<n;l++){
			src=l;
			
			for(int i=0;i<5;i++)
				visited[i]=0;
			visited[src]=1;
			distance=graph[src];
			distance[src]=0;
			for (int i=0;i<n;i++){
				inf=999;
				for(int j=0;j<n;j++){
					if(inf > distance[j] && visited[j]!=1){
						inf=distance[j];
						v=j;
					}
				}
				visited[v]=1;
				for(int j=0;j<n;j++){
						//if(visited[i]!=1)
					if((inf + graph[j][v] < distance[j] && visited[j]!=1))
						distance[j]=inf+graph[j][v];
						//sptSet[j]=v;
				}
			}
		}
		

	}

}
