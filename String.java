
public class Main
{
	public static void main(String[] args) {
		
// 		String s = "abc";
// 		String x = "abc";
		
// 		String p = new String("abc");
// 		String y = new String("abc");

//        System.out.println(y);

        // String s = "abcde";
        
        // // for(char ch : s){
        // //     System.out.println(ch);
        // // }
        
        // System.out.println(s.length());
        // System.out.println(s.charAt(0));
        
        // // for(int i=0; i<s.length(); i++){
            
        // //     System.out.print(s.charAt(i)+" ");
        // // }
        
        // String t1 = "tyu";
        // String t2 = "poj";
        // t2 = t2 + t1;
        
        // char arr[] = s.toCharArray();
        
        // for(char ch : arr){
        //     System.out.print(ch + " ");
        // }
        // System.out.println();
        
        // //System.out.println(arr);
        
        // String num = String.valueOf(123);
        // System.out.println(num);
        
        // System.out.println(String.join("-", "a", "b", "c"));
        
        // System.out.println(t2);
        
        
        // String a = "abc";
        // String b = new String("abc");
        
        // System.out.println(a == b);
        // System.out.println(a.equals(b));
        
        // String x = "Abc";
        // String y = "aBc";
        
        // System.out.println(a.equalsIgnoreCase(b));
        
        // String str = "abcdefgh";
        
        // System.out.println(str.substring(2,5));
        
        // //substrings
        
        // String s2 = "abcd";
        
        // for(int i=0; i<s2.length(); i++){
        //     for(int j=i; j<s2.length(); j++){
        //         System.out.println(s.substring(i, j+1));
        //     }
        // }
        
        
        // String s = "abcdefg";
        // String t = "abcg";
        
        // System.out.println(s.startsWith(t));
        
        // boolean flag = true;
        
        // if(t.length() <= s.length()){
            
        //     for(int i=0; i<t.length(); i++){
                
        //         if(t.charAt(i) != s.charAt(i)){
        //             flag = false;
        //             break;
        //         }
        //     }
            
        //     System.out.println(flag);
            
        // }
        // else{
        //     System.out.println(false);
        // }
        
        
        String s = "abcd";
        
        //System.out.println(s.substring(1));
        
        //prefixes
        for(int i=0; i<s.length(); i++){
            
            System.out.println(s.substring(0,i+1));
        }
        
        //suffix
        for(int i=s.length()-1; i>=0; i--){
            System.out.println(s.substring(i));
        }
        
        String a = "stouabhabiabj";
        String b = "ab";
        
        System.out.println(a.lastIndexOf(b));
        System.out.println(a.indexOf(b));
        //System.out.println(a.contains(b));
        
        String x = "abcabada";
        
        System.out.println(x.replace("ab", "zu"));
        //System.out.println(x.replace('a', 'z'));
        //System.out.println(x.replaceFirst("a", "z"));
        
        String str = "    tuvstr     ";
        System.out.println(str.trim());
        
        String c = "abc";
        System.out.println(c.toUpperCase());
        
        String d = "AGH";
        System.out.println(d.toLowerCase());
	}
}