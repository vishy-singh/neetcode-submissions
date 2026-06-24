class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap();


        for(int i =0; i<nums.length; i++){
                int co = map.getOrDefault(nums[i],0);
                co++;


            map.put(nums[i], co);
        }

        int [] val = new int [k];


        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(map.entrySet());

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }

        return result;
        
    }
}
