class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                x.append(ch);
            }
        }
        for(int i=x.length()-1;i>=0;i--)
        {
            y.append(x.charAt(i));
        }
        String x1 = x.toString();
        String y1 = y.toString();
        
        if(x1.equalsIgnoreCase(y1))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
