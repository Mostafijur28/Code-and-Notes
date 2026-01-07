import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    static ArrayList<ArrayList<Integer>> adj;
    static int comp = 0;
    static ArrayList<Integer> visited;
    static int last = 0;
    
    public static void dfs(int city){
        
        visited.set(city, comp);
        last = city;
        
        for(Integer neighbor : adj.get(city)){
            
            if(visited.get(neighbor) == 0){
                dfs(neighbor);
            }
        }
        
    }
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n,m;
		n = sc.nextInt();
		m = sc.nextInt();
		
		adj = new ArrayList<>();
		visited = new ArrayList<>();
		
		for(int i=0; i<=n; i++){
		    adj.add(new ArrayList<>());
		    visited.add(0);
		}
		
		for(int i=0; i<m; i++){
		    int u = sc.nextInt();
		    int v = sc.nextInt();
		    
		    adj.get(u).add(v);
		    adj.get(v).add(u);
		}
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		
		for(int i=1; i<=n; i++){
		    
		    if(visited.get(i) == 0){
		        
		       if(last != 0){
		           
		           ArrayList<Integer> pair = new ArrayList<>();
		           pair.add(last);
		           pair.add(i);
		           ans.add(pair);
		       }
		           comp += 1;
		           
		           dfs(i);
		       }
		    }
		
		System.out.println(comp - 1);
		
		for(ArrayList<Integer> p : ans){
		    
		    System.out.println(p.get(0) + " " + p.get(1));
		}
	}
}