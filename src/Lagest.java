import java.util.Arrays;
import java.util.Scanner;

public class Lagest {
    public static int SecondLargest(int[] Array)
    {
        Arrays.sort(Array);
        int max=Array[Array.length-1];
        for(int i=Array.length-1;i>=0;i--)
        {
            if(Array[i]<max)
            {
                return Array[i];
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        System.out.println("Enter the size : ");
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int[] Array=new int[size];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<size;i++)
        {
            Array[i]=scan.nextInt();
        }
        System.out.println(SecondLargest(Array));
    }
}
