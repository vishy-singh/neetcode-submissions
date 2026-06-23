class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap();


        for(String str : strs){

            char [] ch = str.toCharArray();
            Arrays.sort(ch);

            String sorted = new String(ch);

            if(map.containsKey(sorted)){

                List<String> list = map.get(sorted);
                list.add(str);

                map.put(sorted,list);
            }else {
                 List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sorted, list);
}
        }
        return new ArrayList<>(map.values()); 
    }
}
