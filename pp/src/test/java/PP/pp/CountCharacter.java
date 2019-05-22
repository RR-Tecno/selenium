package PP.pp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountCharacter {

	public static void main(String[] args) {
		
		 String s="HELLO";
        char[] ch=s.toCharArray();
        //converting to array
       
        Map<Character, Integer>map=new LinkedHashMap<Character, Integer>();
        for(int i=0; i<ch.length; i++) {
           
           
            if(map.containsKey(ch[i])) {
                Integer count=map.get(ch[i]);
                map.put(ch[i], ++count);
            }
            else {
                map.put(ch[i], 1);
            }
}
        Set<Entry<Character, Integer>> set=map.entrySet();
        for(Entry<Character, Integer> x:set) {
            System.out.println(x.getKey()+"="+x.getValue());
        }
	
	
	}
}