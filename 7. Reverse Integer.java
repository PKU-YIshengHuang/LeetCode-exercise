public class Solution {
    public int reverse(int x) {
        long Rint = 0;
        int flag = x; 
        int index = 0,k=0;
        while(flag!=0){
            flag = flag /10;
            index++;
        }
        if(x ==0)
            return 0;
        for(int i = 0;i<index;i++){
            k = x%10;
            Rint = Rint*10+k;
            x = x/10;
        } 
        if (Rint>Integer.MAX_VALUE||Rint<Integer.MIN_VALUE)
            return 0;
        return (int)Rint;
    }
}
