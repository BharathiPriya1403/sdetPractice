package week05.day3;

public class LC_1108_DefangingAnIPAddress {
	
	public void TC1() {
		String address = "1.1.1.1";
		defangIPaddr(address);
	}
	
	 public String defangIPaddr(String address) {
	        StringBuilder sb = new StringBuilder();

	        for(int i = 0 ; i <address.length();i++){
	            if(address.charAt(i) =='.') sb.append("[.]");
	            else sb.append(address.charAt(i));
	        }

	        return sb.toString();
	    }

}
