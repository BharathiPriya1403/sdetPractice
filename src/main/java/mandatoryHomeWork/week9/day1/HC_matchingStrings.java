package mandatoryHomeWork.week9.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HC_matchingStrings {
	
	
	
	public List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
	    // Write your code here
	    
		Map<String,Integer> hm = new HashMap<>();
        
        List<Integer> ls = new ArrayList<>();
       
     
        int i = 0 ;
        while(i<stringList.size()){
            hm.put(stringList.get(i), hm.getOrDefault(stringList.get(i), 0)+1);
            i++;
        }
       
        for (int j = 0; j < queries.size(); j++) {
            if(hm.containsKey(queries.get(j))) {
                
                ls.add(hm.get(queries.get(j)));
            }else ls.add(0);
            
        }
        
        return ls;


	
	}
}
