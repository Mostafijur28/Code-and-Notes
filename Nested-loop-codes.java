
public class Main
{
	public static void main(String[] args) {
		
		int n = 5;
		int m = 4;
		int num = 1;
		
		for(int i=1; i<=n; i++){
		    
		    for(int j=1; j<=m; j++){
		        
		        System.out.print(num%10 + " ") ;
		        
		        num++;
		    }
		    
		    System.out.println();
		}
		
		
// 		for(int i=1; i<=n; i++){
		    
// 		    for(int j=1; j<=n; j++){
		        
// 		        if((i+j)%2 == 0){
// 		            System.out.print('W' + " ");
// 		        }
// 		        else{
// 		            System.out.print('B' + " ");
// 		        }
// 		    }
		    
// 		    System.out.println();
// 		}
//------------------------------------------------------------------------		
// 		for(int i=1; i<=n; i++){
		    
// 		    for(int j=1; j<=n-i; j++){
// 		        System.out.print(" ");
// 		    }
		    
// 		    for(int j=1; j<=i; j++){
// 		        System.out.print("* ");
// 		    }
		    
// 		    System.out.println();
// 		}
		
// 		for(int i=n-1; i>=1; i--){
		    
// 		    for(int j=1; j<=n-i; j++){
// 		        System.out.print(" ");
// 		    }
		    
// 		    for(int j=1; j<=i; j++){
// 		        System.out.print("* ");
// 		    }
		    
// 		    System.out.println();
// 		}

// ----------------------------------------------------------
		
// 		for(int i=1; i<=n; i++){
		    
// 		    //spaces
// 		    for(int j=1; j<=n-i; j++){
// 		        System.out.print("  ");
// 		    }
		    
// 		    //increasing numbers
// 		    for(int j=1; j<=i; j++){
// 		        System.out.print(j + " ");
// 		    }
		    
// 		    //decreasing numbers
// 		    for(int j=i-1; j>0; j--){
// 		        System.out.print(j + " ");
// 		    }
		    
// 		    System.out.println();
		    
// 		}
//-------------------------------------------------------------------
		
// 		for(int i=1; i<=n; i++){
		    
// 		    for(int j=1; j<=i; j++){
// 		        System.out.print(j + " ");
// 		    }
		    
// 		    System.out.println();
// 		}
	}
}