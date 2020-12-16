package algorithms;

public class AllPairShortestPaths {
    final static int INF = 99999, V = 4;

    void floyedAlgo(int[][] graph) {
        int[][] dist = new int[V][V];
        int i, j, k;

        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                dist[i][j] = graph[i][j];

        for (k = 0; k < V; k++) {
            for (i = 0; i < V; i++) {
                for (j = 0; j < V; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }

        printSolution(dist);
    }

    void printSolution(int[][] dist)
    {
        System.out.println("\n\nThe following matrix shows the shortest distances between all the pairs of vertices\n");
        for (int i=0; i<V; ++i)
        {
            for (int j=0; j<V; ++j)
            {
                if (dist[i][j]==INF)
                    System.out.print("INF\t");
                else
                    System.out.print(dist[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void init() {
        int[][] graph = { {0,  12, INF,  17},
                        {INF,   0,  10, INF},
                        {INF, INF,   0,   8},
                        {INF, INF, INF,   0}
        };
        AllPairShortestPaths a = new AllPairShortestPaths();

        a.floyedAlgo(graph);
    }
}
