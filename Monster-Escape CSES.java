import java.util.Scanner;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Main
{
    //static ArrayList<ArrayList<Integer>> adj;
    //static int comp = 0;
    static char grid[][];
    static int shortest1[][];
    static int shortest2[][];
    static String path[][];
    static int n,m;
    static int r,c;
    static int max_dist = (int)1e9+7;
    
    public static void bfs1(){
        
        Queue<ArrayList<Integer>> q = new LinkedList<>();
        ArrayList<Integer> p = new ArrayList<>();
        p.add(r);
        p.add(c);
        q.add(p);
        shortest1[r][c] = 0;
        path[r][c] = "";
        
        while(q.isEmpty() == false){
            
            ArrayList<Integer> node = q.poll();
            int r = node.get(0);
            int c = node.get(1);
            
            int dx[] = {1,-1,0,0};
            int dy[] = {0,0,1,-1};
            char mov[] = {'D', 'U', 'R', 'L'}; 
            
            for(int i=0; i<4; i++){
                int nx = r+dx[i];
                int nc = c+dy[i];
                
                if(nx >= 0 && nx <n && nc >= 0 && nc <m && shortest1[nx][nc] == max_dist && grid[nx][nc] == '.'){
                    shortest1[nx][nc] = shortest1[r][c]+1;
                    path[nx][nc] = path[r][c]+mov[i];
                    
                    ArrayList<Integer> neighbor = new ArrayList<>();
                    neighbor.add(nx);
                    neighbor.add(nc);
                    q.add(neighbor);
                }
            }
        }
        
    }
    
    public static void bfs2(){
        
        Queue<ArrayList<Integer>> q = new LinkedList<>();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                
                if(grid[i][j] == 'M'){
                    
                    ArrayList<Integer> p = new ArrayList<>();
                    p.add(i);
                    p.add(j);
                    q.add(p);
                    shortest2[i][j] = 0;

                }
            }
        }
        
        
        while(q.isEmpty() == false){
            
            ArrayList<Integer> node = q.poll();
            int r = node.get(0);
            int c = node.get(1);
            
            int dx[] = {1,-1,0,0};
            int dy[] = {0,0,1,-1};
            char mov[] = {'R', 'L', 'D', 'U'}; 
            
            for(int i=0; i<4; i++){
                int nx = r+dx[i];
                int nc = c+dy[i];
                
                if(nx >= 0 && nx <n && nc >= 0 && nc <m && (shortest2[nx][nc] ==max_dist ) && 
                (grid[nx][nc] == '.' || grid[nx][nc] == 'A')) {
                    shortest2[nx][nc] = shortest2[r][c]+1;
                    
                    ArrayList<Integer> neighbor = new ArrayList<>();
                    neighbor.add(nx);
                    neighbor.add(nc);
                    q.add(neighbor);
                }
            }
        }
        
    }
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		grid = new char[n][m];
		shortest1 = new int[n][m];
		shortest2 = new int[n][m];
		path = new String[n][m];
		
		for(int i=0; i<n; i++){
		    
		    String g = sc.next();
		    
		    for(int j=0; j<m; j++){
		        grid[i][j] = g.charAt(j);
		        shortest1[i][j] = max_dist;
		        shortest2[i][j] = max_dist;
		        
		        if(grid[i][j] == 'A'){
		        r = i;
		        c = j;
		        }
		    }
		}
		
		if(r == 0 || r==n-1 || c == 0 || c==m-1){
		    System.out.println("YES");
		    System.out.println(0);
		    return;
		}
		
		bfs1();
		bfs2();
		
// 		for(int i=0; i<n; i++){
// 		    for(int j=0; j<m; j++){
// 		        System.out.print(shortest1[i][j] + " ");
// 		    }
// 		    System.out.println();
// 		}
		
// 		System.out.println();
		
// 		for(int i=0; i<n; i++){
// 		    for(int j=0; j<m; j++){
// 		        System.out.print(shortest2[i][j] + " ");
// 		    }
// 		    System.out.println();
// 		}
		
		boolean isPossible = false;
		
		for(int i=0; i<n; i++){
		    
		    if((grid[i][0] == '.') && (shortest1[i][0] < shortest2[i][0])){
		        
		        System.out.println("YES");
		        System.out.println(shortest1[i][0]);
		        System.out.println(path[i][0]);
		        isPossible = true;
		        break;
		    }
		   
		    
		    else if(grid[i][m-1] == '.' && (shortest1[i][m-1] < shortest2[i][m-1])){
		        
		        System.out.println("YES");
		        System.out.println(shortest1[i][m-1]);
		        System.out.println(path[i][m-1]);
		        isPossible = true;
		        break;
		    }
		}
		
		if(isPossible == false){
		    
		    for(int i=0; i<m; i++){
		      
		    
		    if(grid[0][i] == '.' && (shortest1[0][i] < shortest2[0][i])){
		        
		        System.out.println("YES");
		        System.out.println(shortest1[0][i]);
		        System.out.println(path[0][i]);
		        isPossible = true;
		        break;
		    }
		    
		    else if(grid[n-1][i] == '.' && (shortest1[n-1][i] < shortest2[n-1][i])){
		        
		        System.out.println("YES");
		        System.out.println(shortest1[n-1][i]);
		        System.out.println(path[n-1][i]);
		        isPossible = true;
		        break;
		    }
		}
		}
		
		
		if(isPossible == false){
		    System.out.println("NO");
		}

	}
}