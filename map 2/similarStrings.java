public class similarStrings {
    
//methods

//checking if the strings are similar
public static boolean isSimilar(String s1, String s2) {
    String str3;
    String str1 = s1;
    String str2 = s2;
    if (str2.length()==0)
      return true;
    if (str1.length()==0)
      return false;
    if (str1.charAt(0)==str2.charAt(0)) {
      //str3 = str1.substring(1);
      //System.out.println(s1);
      return isSimilar(str1.substring(1), str2.substring(1));
    }
    else
      return isSimilar(str1.substring(1), str2);
       
}
    
    
}