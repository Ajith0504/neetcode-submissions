class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] charArray1 = s.toCharArray();
        // //Arrays.sort(charArray1); 
        // char[] charArray2 = t.toCharArray();
        // //Arrays.sort(charArray2);
        // int sum1 = 0, sum2 = 0;
        // if(charArray1.length != charArray2.length)
        //     return false;

        // for(int i = 0; i < charArray1.length; i++){
        //         sum1 = sum1 + charArray1[i];
        //         sum2 = sum2 + charArray2[i];
                
        // }
                
        // if(sum1 != sum2)
        //     return false;
        // else
        //     return true;

        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for( int i = 0; i < s.length(); i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);
    }
}
