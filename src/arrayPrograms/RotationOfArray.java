package arrayPrograms;

import java.util.Arrays;

public class RotationOfArray {

	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 3, 4, 5};  
        int n = 3;
        System.out.println("Original array: ");  
        System.out.println(Arrays.toString(arr));            
//        for(int i = 0; i < n; i++){  
//            int j, last = arr[arr.length-1]; 
//            for(j = arr.length-1; j > 0; j--){ 
//                arr[j] = arr[j-1];  
//            }  
//            arr[0] = last;  
//        }   
//        System.out.println("Array after right rotation: ");  
//        System.out.println(Arrays.toString(arr));      
        for(int i = 0; i < n; i++){  
            int j, first= arr[0];       
            for(j = 0; j < arr.length-1; j++){  
                arr[j] = arr[j+1];  
            }  
            arr[j] = first;  
        }  
        System.out.println("Array after left rotation: ");         
        System.out.println(Arrays.toString(arr));        
	}
}
