package utilities;

public class Subset {
    public void subset(int num, int n, int[] x){
        int i;
        for(i=1;i<=n;i++)
            x[i]=0;
        for(i=n;num!=0;i--) {
            x[i]=num%2;
            num=num/2;
        }
    }
}
