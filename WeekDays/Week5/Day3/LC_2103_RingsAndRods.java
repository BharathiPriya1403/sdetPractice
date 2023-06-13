package leetCode;

import java.util.HashSet;
import java.util.Set;

import javax.imageio.plugins.tiff.ExifInteroperabilityTagSet;

import org.testng.annotations.Test;

public class LC_2103_RingsAndRods {
	
	
	@Test
	public void TC1() {
		String command = "G4";
		System.out.println(countPoints(command));
	}
	
	 public int countPoints(String rings) {
	        HashSet<Character> red = new HashSet<>();
	         HashSet<Character> blue = new HashSet<>();
	          HashSet<Character> green = new HashSet<>();

	          int output = 0 ;
	          int j = 1;
	          for(int i = 0 ;i<rings.length()-1&&j<rings.length();i++){
	            if(rings.charAt(i)== 'B' && !blue.contains(rings.charAt(j))){
	                blue.add(rings.charAt(j));
	            }else if(rings.charAt(i)== 'R' && !red.contains(rings.charAt(j))){
	                red.add(rings.charAt(j));

	            }else if (rings.charAt(i)== 'G' && !green.contains(rings.charAt(j))){
	                green.add(rings.charAt(j));
	            }
	            j++;
	          }
	          

	          Set<Character> common = new HashSet<>(red);
	          common.retainAll(blue);
	          
	          Set<Character> common1 = new HashSet<>(common);
	          common1.retainAll(green);
	          
			return common1.size();

	       
	    }

}
