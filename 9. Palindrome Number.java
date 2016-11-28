public class Solution {
    public boolean isPalindrome(int x) {
        //int flag = 1;
        int k = 1;
        int savex = x; 
        int Pnum = 0;
        if(x<0){  //小于0的数必不是回文
            return false;
        //    flag = -1;
         //   temp = -x;
        }
        while(x != 0){     //将一个整数倒置过来：先取个位，再去十位；正序，就直接用append() + parseInt(String s)
            k = x%10;
            Pnum = Pnum*10+k;
            x = x/10;
        }
        //Pnum = Pnum*flag;
        if(Pnum==savex)
            return true;    
        return false;
    }
}