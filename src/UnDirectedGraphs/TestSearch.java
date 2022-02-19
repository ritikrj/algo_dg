package UnDirectedGraphs;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import stdlib.In;

public class TestSearch {
    public static void main(String[] args)
    {
        Graph G = new Graph(new In("C:\\Users\\ritik\\Documents\\algo book samples\\tinyG.txt"));
        int  s = Integer.parseInt("9");
        DepthFirstSearch search = new DepthFirstSearch(G,s);

        for(int i =0 ; i < G.V(); i++){
            if(search.marked(i))
                System.out.println("");
        }
        System.out.println("");

        if(search.count() != G.V())
            System.out.println("NOt");
        System.out.println("connected");

    }
}
