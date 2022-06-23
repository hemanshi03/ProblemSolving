import java.util.Scanner;

public class KadenceAlgo{

    public static int MaxPositiveConsecutiveArray(int[] arr)
    {
        if(arr.length==0)
            return 0;

        int max_here = arr[0];
        int max_so_far = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            max_here = Math.max(arr[i], max_here+arr[i]);
            max_so_far = Math.max(max_so_far, max_here);
        }
        return max_so_far;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();

    System.out.println(MaxPositiveConsecutiveArray(arr));
}
}