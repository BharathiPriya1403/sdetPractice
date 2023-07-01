package mandatoryHomeWork.week9.day1;

import java.util.List;

public class HC_twoStacks {
	public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
	    // Write your code here
	             
	             
	          int sumA = 0 ; 
	          int sumB = 0 ;  
	          int countA = 0 ;
	          int countB = 0 ;
	          int max = 0;
	       for(int i = 0 ; i <a.size();i++){
	           
	          sumA = sumA+a.get(i);
	           if(sumA<=maxSum) countA++;  
	       }
	       
	       for(int i = 0 ; i <b.size();i++){
	           
	          sumB = sumB+b.get(i);
	           if(sumB<=maxSum) countB++;  
	       }
	       
	       max = Math.max(countA,countB);
	       
	       int i = 0 ;
	       int j = 0 ;
	       int sum = 0 ;
	        int count = 0 ;
	       while(i<a.size() && j<b.size()){
	           
	           if(sum <= maxSum){
	           sum+= a.get(i)+b.get(j);
	           i++;
	           j++;
	           count = count+2;
	           }
	           if(sum>maxSum){
	               if(a.get(i)>b.get(j)){
	                   sum-= a.get(i);
	                   j++;
	                   count--;
	               }else {
	                   sum-= b.get(j);
	                   i++;
	                   count--;
	               }
	           }
	       }
	       
	       return  max = Math.max(max,count);

	    }

	}

