class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int [] count = new int[26];

        char [] tempchars = s.toCharArray();
        char [] tempchart = t.toCharArray();


        for(int i=0; i<tempchars.length; i++){

            int temps = tempchars[i]-'a';
               int tempt = tempchart[i]-'a';

            count[temps]++;
            count[tempt]--;
        }


        for(int n :count){
            if(n !=0){
                return false;
            }
        }

        return true;

    }
}
