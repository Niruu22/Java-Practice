package nestedForLoopsPaterns;

public class Pattern17 {

	public static void main(String[] args) {
		// Diamond pyramid
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		
		
		int n=5;
        
        //upper half
        for(int i=1; i<=n; i++){

           //spaces
           for(int j=1; j<=n-i; j++){
               System.out.print(" ");
           }
           
           //Stars 
           for(int j=1; j<=2*i-1; j++){
               System.out.print("*");
           }
           System.out.println();
        }
       
        // lower half
        for(int i=n; i>=1; i--){

           //spaces
           for(int j=1; j<=n-i; j++){
               System.out.print(" ");
           }
           
           //Stars 
           for(int j=1; j<=2*i-1; j++){
               System.out.print("*");
           }
           System.out.println();
        }

	}

}
