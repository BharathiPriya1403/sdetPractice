package week05.day1;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class LC_1700_NumberOfStudentsUnableToEatLunch {
	
	/**
	 * TC - O(n*m)
	 * SC - O(n)
	 * 
	 */
	@Test
	public void TC1() {
		int[] students = {1,1,1,0,0,1};
		int[] sandwiches = {1,0,0,0,1,1};
		System.out.println(countStudents(students,sandwiches));
	}
	
	
	 public int countStudents(int[] students, int[] sandwiches) {
		    
	     List<Integer>stu = new ArrayList<>();
	     List<Integer>sand = new ArrayList<>();

	     for(int i = 0 ; i<students.length;i++){
	         stu.add(students[i]);
	     }
	     
	     for(int i = 0 ; i<sandwiches.length;i++){
	         sand.add(sandwiches[i]);
	     }
	     

	      int i = 0;
	      int j = 0 ;
	      int count = 0;
	      while(stu.size()>=0 && sand.size()>=0 && stu.size() != count) {
	    	  if(stu.get(i)==sand.get(j)) {
	    		  stu.remove(i);
	    		  sand.remove(j);
	    		  count = 0;
	    	  }else {
	    		  stu.add(stu.get(i));
	    		  stu.remove(i);
	    		  count++;
	    	  }
	      }

	    return stu.size();

	    }

}
