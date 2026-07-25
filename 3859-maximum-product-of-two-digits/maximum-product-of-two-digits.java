class Solution {
    public int maxProduct(int n) {
        int sum =0;
        int max =0;
        int m = n;
        int i =0 ,j =0;
        while(m!=0){
            int digit = m%10;
            m=m/10;
            i++;
        }
        if(i==1){
            return n;
        }
        int arr[] = new int[i];
        while(n!=0){
            int digit = n%10;
            n = n/10;
            arr[j] = digit;
            j++;
        }
        for(int a = 0 ; a<arr.length;a++){
            for(int aa = a+1 ; aa<arr.length ; aa++){
                sum = arr[a]*arr[aa];
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}