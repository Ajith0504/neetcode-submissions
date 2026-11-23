class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        
        for(String str : strs){
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String sorted1 = new String(chArr);

            group.putIfAbsent(sorted1, new ArrayList<>());
            
            group.get(sorted1).add(str);

        }

        return new ArrayList<>(group.values());
    }
}
