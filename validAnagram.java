class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> hm= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                
                int freq=hm.get(ch);
                hm.put(ch,freq+1);
            }else{
                hm.put(ch,1);
            }
            
        }
        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
            if(!hm.containsKey(ch)){
                return false;
            }
            int freq=hm.get(ch);
            hm.put(ch,freq-1);
            
            if(hm.get(ch)<0){
                return false;
            }
            
        }
        return true;
        
    }
}
