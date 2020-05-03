import java.util.Scanner;
public class InsertionSort
{
    public static void main(String[] args)
    {
        int n;
        int temp;
        int j;
        System.out.print("Enter the size of array:-");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the Elements in your array:-");
        for(int i = 0 ;i<a.length ;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 1; i<a.length;i++)
        {
            temp = a[i];
            j = i;
            while(j>0 && a[j-1]>temp){
                a[j] = a[j-1];
                j = j-1;
            }
            a[j] = temp;

        }
        System.out.print("Sorted Elements :-");
        for( int i =0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }


    }

}
