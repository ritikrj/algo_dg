package UnDirectedGraphs;

public class DepthFirstSearch {
    boolean[] marked;
    int count;

    public DepthFirstSearch(Graph G, int s){
        marked = new boolean[G.V()];
    }

    public void dfs(Graph G, int v){
        marked[v] = true;
        count++;
        for(int w: G.adj(v))
            if(!marked[w]) dfs(G, w);

    }

    public boolean marked(int w)
    { return marked[w]; }

    public int count()
    { return count; }
}
