import java.util.Scanner;
 
public class RemoveArrayElement {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n; int i=0;
         System.out.print("Enter no. of elements you want in array:");
        n = in.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter all the elements:");
        for( i = 0; i < n; i++){
            a[i]=in.nextInt();
            System.out.print(a[i]+"\t");
            
        }
        System.out.println();
        
        System.out.println("Enter index of element to be deleted: ");
        int element = in.nextInt();
        
        for(i = 0; i < a.length; i++){
            if(i == element){
                // shift elements to the left
                for(int j = i; j < a.length - 1; j++){
                    a[j] = a[j+1];
                }
                break;
            }
        }
        
        System.out.println("Array elements after deletion-- " );
        for( i = 0; i < a.length-1; i++){
            System.out.print(" " + a[i]);
        }  
 
    }
}
        
    }
