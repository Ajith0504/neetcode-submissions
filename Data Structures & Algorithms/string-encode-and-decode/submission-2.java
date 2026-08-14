class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder encode = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        if(strs.isEmpty()){
            return "";
        }

        for(String str : strs){
            sizes.add(str.length());
        }

        for(int size : sizes){
            encode.append(size).append(',');
        }
        encode.append('#');
        for(String str : strs){
            encode.append(str);
        }
        return encode.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        if(str.length() == 0){
            return new ArrayList<>();
        }
        int i = 0;
        while(str.charAt(i) != '#'){
            StringBuilder cur = new StringBuilder();
            while(str.charAt(i) != ','){
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for(int s : sizes){
            res.add(str.substring(i, i+s));
            i += s;
        }
        return res;
    }
}
