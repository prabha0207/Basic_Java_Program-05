import java.util.*;
import java.lang.*;
 class Fc
 {
    public static void main(String args[]){   
        int fc=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            fc=fc*i;
        }
        System.out.println(fc);
    }
}
