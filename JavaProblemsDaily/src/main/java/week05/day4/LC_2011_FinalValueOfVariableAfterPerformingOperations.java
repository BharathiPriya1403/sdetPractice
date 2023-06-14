package week05.day4;

public class LC_2011_FinalValueOfVariableAfterPerformingOperations {
	
	public void TC1() {
		String[] operations = {"--X","X++","X++"};
		finalValueAfterOperations(operations);
	}
	
	
	 public int finalValueAfterOperations(String[] operations) {
	        int X = 0 ;
	      for(int i = 0 ;i<operations.length;i++){
	         if(operations[i].contains("--")){
	              X+= -1;
	          }else X+= 1;
	      }
	       return X;
	    }

}
