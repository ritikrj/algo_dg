package UnDirectedGraphs;

import stdlib.*;

import java.util.HashSet;

public class Graph {

    private final int V;
    private int E;
    private  HashSet<Integer>[] adj;

    Graph(int V){
        this.V = V; this.E = 0;
        adj = ( HashSet<Integer>[]) new HashSet[V];
        for(int v= 0; v < V; v++){
            adj[v] = new HashSet<Integer>();
        }
    }
    Graph(In in){
        this(in.readInt());
        int E = in.readInt();
        for(int i = 0; i < E; i++){
            int v = in.readInt();
            int w = in.readInt();
            addEdge(v,w);
        }
    }
    int V(){return V;}
    int E(){return E;}
    void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }
    Iterable <Integer> adj(int v){return adj[v];}
//    String  toString(){
//
//    }

    public static int degree(Graph G, int v){
        int degree = 0;
        for(int w: G.adj(v)) degree++;
        return degree;
    }

    public static int maxDegree(Graph G){
        int max = 0;
        for(int v= 0 ; v < G.V(); v++){
            if(degree(G,v) > max)
                max = degree(G,v);
        }
        return max;
    }

    public static int avgDegree(Graph G){
        return 2*G.E()/G.V();
    }

    public static int numberOfSelfLoops(Graph G){
        int count = 0;
        for(int v = 0; v < G.V(); v++)
            for(int w : G.adj(v))
              if(v == w) count++;
        return count/2;
    }

    public String toString(){
        String s = V + " vertices, "+ E+ "edges\n";
        for(int v = 0; v < V; v++){
            s += v +": ";
            for(int w : this.adj(v))
                 s+= w + " ";
            s += "\n";
        }
        return s;
    }
}
