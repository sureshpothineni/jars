package graphalgorithms;

import java.util.*;
public class BFS {
	public static void main(String args[]){
		Graph g = new Graph(4);
		
		g.addAdjesents(0, 1);
		g.addAdjesents(0, 2);
		g.addAdjesents(1, 2);
		g.addAdjesents(2, 0);
		g.addAdjesents(2, 3);
		g.addAdjesents(3, 3);
		
		g.bfs(2);
	}
}

class Graph{
	private int V;
	private LinkedList<Integer> adj[];
	
	Graph(int V){
		this.V = V;
		adj = new LinkedList[V];
		for(int i=0;i<V;++i){
			adj[i] = new LinkedList();
		}
	}
	
	void addAdjesents(int v, int e){
		adj[v].add(e);
	}
	
	void bfs(int s){
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList();
		
		queue.add(s);
		visited[s] = true;

		while(queue.size()!=0){
			int edge = queue.poll();
			System.out.println(edge);
			
			ListIterator<Integer> i = adj[edge].listIterator();
			while(i.hasNext()){
				int edgeVal = i.next();
				if(!visited[edgeVal]){
					visited[edgeVal] = true;
					queue.add(edgeVal);
				}
				
			}
			
		}
	}
}
