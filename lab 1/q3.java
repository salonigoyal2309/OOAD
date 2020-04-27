import java.util.Scanner;
import java.io.*;
public class q3 {
   
    static boolean isVowel(char c) {
    return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
            c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
 
    static String pigLatin(String s) {
 
        int len = s.length();
        int index = -1;
        for (int i = 0; i < len; i++){
            if (isVowel(s.charAt(i))) {
            index = i;
            break;
            }
        }
 
        if (index == -1)
            return s+"ay";
           
        if(index==0)
            return s+"way";
 
        return s.substring(index) +
        s.substring(0, index) + "ay";
       
}
 
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
       	String ans="";
       //System.out.println(s);
	String str="";
       
	for(int i=0;i<s.length();i++){

		if(s.charAt(i)==' '){
			ans+=pigLatin(str);
			ans+=" ";
			str = "";
		}
		else str+=s.charAt(i);
		//System.out.println(str);
	}

	if(str!="") ans+=pigLatin(str);

	System.out.println(ans);

        /**if (str == "-1")
            System.out.print("No vowels found." +  
                         "Pig Latin not possible");
     
        else
            System.out.print(str);**/
    }
     
}


