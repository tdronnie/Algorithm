class Solution
{
    public int solution(int n, int a, int b)
    {
        int count = 1;
        while(true){
            a = (a+1)/2;
            b = (b+1)/2;
            
            if(a == b) break;
            
            count++;          
        }
        
        return count;
    }
}