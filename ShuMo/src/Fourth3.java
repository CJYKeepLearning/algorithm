import java.util.LinkedList;

public class Fourth3 {
    static int M;
    public static LinkedList<Integer> resi = new LinkedList<>();
    public static LinkedList<Integer> resn = new LinkedList<>();
    public static void main(String[] args) {
        int x=1,y=2,z=3;
        int a[] = new int[6];
        int b[] = new int[6];
        int a1=100;
        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++){
                for (int k=1;k<=3;k++){
                    for (int l=1;l<=3;l++){
                        for (int m=1;m<=3;m++){
                            for (int n=1;n<=3;n++){
                                a[0] = i;
                                a[1] = j;
                                a[2] = k;
                                a[3] = l;
                                a[4] = m;
                                a[5] = n;
                                int b1=0;
                                for (int i1=0;i1<=4;i1++){
                                    if (a[i1]==1 && a[i1+1]==1) b1+=7;
                                    if (a[i1]==1 && a[i1+1]==2) b1+=6;
                                    if (a[i1]==1 && a[i1+1]==3) b1+=5;
                                    if (a[i1]==2 && a[i1+1]==1) b1+=7;
                                    if (a[i1]==2 && a[i1+1]==2) b1+=6;
                                    if (a[i1]==2 && a[i1+1]==3) b1+=7;
                                    if (a[i1]==3 && a[i1+1]==1) b1+=7;
                                    if (a[i1]==3 && a[i1+1]==2) b1+=8;
                                    if (a[i1]==3 && a[i1+1]==3) b1+=9;
                                }
                                if (a[0]==1 && a[5]==1) b1+=21;
                                if (a[0]==1 && a[5]==2) b1+=20;
                                if (a[0]==1 && a[5]==3) b1+=19;
                                if (a[0]==2 && a[5]==1) b1+=20;
                                if (a[0]==2 && a[5]==2) b1+=19;
                                if (a[0]==2 && a[5]==3) b1+=18;
                                if (a[0]==3 && a[5]==1) b1+=19;
                                if (a[0]==3 && a[5]==2) b1+=18;
                                if (a[0]==3 && a[5]==3) b1+=17;
                                if(b1==48){
                                    M++;
                                    resi.add(i);

                                    resn.add(n);
                                }
                                if(a1>b1)for(int h=0;h<=5;b[h]=a[h++]);
                                a1=a1>b1?b1:a1;
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("最少空载数%d\n",a1);
        for(int i=0;i<=5; System.out.printf(" %d ",b[i++]));
        System.out.println(
        );
        System.out.println("共有"+M+"种情况");
        System.out.print("周一开始为：");
        for (int l:resi
             ) {
            System.out.print(l+" ");
        }
        System.out.println();
        System.out.print("周五结束为：");
        for (int l:resn
        ) {
            System.out.print(l+" ");
        }
    }
}
