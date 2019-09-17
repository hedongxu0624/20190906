package cn.lore.oop;

public class Star {
	public void star01() {
   	
   		 for(int i=1;i<=5;i++) {
    		 for(int j=0;j<=(5-i);j++) {
    			 System.out.print(" ");
    		 }
    		 for(int k=1;k<=(2*i-1);k++) {
    			 System.out.print("*");
    		 }
    		 System.out.println();

   	 }
    }
    
   public void star02() 
   {
	   for(int i=4;i>0;i--) {
  	     
  		 for(int k=0;k<=(5-i);k++) {
  			 System.out.print(" ");
  			 
  		 }
  		 for(int j=1;j<=(2*i-1);j++) {
  			 System.out.print("*");
  		 }
  		 System.out.println();

   		}
    }
}
