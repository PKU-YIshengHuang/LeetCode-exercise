class Solution {
    public int myAtoi(String str) {
        if (str.length()==0) //�ų���һλ�ǿմ������
            return 0;
        if(str.equals("0"))
            return 0;
        String[] s = str.split("\\s+");
        //System.out.println("s0 = "+s[0]);
        //System.out.println("s1 = "+s[1]);
       // split �޷���ȷ�г�ǰ����пո��������Ὣ�ո�洢����һ���ַ����С�
        if (!s[0].isEmpty())
        	str = s[0];
        else
        	str = s[1];
        System.out.println("str = "+str);
        char[] c = str.toCharArray();
        for(int i = 0; i<c.length; i++){
            if(i==0){
                if(c[0]=='+'){  //��ȥ������
                    String str1 = new String(c,1,c.length-1); 
                    str = str1;
                    continue;
                }
                if((c[0]!='-')&&(c[0]<'0'||c[0]>'9'))//��ȥ��һλ����ĸ�����
                    return 0;
            }
            else                    //�ڶ�λ�Լ��Ժ�����
                if(c[i]<'0'||c[i]>'9')
                    return 0;
        }
        if(str.length()==0||str.equals("-")) //�жϳ�ȥ�����ŵĴ��Ƿ��ǿմ����Լ�ֻ��һ�����ţ�-�����ַ���
            return 0;
        double temp = Double.parseDouble(str);
        if(temp<Integer.MAX_VALUE && temp>Integer.MAX_VALUE)
            return 0;
        return (int)temp;
    }
}