package utils;
	 
		public class ArrayUtils {
			  public static String stringifyArrays(int[] arr){
			    String result="";
			    for( int i=0; i<arr.length; i=i+1) {
			      if( i != arr.length-1) {

			      result = result + arr[i]+",";
			      }
			    }
			    return result + arr[arr.length-1];
			  }
			  
			  public static int[] reverse(int[] arr) {
			    int[] rearr =new int[arr.length];
			  
			    for(int i=0; i<arr.length; i++) {
			    rearr[i]= arr[arr.length - i -1];
			      
			    }
			    return rearr; 
			    
			  }
		}
		
		