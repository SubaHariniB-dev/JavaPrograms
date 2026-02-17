import java.util.Scanner;
class longestsubarray{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
       
     int [] a={ 3,2,4,-2,4,1,1};
     
     int k=6;
     int start =0;
     int sum=0;
     int maxlength=0;
     for(int i=0;i<a.length;i++){
        sum=sum+a[i];
     
     while(sum>k){
        sum=sum-a[start];
        start++;
     }
     if(sum==k){   
        maxlength=i-start+1;
     }
     }
     System.out.println("maximum length:"+maxlength);

    }
}