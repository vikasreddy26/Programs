package patterns;

public class Patterns {

	public static void main(String[] args) {
		int rows = 5;
		printDiamond( rows) ;
		printPyramid(rows);
		printReversePyramid(rows);
		printRevLeftTri( rows );
		printLeftTriangle( rows );
		printRevRightTri( rows);
		printRightTriangle(rows);
		patter1(rows);
		pattern2(rows);
		pattern3(rows);
	    pattern4(rows);
	    pattern5(rows);
	    printTriagle(rows);
	    printReverseTriagle(rows);
	    print(rows);
	    pattern(rows);
	}
	/*  *
	   ***
	  *****
	 *******
	*********
	 *******
	  *****
	   ***
	    *    */
    public static void printDiamond(int rows) {
    	for(int i =1;i<=rows;i++) {
			for(int j = rows;j>i;j--) {
				System.out.print(" ");				
			}
			for(int k =1;k<=(i*2)-1;k++) {
				System.out.print("*");				
			}
			System.out.println();												
		}				
		for(int i = rows-1;i>=1;i--) {
			for(int j=rows-1;j>=i;j--) {
				System.out.print(" ");
			}								
			for(int k = 1;k<=(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		System.out.println("-----------------------------------------------------------");
    }
 /*  *
    ***
   *****
  *******
 *********  */
    static void printPyramid(int rows) {
    	for(int i =1;i<=rows;i++) {
			for(int j = rows;j>=i;j--) {
				System.out.print(" ");				
			}
			for(int k =1;k<=(i*2)-1;k++) {
				System.out.print(i);				
			}
			System.out.println();												
		}
    	System.out.println("-----------------------------------------------------------");
    }
/* *******
    *****
     ***
      *  */

public static void printReversePyramid(int rows){
    	
    	for(int i = rows;i>=1;i--) {
			for(int j=rows;j>=i;j--) {
				System.out.print(" ");
			}								
			for(int k = 1;k<=(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();		
		}		  	
    	System.out.println("-----------------------------------------------------------");
    }  
    
    
/*  ****** 
    *****       1
    ****   
    ***    
    **     
    *  */
     
    static void printRevLeftTri(int rows ) {
		for(int i = 1;i<= rows;i++) {
			for(int j = rows;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}	
		System.out.println("-----------------------------------------------------------");
	}
 /*  *
     **
     ***          2
     ****
     *****
     ****** */
      public static void printLeftTriangle(int rows ) {
  		for(int i = 1;i <= rows;i++) {
  			for(int j = 1;j<=i;j++) {
  				System.out.print("*");
  			}	 
  			System.out.println();
  		}
  		System.out.println("-----------------------------------------------------------");
  	}
  /*  	******
    	 *****
    	  ****       3
    	   ***
    	    **	
    	     *    */
    
    static void printRevRightTri(int rows) {
    	for(int i = 1;i <= rows;i++) {
    		for (int j = 1;j<=i;j++) {
    			System.out.print(" ");
    		}
    		for(int k = rows;k>=i;k--) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}  	
    	System.out.println("-----------------------------------------------------------");
    }
    
    
/*    *
     **
    ***
   ****              4
  *****
 ******
******* */
    
    static void printRightTriangle(int rows) {
    	for(int i = 1;i<=rows;i++) {
    		for(int j =rows;j>=i;j-- ) {
    			System.out.print(" ");
    		}
    		for(int k = 1;k<=i;k++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	System.out.println("-----------------------------------------------------------");
    }
    
    
/*  10101
    10101
    10101
    10101
    10101 */
    static void patter1(int rows) {
    	
    	for(int i= 1;i<=5;i++) {
			for(int j=1;j<= 5;j++) {
				if(j % 2== 0)
					System.out.print(0);
				else 
					System.out.print(1);
			}			
			System.out.println();
		}
    	System.out.println("-----------------------------------------------------------");
    }
/*  ***** 
    ****  
    ***   
    **    
    *     1 & 2
    **
    ***
    ****
    ***** */
    static void pattern2(int rows) {
    	for(int i = 1;i<= rows;i++) {
			for(int j = rows;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}	
    	for(int i = 2;i <= rows;i++) {
  			for(int j = 1;j<=i;j++) {
  				System.out.print("*");
  			}	
  			System.out.println();
  		}
    	System.out.println("-----------------------------------------------------------");
    }
/* *****
    ****
     ***
      **
       *      3 & 4
      **
     ***
    ****
   *****   */
    static void pattern3(int rows) {
    	for(int i = 1;i <= rows;i++) {
    		for (int j = 1;j<=i;j++) {
    			System.out.print(" ");
    		}
    		for(int k = rows;k>=i;k--) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}  	
    	for(int i = 2;i<=rows;i++) {
    		for(int j =rows;j>=i;j-- ) {
    			System.out.print(" ");
    		}
    		for(int k = 1;k<=i;k++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	System.out.println("-----------------------------------------------------------");
    }

/*
*
**
***
****
*****   2 & 1
****  
***   
**    
*   
 */
    static void pattern4(int rows) {
    	for(int i = 1;i <= rows;i++) {
  			for(int j = 1;j<=i;j++) {
  				System.out.print("*");
  			}	
  			System.out.println();
  		}
    	for(int i = 1;i<= rows-1;i++) {
			for(int j = rows-1;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}	
    	System.out.println("-----------------------------------------------------------");
    }
    
 /*
     *
    **
   ***
  ****
 *****  4 & 3
  ****
   ***
    **
     *
 */
    static void pattern5(int rows) {
    	for(int i = 1;i<=rows;i++) {
    		for(int j =rows;j>i;j-- ) {
    			System.out.print(" ");
    		}
    		for(int k = 1;k<=i;k++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	for(int i = 1;i <= rows-1;i++) {
    		for (int j = 1;j<=i;j++) {
    			System.out.print(" ");
    		}
    		for(int k = rows-1;k>=i;k--) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}  	
    	System.out.println("-----------------------------------------------------------");
    }
 /*
  
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

     */
    
    
    public static void printTriagle(int rows)
    {
    	for(int i = 1;i<=rows;i++) {
    		for(int j =rows;j>=i;j-- ) {
    			System.out.print(" ");
    		}
    		for(int k = 1;k<=i;k++) {
    			System.out.print(" *");
    		}
    		System.out.println();
    	}
        System.out.println("-----------------------------------------------------------");
    }
    
    /*
     
 1 2 3 4 5 
  2 3 4 5 
   3 4 5 
    4 5 
     5       
     
     */
    
    static void printReverseTriagle(int rows) {
    	for(int i = 1;i <= rows;i++) {
    		for (int j = 1;j<=i;j++) {
    			System.out.print(" ");
    		}
    		for(int k = rows;k>=i;k--) {
    			System.out.print(" *");
    		}
    		System.out.println();
    	}  	
    	 System.out.println("-----------------------------------------------------------");
    }
 /*
     
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 1 2 3 4 
  2 3 4 
   3 4 
    4 

  */   
    static void print(int rows) {
    	for(int i = 1;i<=rows;i++) {
    		for(int j =rows;j>=i;j-- ) {
    			System.out.print(" ");
    		}
    		for(int k = 1;k<=i;k++) {
    			System.out.print(" *");
    		}
    		System.out.println();
    	}

    	for(int i = 2;i <= rows;i++) {
    		for (int j = 1;j<=i;j++) {
    			System.out.print(" ");
    		}
    		for(int k = rows;k>=i;k--) {
    			System.out.print(" *");
    		}
    		System.out.println();
    	}  	

    	  System.out.println("-----------------------------------------------------------");
    }
    
    
    /*
     
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 

     */
    static void pattern(int rows) {
    	for(int i = 1;i <= rows;i++) {
    		for (int j = 1;j<=i;j++) {
    			System.out.print(" ");
    		}
    		for(int k = rows;k>=i;k--) {
    			System.out.print(" *");
    		}
    		System.out.println();
    	}  	
    	for(int i = 2;i<=rows;i++) {
    		for(int j =rows;j>=i;j-- ) {
    			System.out.print(" ");
    		}
    		for(int k = 1;k<=i;k++) {
    			System.out.print(" *");
    		}
    		System.out.println();
    	}
        System.out.println("-----------------------------------------------------------");
    }
    
  
}
