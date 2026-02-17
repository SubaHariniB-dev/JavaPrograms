import java.util.Scanner;
class secondlargest{
    public static void main(String[] args){
        int [] a={1,2,3,4,5,7};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                smax=max;
                max=a[i];

            }
            else if(a[i]>smax && a[i]!=max){
                smax=a[i];
            }
        }
        System.out.println("second maximum:"+smax);
    }
}