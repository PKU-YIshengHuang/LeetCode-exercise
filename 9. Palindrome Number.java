public class Solution {
    public boolean isPalindrome(int x) {
        //int flag = 1;
        int k = 1;
        int savex = x; 
        int Pnum = 0;
        if(x<0){  //С��0�����ز��ǻ���
            return false;
        //    flag = -1;
         //   temp = -x;
        }
        while(x != 0){     //��һ���������ù�������ȡ��λ����ȥʮλ�����򣬾�ֱ����append() + parseInt(String s)
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