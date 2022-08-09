public class SecondLargest {

    public static void main(String[] args) {

        //unsorted array
        int num[] = {1, 9, 5, 2, 8, -1, 3, 55};

        //Length of an array
        int length = num.length;

        //Sort the array
        Arrays.sort(num);

        /**
         * After sorting
         * Second highest number is at n-2 position
         */
        System.out.println("Second Highest Number: "+num[n-2]);

    }

}
//import java.util.*;
//class SecondLargest{
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//
//        int n=sc.nextInt();
//        int a[]=new int[n];
//
//        for(int i=0;i<n;i++)
//            a[i]=sc.nextInt();
//
//        Arrays.sort(a);
//        System.out.print("The second largest number: "+a[n-2]);
//    }
//}