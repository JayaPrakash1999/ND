import java.util.Arrays;
import java.util.Vector;

public class GraphG
{
	Vector<Integer>[] adjacent ;//for adjacency lists
	int V;
	
	//Depth First Search with recursive for checking the degree which is less than k (k-core)
	boolean ReducesDegree(int v, boolean[] visited, int[] verticesDegree, int k)
	{
		visited[v] = true; //making it to visited

		for (int i : adjacent[v])
		{
			if (verticesDegree[v] < k)
			{
				verticesDegree[i]--;
			}
			if (!visited[i])
			{
				ReducesDegree(i, visited, verticesDegree, k);
			}
		}
		return (verticesDegree[v] < k);// Returning true == In case degree of v is less than k
	}
	
	
	// adding edges to GraphG
	void addingEdge(int u, int v)
	{
		this.adjacent[u].add(v);
		this.adjacent[v].add(u);
	}

	GraphG(int V) //constructor with initialization of vertices c
	{
		this.V = V;
		this.adjacent = new Vector[V];

		for (int i = 0; i < V; i++)
		{
			adjacent[i] = new Vector<>();
		}
	}


	// Prints k cores of an undirected GraphG
	void printingKCores(int k)
	{

		boolean[] processed = new boolean[V];
		boolean[] visited = new boolean[V];
		//Making the all vertices's visited and processed status to no (not visited)
		Arrays.fill(visited, false);
		Arrays.fill(processed, false);
		//setting the minimumDegree as maximum value
		int minimumDegree = Integer.MAX_VALUE;
		int[] verticesDegree = new int[V];
		//Starts with vertex 0 = 1st vertex from input
		int startvertex = 0;
		
		//checking & storing each vertex's degree
		for (int i = 0; i < V; i++)
		{
			verticesDegree[i] = adjacent[i].size();
			if (verticesDegree[i] < minimumDegree)
			{
				minimumDegree = verticesDegree[i];
				startvertex = i;
			}
		}
		ReducesDegree(startvertex, visited, verticesDegree, k);

		for (int i = 0; i < V; i++)
		{
			//updating the degrees
			if (!visited[i])
			{
				ReducesDegree(i, visited, verticesDegree, k);
			}
		}
		
		System.out.println("\t**************");
		System.out.println("Adjacency list of "+k +" Cores from given graph :- ");
		for (int v = 0; v < V; v++)
		{
			if (verticesDegree[v] >= k)
			{
				System.out.println();
				System.out.print("["+ v +"]");
				
				//printing vertices whose degree is greater than k(minimum k in k-core)
				for (int i : adjacent[v])
				{
					if (verticesDegree[i] >= k)
					{
						System.out.print(" -> "+ i);
					}
				}
				
			}
		}
		System.out.println();
		
	}
}
