package utils;

public class Math {
	
	public static int fact(int num){
	     if(num<=0){
	       return 1;
	       }
	     return num * fact(num-1);
 }
	      public static int factorLoop(int num){
	          int i;
	          int factorial=num;
	          for(i=1; i< num; i++ ){
	              factorial=factorial*(num-i);
	           }
	          return(factorial);
	      }


}
