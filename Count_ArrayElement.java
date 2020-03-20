import java.util.Scanner;
public class Count_ArrayElement 
{
    public static void main(String[] args) 
    {
        int n, pos, x;  int count=0; int i=0; 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array:");
         n=s.nextInt();
         
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        
        for( i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            System.out.print(a[i]+" ");
            
        }
        
        System.out.println("enter searching element");
        int ele=s.nextInt();
        for( i = 0; i <n; i++)
        {
            if(ele==a[i]){
                count++;
                
            }
        
        }
        
        System.out.println("count="+count);
                           
    }
}