package graphalgorithms;

import java.util.*;

public class DFS {

}

class GraphDFS{
	private int V;
	private LinkedList<Integer> adj[];
	
	GraphDFS(int v){
		this.V = v;
		adj = new LinkedList[V];
		for(int i =0;i<V;i++){
			adj[i] = new LinkedList();
		}
	}
	
	void DFS(int s){
		boolean visited[] = new boolean[V];
		DFSUtil(s, visited);
	}
	void DFSUtil(int n, boolean[] visited){
		visited[n] = true;
		
		ListIterator<Integer> i= adj[n].listIterator(); 
		while(i.hasNext()){
			int edge = i.next();
			if(!visited[edge]){
				DFSUtil(edge, visited);
			}
		}
	}
}
