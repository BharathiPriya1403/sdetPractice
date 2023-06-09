package leetCode;

import org.testng.annotations.Test;

public class LC_1598_CrawlerLogFolder {
	

	@Test
	public void TC1(){
		String[] logs = {"d1/","d2/","../","d21/","./"};
		System.out.println(minOperations(logs));
		
	}
	

	@Test
	public void TC2(){
		String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
		System.out.println(minOperations(logs));
		
	}
	
	@Test
	public void TC3(){
		String[] logs = {"./","wz4/","../","mj2/","../","../","ik0/","il7/"};
		System.out.println(minOperations(logs));
		
	}

	 public int minOperations(String[] logs) {
      
		 int i = 0;
	        int count = 0 ;
	        int junk = 0;
	        while(i<logs.length) {
	        	if(logs[i].equals("../")) count--;
	        	else if (logs[i].equals( "./")) junk ++;
         else count++;
						if(count<0) count = 0;
	        	i++;
	        }
	            
	        return count<=0 ? 0:count;
	        
	        
	    }
}
