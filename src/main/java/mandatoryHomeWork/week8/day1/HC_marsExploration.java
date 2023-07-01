package mandatoryHomeWork.week8.day1;

public class HC_marsExploration {


  public static int marsExploration(String s) {
    // Write your code here
    int len = s.length()/3;
    String b = "";
    while(len>0){
        b+= "SOS";
        len--;
    }
     int count = 0;
     
     for(int i = 0 ; i<s.length();i++){
         if(s.charAt(i)!=b.charAt(i)) count++;
         
     }
      return count;
    }

}

}
