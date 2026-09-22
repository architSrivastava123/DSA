class Solution {
    public int romanToInt(String s) {
        int vasl =0;
        int sum =0;
        for(int i =0; i<s.length(); i++){
            vasl = value(s.charAt(i));
            if( i+1 < s.length() && vasl < value(s.charAt(i+1))){
                sum -= vasl;
            }
            else{
                sum+= vasl; 
            }
        }
        return sum;
    }
    private int value(char s){
        switch (s){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}