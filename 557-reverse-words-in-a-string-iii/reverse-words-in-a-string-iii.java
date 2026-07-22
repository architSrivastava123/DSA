class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String a = "";

        for (int i = 0; i < words.length; i++) {
            StringBuilder ad = new StringBuilder(words[i]);
            a += ad.reverse().toString();

            if (i != words.length - 1) {
                a += " ";
            }
        }

        return a;
    }
}