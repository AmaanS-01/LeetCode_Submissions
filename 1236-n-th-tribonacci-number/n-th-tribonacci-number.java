class Solution {
    public int tribonacci(int n) {
        int a=0;
        int b=1;
        int c=1;
        int sum=0;
        if(n>3){
            for(int i=3;i<=n;i++){
                sum=a+b+c;
                a=b;
                b=c;
                c=sum;
            }
        }
        else if(n<=3&&n>0){
            if(n==3)return 2;
            if(n==2)return 1;
            else return 1;
        }
        return sum;
    }
}