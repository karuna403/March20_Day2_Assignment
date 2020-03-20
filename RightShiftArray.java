import java.util.Scanner;
 public class RightShiftArray
{
  public static void main(String[]mari)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int size = scan.nextInt();
    int[]arr = new int[size];
    
    System.out.print("Enter the elements of array: ");
    for(int i = 0; i < size; i++)
    {
      arr[i]=scan.nextInt();
    }
    System.out.print("Enter number of times to be shifted: ");
    int shift = scan.nextInt();
    int[] temp = new int[size];
    int j = 0;
    
    while(shift >= size)
    {
      shift = shift - size;
    }
    for(int i = 0; i < size; i++)
    {
      if(size - shift + i >= size)
      {
        temp[i] = arr[j];
        j = j + 1;
      }
      else
      {
        temp[i] = arr[size - shift + i];
      }
    }
    System.out.print("The shifted array is: ");
    for(int i = 0; i < size; i++)
    {
      System.out.print(temp[i]+" ");
    }
    System.out.println();
  }
}
