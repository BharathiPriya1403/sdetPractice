package mandatoryHomeWork.week8.day2;

public class HC_caesarCipher {

  public static String caesarCipher(String s, int k) {
       
       String ans = "";
        while (k > 26) {
            k = k - 26;
        }

        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(!Character.isLetter(temp)) ans+=temp;
            else if(temp <= 'z' && temp >= 'a'  && temp+k > 'z'){
                ans+=((char) ('a' + (temp + k)%'z' - 1));
            } else if (temp <= 'Z' && temp >= 'A'  && temp+k > 'Z') {
                ans+=((char) ('A' + (temp + k)%'Z' - 1));
            } else{
                ans+=((char) (temp+k));
            }
        }
        return ans;

    }

}
