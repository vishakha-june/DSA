class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            if(hm.containsKey(ch)){
                int freq=hm.get(ch);
                hm.put(ch,freq+1);
            }else{
                hm.put(ch,1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch= ransomNote.charAt(i);
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
