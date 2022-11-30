import java.util.*; 
public class binarysearch
{
    public static int count=0; //just used for comparision purpose
    public static int search (int []arr ,int x)
    {
        int li =0 ;
        int ri=arr.length-1 ;
        
        while(li<=ri)
        {
            count ++;
            int mid = (li+ri)/2;
            // System.out.println(mid);
            if (arr[mid]==x)
            {
                return (mid);
            }
            // search in left
            else if (arr[mid]>x)
            {
                ri=mid-1;
            }
            // search in right
            else if (arr[mid]<x)
            {
                li=mid+1;
            }
        }
        return -1;
    } 
    public static void main (String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int [] arr = new int[n];
        for(int mid=0 ; mid < arr.length; mid++)
        {
            arr[mid]= scn.nextInt();
        }
        int ans = search(arr,x);
        System.out.println(ans);
        System.out.println("count is :"+ count);  //just used to compare between linear and binary search that whic is faster
        // int [] arr=   {4,6,8,10,12,14,16,18,20,22,24};
        // int x = 8;
        // int ans = search(arr,x);
        // System.out.println(ans);
     }
}