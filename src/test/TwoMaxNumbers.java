package test;

import org.openqa.selenium.remote.html5.AddApplicationCache;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class TwoMaxNumbers {
	
	  public void printTwoMaxNumbers(int[] nums){
	        int maxOne = 0;
	        int maxTwo = 0;
	        for(int i=0;i<nums.length;i++){  
	            if(maxOne < nums[i]){ 
	                maxTwo = maxOne; 
	                System.out.println("Second Max Number: "+maxTwo);
	                maxOne =nums[i];
	                
	                
	                System.out.println("First Max Number: "+maxOne);
	                
	            } else if(maxTwo <nums[i]){
	                maxTwo = nums[i];
	                System.out.println("Second Max Number: "+maxTwo);
	            }
	        }
	        System.out.println("First Max Number: "+maxOne);
	        System.out.println("Second Max Number: "+maxTwo);
	    }
	     
	    public static void main(String a[]){
	        int num[] = {4,9,22,10,2,5};
	        TwoMaxNumbers tmn = new TwoMaxNumbers();
	        tmn.printTwoMaxNumbers(num);
	    }
}
	


